package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import templates.EstadoSiguienteJuego;

import java.io.IOException;

@ExtendWith(MockitoExtension.class)
public class ControladorIniciarJuegoTest {
    @InjectMocks
    private ControladorIniciarJuego iniciarJuego;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher dispatcher;

    @BeforeEach
    public void setUp () {
        iniciarJuego.init();
        Mockito.when(request.getRequestDispatcher("logicaJuego.jsp")).thenReturn(dispatcher);
        Mockito.when(request.getSession()).thenReturn(session);
    }

    @Test
    public void doGetTest() throws ServletException, IOException {
        String nombreJugador = "Neo";
        Mockito.when(request.getParameter("nombreJugador")).thenReturn(nombreJugador);

        iniciarJuego.doGet(request, response);

        Mockito.verify(session).setAttribute("nombreJugador", nombreJugador);

        ArgumentCaptor<EstadoSiguienteJuego> captor = ArgumentCaptor.forClass(EstadoSiguienteJuego.class);
        Mockito.verify(request).setAttribute(Mockito.eq("respuesta"), captor.capture());

        EstadoSiguienteJuego estadoSiguienteJuego = captor.getValue();
        Assertions.assertEquals(" te han mentido mucho tiempo. Aceptas el desafío para descubrir la verdad?", estadoSiguienteJuego.getEncabezadoPagina());
        Assertions.assertEquals("Morfeo tiene para ti las siguientes píldoras:", estadoSiguienteJuego.getLeyendaPagina());
        Assertions.assertEquals("Pildora Azul: conocer la verdad.", estadoSiguienteJuego.getOpcionSi());
        Assertions.assertEquals("Pildora roja: seguir en la mentira.", estadoSiguienteJuego.getOpcionNo());
        Mockito.verify(dispatcher).forward(request,response);
    }
}

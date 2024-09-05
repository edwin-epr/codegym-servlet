package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.MotorDecisiones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import templates.EstadoSiguienteJuego;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ControladorDesafioTest {

    @InjectMocks
    private ControladorDesafio controladorDesafio;

    @Mock
    private MotorDecisiones motorDecisiones;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private RequestDispatcher dispatcher;

    @BeforeEach
    public void configuracionInicial() throws ServletException {
        when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
        controladorDesafio.init();
    }

    @Test
    public void testDoPostDesafioAceptadoTrue() throws ServletException, IOException {
        // Preparar los mocks
        when(request.getParameter("decisionTomada")).thenReturn("true");

        EstadoSiguienteJuego estadoSiguiente = new EstadoSiguienteJuego("  estás apunto de conocer un gran secreto!",
                "Quiéres ir a platicar con el Oráculo?",
                "Ir a hablar con el Oráculo.",
                "No quiero conocer al Oráculo.");

        // Ejecutar el método
        controladorDesafio.doPost(request, response);

        // Verificar que se realizó la redirección y se setearon los atributos correctamente
        verify(request).setAttribute(eq("respuesta"), eq(estadoSiguiente));
        verify(request).getRequestDispatcher("logicaJuego.jsp");
        verify(dispatcher).forward(request, response);
    }

    @Test
    public void testDoPostDesafioAceptadoFalse() throws ServletException, IOException {
        // Preparar los mocks
        when(request.getParameter("decisionTomada")).thenReturn("false");

        EstadoSiguienteJuego estadoSiguiente = new EstadoSiguienteJuego(" ha escogido la píldora roja!",
                "Seguirás encerrado en la Matrix.");

        // Ejecutar el método
        controladorDesafio.doPost(request, response);

        // Verificar que se realizó la redirección y se setearon los atributos correctamente
        verify(request).setAttribute(eq("respuesta"), eq(estadoSiguiente));
        verify(request).getRequestDispatcher("logicaFinJuego.jsp");
        verify(dispatcher).forward(request, response);
    }
}

package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.MotorDecisiones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import templates.EstadoSiguienteJuego;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    private RequestDispatcher requestDispatcher;

    @BeforeEach
    public void configuracionInicial() throws ServletException {
        MockitoAnnotations.openMocks(this);
        controladorDesafio.init();
    }

    @Test
    public void testDoPostDesafioAceptadoTrue() throws ServletException, IOException {
        // Preparar los mocks
        when(request.getParameter("decisionTomada")).thenReturn("true");

        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego("  estás apunto de conocer un gran secreto!",
                "Quiéres ir a platicar con el Oráculo?",
                "Ir a hablar con el Oráculo.",
                "No quiero conocer al Oráculo.");
        when(motorDecisiones.procesarEleccion(true)).thenReturn(estadoSiguienteEsperado);
        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);

        // Ejecutar el método
        controladorDesafio.doPost(request, response);

        // Verificar que se realizó la redirección y se setearon los atributos correctamente
        verify(request).setAttribute("respuesta", estadoSiguienteEsperado);
        verify(request).getRequestDispatcher("logicaJuego.jsp");
        verify(request.getRequestDispatcher("logicaJuego.jsp")).forward(request, response);
    }
}

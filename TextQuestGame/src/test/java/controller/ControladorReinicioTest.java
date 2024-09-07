package controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

@ExtendWith(MockitoExtension.class)
public class ControladorReinicioTest {
    @InjectMocks
    private ControladorReinicio controladorReinicio;

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Test
    public void testDoGet() throws IOException {
        controladorReinicio.doGet(request, response);

        Mockito.verify(response).sendRedirect("index.jsp");
    }
}

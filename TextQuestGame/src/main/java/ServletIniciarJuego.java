import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ServletIniciarJuego")
public class ServletIniciarJuego extends HttpServlet {
    public void init() {
        System.out.println("Servlet de inicio del juego creado.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.sendRedirect("logicaJuego.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

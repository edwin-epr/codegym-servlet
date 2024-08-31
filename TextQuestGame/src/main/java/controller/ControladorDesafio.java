package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/desafio")
public class ControladorDesafio extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet de desafio ha iniciado sin errores...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        boolean desafioAceptado = Boolean.parseBoolean(req.getParameter("decisionTomada"));

        try {
            if (desafioAceptado) {
                req.getRequestDispatcher("logicaJuego.jsp").forward(req, resp);
            } else {
                req.getSession().setAttribute("mensajeEncabezado", " ha tomado una decisión:");
                req.getSession().setAttribute("mensajeEstado", "Ha rechazado el desafío");
                resp.sendRedirect("logicaFinJuego.jsp");
            }
        } catch (IOException | ServletException exception) {
            throw new RuntimeException(exception);
        }

    }
}

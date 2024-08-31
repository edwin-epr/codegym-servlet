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
                req.setAttribute("mensajeEncabezado", " ha tomado una decisión:");
                req.setAttribute("mensajeEstado", "Ha rechazado el desafío");
                req.getRequestDispatcher("logicaFinJuego.jsp").forward(req,resp);
            }
        } catch (IOException | ServletException exception) {
            throw new RuntimeException(exception);
        }

    }
}

package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import templates.EstadoSiguienteJuego;

import java.io.IOException;

@WebServlet("/iniciarjuego")
public class ControladorIniciarJuego extends HttpServlet {
    public void init() {
        System.out.println("Servlet de inicio del juego creado.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String nombreJugador = req.getParameter("nombreJugador");
        EstadoSiguienteJuego paginaInicialJuego = new EstadoSiguienteJuego(
                " te han mentido mucho tiempo. Aceptas el desafío para descubrir la verdad?",
                "Morfeo tiene para ti las siguientes píldoras:",
                "Pildora Azul: conocer la verdad.",
                "Pildora roja: seguir en la mentira."
        );
        req.setAttribute("respuesta", paginaInicialJuego);
        req.getSession().setAttribute("nombreJugador", nombreJugador);
        try {
            req.getRequestDispatcher("logicaJuego.jsp").forward(req,resp);
        } catch (IOException | ServletException e) {
            throw new RuntimeException(e);
        }
    }
}

package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.MotorDecisiones;
import templates.EstadoSiguienteJuego;

import java.io.IOException;

@WebServlet("/desafio")
public class ControladorDesafio extends HttpServlet {

    private MotorDecisiones procesadorElecciones;

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet de desafio ha iniciado sin errores...");
        procesadorElecciones = new MotorDecisiones();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        boolean desafioAceptado = Boolean.parseBoolean(req.getParameter("decisionTomada"));
        EstadoSiguienteJuego estadoSiguiente = procesadorElecciones.procesarEleccion(desafioAceptado);
        try {
            req.setAttribute("respuesta", estadoSiguiente);
            req.getRequestDispatcher(estadoSiguiente.getRederigirA()).forward(req,resp);
        } catch (IOException | ServletException exception) {
            throw new RuntimeException(exception);
        }

    }
}

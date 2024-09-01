package model;

import templates.EstadoSiguienteJuego;

public class MotorDecisiones {

    private int contadorContinuar;

    public MotorDecisiones() {
        contadorContinuar = 0;
    }

    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" ha tomado una decisión:",
                    "Ha rechazado el desafío.");
        }
        contadorContinuar++;
        if (contadorContinuar == 1) {
            return new EstadoSiguienteJuego(" has aceptado el desafío.",
                    "Quieres subir al puente del capitan?",
                    "Subir al puente.",
                    "No subir al puente.");
        }
        return null;
    }
}

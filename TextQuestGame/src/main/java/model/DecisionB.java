package model;

import templates.EstadoSiguienteJuego;

public class DecisionB implements Regla {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" te han devuelto a la Matrix!",
                    "Te has rehusado a salir de ella.");
        } else {
            return new EstadoSiguienteJuego(" has subido al puente.",
                    "Qué es lo que quieres?",
                    "Descubrir la verdad y salir de la matrix.",
                    "Seguir en la matrix.");
        }
    }
}

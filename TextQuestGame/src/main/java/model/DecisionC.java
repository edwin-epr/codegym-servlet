package model;

import templates.EstadoSiguienteJuego;

public class DecisionC implements Regla {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" te han regresado a la Matrix!",
                    "Has querido mentir a la resistencia.");
        } else {
            return new EstadoSiguienteJuego(" has logrado salir de la Matrix!",
                    "Bienvenido al mundo real!");
        }
    }
}

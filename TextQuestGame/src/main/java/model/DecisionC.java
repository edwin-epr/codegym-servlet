package model;

import templates.EstadoSiguienteJuego;

public class DecisionC implements Decision {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" has quedado atrapado en la Matrix!",
                    "Por querer traicionar a la resistencia.");
        } else {
            return new EstadoSiguienteJuego(" has escapado de la Matrix!",
                    "Bienvenido al mundo real!");
        }
    }
}

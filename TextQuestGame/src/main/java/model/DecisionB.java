package model;

import templates.EstadoSiguienteJuego;

public class DecisionB implements Decision {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" te han devuelto a la Matrix!",
                    "Te has dejado engañar por el agente Smith.");
        } else {
            return new EstadoSiguienteJuego(", la Oráculo te ha informado de todo!",
                    "Qué es lo que quieres hacer?",
                    "Contar la verdad y vivir en la realidad.",
                    "Ocultar la verdad y seguir en la matrix.");
        }
    }
}

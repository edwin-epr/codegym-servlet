package model;

import templates.EstadoSiguienteJuego;

public class DecisionA implements Decision {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" ha escogido la píldora roja!",
                    "Seguirás encerrado en la Matrix.");
        } else {
            return new EstadoSiguienteJuego("  estás apunto de conocer un gran secreto!",
                    "Quiéres ir a platicar con el Oráculo?",
                    "Ir a hablar con el Oráculo.",
                    "No quiero conocer al Oráculo.");
        }
    }
}

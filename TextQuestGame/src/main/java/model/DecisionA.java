package model;

import templates.EstadoSiguienteJuego;

public class DecisionA implements Regla {
    @Override
    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        if (!eleccion) {
            return new EstadoSiguienteJuego(" ha tomado una decisión:",
                    "Ha escogido la pildora roja. Seguirás en la Matrix.");
        } else {
            return new EstadoSiguienteJuego(" has aceptado el desafío.",
                    "Quieres subir a la oficina de Morfeo?",
                    "Subir a hablar con Morfeo.",
                    "No platicar con Morfeo.");
        }
    }
}

package model;

import templates.EstadoSiguienteJuego;

import java.util.HashMap;
import java.util.Map;

public class MotorDecisiones {

    private int pasoActual;
    private Map<Integer, Regla> decisionMap;

    public MotorDecisiones() {
        pasoActual = 0;
        decisionMap = new HashMap<>();
        decisionMap.put(0, new DecisionA());
        decisionMap.put(1, new DecisionB());
        decisionMap.put(2, new DecisionC());
    }

    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        Regla reglaActual = decisionMap.get(pasoActual);
        if (reglaActual != null) {
            EstadoSiguienteJuego resultado = reglaActual.procesarEleccion(eleccion);
            if (!resultado.getEsEstadoFinJuego()) {
                pasoActual++;
            } else {
                // Reiniciamos el juego si es un estado final
                pasoActual = 0;
            }
//            if (eleccion) {
//                if (pasoActual != 2) {
//                    pasoActual++;
//                } else {
//                    pasoActual = 0;
//                }
//            } else {
//                pasoActual= 0;
//            }
            return resultado;
        }
//        if (pasoActual == 0) {
//            if (!eleccion) {
//                return new EstadoSiguienteJuego(" ha tomado una decisión:",
//                        "Ha escogido la pildora roja. Seguirás en la Matrix.");
//            } else {
//                pasoActual++;
//                return new EstadoSiguienteJuego(" has aceptado el desafío.",
//                        "Quieres subir a la oficina de Morfeo?",
//                        "Subir a hablar con Morfeo.",
//                        "No platicar con Morfeo.");
//            }
//        }
//        if (pasoActual == 1) {
//            if (!eleccion) {
//                pasoActual = 0;
//                return new EstadoSiguienteJuego(" te han devuelto a la Matrix!",
//                        "Te has rehusado a salir de ella.");
//            } else {
//                pasoActual++;
//                return new EstadoSiguienteJuego(" has subido al puente.",
//                        "Qué es lo que quieres?",
//                        "Descubrir la verdad y salir de la matrix.",
//                        "Seguir en la matrix.");
//            }
//        }
//        if (pasoActual == 2) {
//            if (!eleccion) {
//                pasoActual = 0;
//                return new EstadoSiguienteJuego(" te han regresado a la Matrix!",
//                        "Has querido mentir a la resistencia.");
//            } else {
//                pasoActual = 0;
//                return new EstadoSiguienteJuego(" has logrado salir de la Matrix!",
//                        "Bienvenido al mundo real!");
//            }
//        }
        return new EstadoSiguienteJuego(" error error!",
                "Algo salió mal.");
    }
}

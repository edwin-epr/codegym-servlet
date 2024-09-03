package model;

import templates.EstadoSiguienteJuego;

import java.util.HashMap;
import java.util.Map;

public class MotorDecisiones {

    private int pasoActual;
    private Map<Integer, Decision> decisionMap;

    public MotorDecisiones() {
        pasoActual = 0;
        decisionMap = new HashMap<>();
        decisionMap.put(0, new DecisionA());
        decisionMap.put(1, new DecisionB());
        decisionMap.put(2, new DecisionC());
    }

    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        Decision reglaActual = decisionMap.get(pasoActual);
        if (reglaActual != null) {
            EstadoSiguienteJuego resultado = reglaActual.procesarEleccion(eleccion);
            if (!resultado.getEsFinJuego()) {
                pasoActual++;
            } else {
                // Reiniciamos el juego si es un estado final
                pasoActual = 0;
            }
            return resultado;
        }
        return new EstadoSiguienteJuego(" Error! Error!",
                "Algo salió mal.");
    }
}

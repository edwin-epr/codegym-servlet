package model;

import templates.EstadoSiguienteJuego;

import java.util.HashMap;
import java.util.Map;

public class MotorDecisiones {

    private int estadoActual;
    private Map<Integer, Decision> decisionMap;

    public MotorDecisiones() {
        estadoActual = 0;
        decisionMap = new HashMap<>();
        decisionMap.put(0, new DecisionA());
        decisionMap.put(1, new DecisionB());
        decisionMap.put(2, new DecisionC());
    }

    void setEstadoActual(int estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getEstadoActual() {
        return estadoActual;
    }

    public EstadoSiguienteJuego procesarEleccion(boolean eleccion) {
        Decision reglaActual = decisionMap.get(estadoActual);
        if (reglaActual != null) {
            EstadoSiguienteJuego resultado = reglaActual.procesarEleccion(eleccion);
            if (!resultado.getEsFinJuego()) {
                estadoActual++;
            } else {
                // Reiniciamos el juego si es un estado final
                estadoActual = 0;
            }
            return resultado;
        }
        return new EstadoSiguienteJuego(" Error! Error!",
                "Paso actual no definido en motor de decisiones.");
    }
}

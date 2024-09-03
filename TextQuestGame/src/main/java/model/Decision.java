package model;

import templates.EstadoSiguienteJuego;

public interface Decision {
    EstadoSiguienteJuego procesarEleccion(boolean eleccion);
}

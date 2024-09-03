package model;

import templates.EstadoSiguienteJuego;

public interface Regla {
    EstadoSiguienteJuego procesarEleccion(boolean eleccion);
}

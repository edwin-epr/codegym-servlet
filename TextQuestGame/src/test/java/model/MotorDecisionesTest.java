package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import templates.EstadoSiguienteJuego;

public class MotorDecisionesTest {
    private MotorDecisiones motorDecisiones = new MotorDecisiones();

    @Test
    public void elegirEstadoCeroFalse() {
        // given
        motorDecisiones.setEstadoActual(0);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(" ha escogido la píldora roja!",
                "Seguirás encerrado en la Matrix.");
        int pasoActualEsperado = 0;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(false);
        int pasoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(pasoActualEsperado,pasoActualObtenido);
    }

    @Test
    public void elegirEstadoCeroTrue() {
        // given
        motorDecisiones.setEstadoActual(0);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego("  estás apunto de conocer un gran secreto!",
                "Quiéres ir a platicar con el Oráculo?",
                "Ir a hablar con el Oráculo.",
                "No quiero conocer al Oráculo.");
        int pasoActualEsperado = 1;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(true);
        int pasoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(pasoActualEsperado,pasoActualObtenido);
    }

    @Test
    public void elegirEstadoUnoFalse() {
        // given
        motorDecisiones.setEstadoActual(1);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(" te han devuelto a la Matrix!",
                "Te has dejado engañar por el agente Smith.");
        int pasoActualEsperado = 0;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(false);
        int pasoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(pasoActualEsperado,pasoActualObtenido);
    }

    @Test
    public void elegirEstadoUnoTrue() {
        // given
        motorDecisiones.setEstadoActual(1);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(", la Oráculo te ha informado de todo!",
                "Qué es lo que quieres hacer?",
                "Contar la verdad y vivir en la realidad.",
                "Ocultar la verdad y seguir en la matrix.");
        int pasoActualEsperado = 2;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(true);
        int pasoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(pasoActualEsperado,pasoActualObtenido);
    }

    @Test
    public void elegirEstadoDosFalse() {
        // given
        motorDecisiones.setEstadoActual(2);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(" has quedado atrapado en la Matrix!",
                "Por querer traicionar a la resistencia.");
        int pasoActualEsperado = 0;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(false);
        int pasoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(pasoActualEsperado,pasoActualObtenido);
    }

    @Test
    public void elegirEstadoDosTrue() {
        // given
        motorDecisiones.setEstadoActual(2);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(" has escapado de la Matrix!",
                "Bienvenido al mundo real!");
        int estadoActualEsperado = 0;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(true);
        int estadoActualObtenido = motorDecisiones.getEstadoActual();
        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(estadoActualEsperado, estadoActualObtenido);
    }

    @Test
    public void pasoActualNoDefinido() {
        // given
        motorDecisiones.setEstadoActual(3);
        EstadoSiguienteJuego estadoSiguienteEsperado = new EstadoSiguienteJuego(" Error! Error!",
                "Paso actual no definido en motor de decisiones.");
        int estadoActualEsperado = 3;

        // when
        EstadoSiguienteJuego estadoSiguienteObtenido = motorDecisiones.procesarEleccion(Mockito.anyBoolean());
        int estadoActualObtenido = motorDecisiones.getEstadoActual();

        // then
        Assertions.assertEquals(estadoSiguienteEsperado.getRedirigirA(),
                estadoSiguienteObtenido.getRedirigirA());
        Assertions.assertEquals(estadoSiguienteEsperado.getEncabezadoPagina(),
                estadoSiguienteObtenido.getEncabezadoPagina());
        Assertions.assertEquals(estadoActualEsperado,estadoActualObtenido);
    }
}

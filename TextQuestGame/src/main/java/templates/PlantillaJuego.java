package templates;

import java.util.Map;

public class PlantillaJuego {
    private String encabezadoPagina;
    private String leyendaPagina;
    private boolean opcionEscogida;
    private String opcionSi;
    private String OpcionNo;

    private Map<String, PlantillaJuego> reglasDecisiones;

    public PlantillaJuego(String encabezadoPagina, String leyendaPagina, boolean opcionEscogida, String opcionSi, String opcionNo) {
        this.encabezadoPagina = encabezadoPagina;
        this.leyendaPagina = leyendaPagina;
        this.opcionEscogida = opcionEscogida;
        this.opcionSi = opcionSi;
        OpcionNo = opcionNo;
    }

    @Override
    public String toString() {
        return "PlantillaJuego{" +
                "encabezadoPagina='" + encabezadoPagina + '\'' +
                ", leyendaPagina='" + leyendaPagina + '\'' +
                ", opcionEscogida=" + opcionEscogida +
                ", opcionSi='" + opcionSi + '\'' +
                ", OpcionNo='" + OpcionNo + '\'' +
                '}';
    }
}

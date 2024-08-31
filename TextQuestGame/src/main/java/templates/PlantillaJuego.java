package templates;

import java.util.Map;

public class PlantillaJuego {
    private String encabezadoPagina;
    private String leyendaPagina;
    private boolean opcionEscogida;
    private String opcionSi;
    private String opcionNo;

    private Map<String, PlantillaJuego> reglasDecisiones;

    public PlantillaJuego(String encabezadoPagina, String leyendaPagina, boolean opcionEscogida, String opcionSi, String opcionNo) {
        this.encabezadoPagina = encabezadoPagina;
        this.leyendaPagina = leyendaPagina;
        this.opcionEscogida = opcionEscogida;
        this.opcionSi = opcionSi;
        this.opcionNo = opcionNo;
    }

    public String getEncabezadoPagina() {
        return encabezadoPagina;
    }

    public String getLeyendaPagina() {
        return leyendaPagina;
    }

    public boolean isOpcionEscogida() {
        return opcionEscogida;
    }

    public String getOpcionSi() {
        return opcionSi;
    }

    public String getOpcionNo() {
        return opcionNo;
    }

    @Override
    public String toString() {
        return "PlantillaJuego{" +
                "encabezadoPagina='" + encabezadoPagina + '\'' +
                ", leyendaPagina='" + leyendaPagina + '\'' +
                ", opcionEscogida=" + opcionEscogida +
                ", opcionSi='" + opcionSi + '\'' +
                ", opcionNo='" + opcionNo + '\'' +
                '}';
    }
}

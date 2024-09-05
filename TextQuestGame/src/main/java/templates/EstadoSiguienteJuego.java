package templates;

import java.util.Objects;

public class EstadoSiguienteJuego  {
    private String encabezadoPagina;
    private String leyendaPagina;
    private String opcionSi;
    private String opcionNo;
    private String razonFinJuego;
    private String redirigirA;
    private boolean esFinJuego;

    public EstadoSiguienteJuego(String encabezadoPagina, String razonFinJuego) {
        this.esFinJuego = true;
        this.encabezadoPagina = encabezadoPagina;
        this.razonFinJuego = razonFinJuego;
        this.redirigirA = "logicaFinJuego.jsp";
    }

    public EstadoSiguienteJuego(String encabezadoPagina, String leyendaPagina, String opcionSi, String opcionNo) {
        this.encabezadoPagina = encabezadoPagina;
        this.leyendaPagina = leyendaPagina;
        this.opcionSi = opcionSi;
        this.opcionNo = opcionNo;
        this.esFinJuego = false;
        this.redirigirA = "logicaJuego.jsp";
    }

    public String getEncabezadoPagina() {
        return encabezadoPagina;
    }

    public String getLeyendaPagina() {
        return leyendaPagina;
    }

    public String getOpcionSi() {
        return opcionSi;
    }

    public String getOpcionNo() {
        return opcionNo;
    }

    public String getRazonFinJuego() {
        return razonFinJuego;
    }

    public String getRedirigirA() {
        return redirigirA;
    }

    public boolean getEsFinJuego() {
        return this.esFinJuego;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstadoSiguienteJuego)) return false;
        EstadoSiguienteJuego that = (EstadoSiguienteJuego) o;
        return getEsFinJuego() == that.getEsFinJuego() && Objects.equals(getEncabezadoPagina(), that.getEncabezadoPagina()) && Objects.equals(getLeyendaPagina(), that.getLeyendaPagina()) && Objects.equals(getOpcionSi(), that.getOpcionSi()) && Objects.equals(getOpcionNo(), that.getOpcionNo()) && Objects.equals(getRazonFinJuego(), that.getRazonFinJuego()) && Objects.equals(getRedirigirA(), that.getRedirigirA());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEncabezadoPagina(), getLeyendaPagina(), getOpcionSi(), getOpcionNo(), getRazonFinJuego(), getRedirigirA(), getEsFinJuego());
    }
}

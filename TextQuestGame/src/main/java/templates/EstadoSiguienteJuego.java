package templates;

public class EstadoSiguienteJuego  {
    private String encabezadoPagina;
    private String leyendaPagina;
    private String opcionSi;
    private String opcionNo;
    private String razonFinJuego;
    private String redirigirA;
    private boolean esEstadoFinJuego;

    public EstadoSiguienteJuego(String encabezadoPagina, String razonFinJuego) {
        this.esEstadoFinJuego = true;
        this.encabezadoPagina = encabezadoPagina;
        this.razonFinJuego = razonFinJuego;
        this.redirigirA = "logicaFinJuego.jsp";
    }

    public EstadoSiguienteJuego(String encabezadoPagina, String leyendaPagina, String opcionSi, String opcionNo) {
        this.encabezadoPagina = encabezadoPagina;
        this.leyendaPagina = leyendaPagina;
        this.opcionSi = opcionSi;
        this.opcionNo = opcionNo;
        this.esEstadoFinJuego = false;
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

    public boolean getEsEstadoFinJuego() {
        return this.esEstadoFinJuego;
    }

}


package lab2p2_marcelatovar;


public class Edificio {
    private int numeroPisos;
    private int cantidadLocales;
    private String dirrecionReferencia;
    private String estado;
    private String duenio;

    public Edificio() {
    }

    public Edificio(int numeroPisos, int cantidadLocales, String dirrecionReferencia, String estado, String duenio) {
        this.numeroPisos = numeroPisos;
        this.cantidadLocales = cantidadLocales;
        this.dirrecionReferencia = dirrecionReferencia;
        this.estado = estado;
        this.duenio = duenio;
    }
    

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getCantidadLocales() {
        return cantidadLocales;
    }

    public void setCantidadLocales(int cantidadLocales) {
        this.cantidadLocales = cantidadLocales;
    }

    public String getDirrecionReferencia() {
        return dirrecionReferencia;
    }

    public void setDirrecionReferencia(String dirrecionReferencia) {
        this.dirrecionReferencia = dirrecionReferencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Edificio{" + "numeroPisos=" + numeroPisos + ", cantidadLocales=" + cantidadLocales + ", dirrecionReferencia=" + dirrecionReferencia + ", estado=" + estado + ", duenio=" + duenio + '}';
    }

    
    
    
    
}

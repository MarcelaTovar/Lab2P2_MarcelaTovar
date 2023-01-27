
package lab2p2_marcelatovar;


public class Edificio {
    private int numeroPisos;
    private int cantidadLocales;
    private String dirrecionReferencia;

    public Edificio() {
    }

    public Edificio(int numeroPisos, int cantidadLocales, String dirrecionReferencia) {
        this.numeroPisos = numeroPisos;
        this.cantidadLocales = cantidadLocales;
        this.dirrecionReferencia = dirrecionReferencia;
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

    @Override
    public String toString() {
        return "Edificio{" + "numeroPisos=" + numeroPisos + ", cantidadLocales=" + cantidadLocales + ", dirrecionReferencia=" + dirrecionReferencia + '}';
    }
    
    
}

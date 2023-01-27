
package lab2p2_marcelatovar;

import java.awt.Color;


public class Casa {
    private int numeroCasa;
    private int numeroBloque;
    private Color color;
    private double ancho;
    private double largo;
    private int numeroBanios;
    private int numeroCuartos;
    private String estado;

    public Casa() {
    }

    public Casa(int numeroCasa, int numeroBloque, Color color, double ancho, double largo, int numeroBanios, int numeroCuartos) {
        this.numeroCasa = numeroCasa;
        this.numeroBloque = numeroBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroBanios = numeroBanios;
        this.numeroCuartos = numeroCuartos;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroBloque() {
        return numeroBloque;
    }

    public void setNumeroBloque(int numeroBloque) {
        this.numeroBloque = numeroBloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumeroBanios() {
        return numeroBanios;
    }

    public void setNumeroBanios(int numeroBanios) {
        this.numeroBanios = numeroBanios;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Casa{" + "numeroCasa=" + numeroCasa + ", numeroBloque=" + numeroBloque + ", color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", numeroBanios=" + numeroBanios + ", numeroCuartos=" + numeroCuartos + '}';
    }
    
    
}

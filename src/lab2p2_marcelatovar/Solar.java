
package lab2p2_marcelatovar;


public class Solar {
    private double ancho;
    private double largo;
    private double area;
    private String duenio;

    public Solar() {
    }

    public Solar(double ancho, double largo, String duenio) {
        this.ancho = ancho;
        this.largo = largo;
        this.duenio = duenio;
        this.area = this.largo*this.ancho;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Solar{" + "ancho=" + ancho + ", largo=" + largo + ", area=" + area + ", duenio=" + duenio + '}';
    }
    
    
    
}


package lab2p2_marcelatovar;


public class Usuario {
    private String nombre;
    private int edad;
    private String user;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String user, String contrasenia) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", user=" + user + ", contrasenia=" + contrasenia + '}';
    }
    
    
}

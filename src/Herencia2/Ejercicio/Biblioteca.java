package Herencia2.Ejercicio;

public class Biblioteca {
    private String nombre;
    private Libro libro;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libro = new Libro("Cien años de Soledad");
    }

    @Override
    public String toString() {
        return "Información Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libro=" + libro +
                '}';
    }
}

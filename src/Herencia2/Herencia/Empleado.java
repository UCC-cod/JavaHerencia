package Herencia2.Herencia;

public class Empleado {
    //Solo es visible para las subclases
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void trabajar(){
        System.out.println(nombre + " está trabajando.");
    }
}

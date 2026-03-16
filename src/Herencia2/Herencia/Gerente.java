package Herencia2.Herencia;

public class Gerente extends Empleado{
    public Gerente(String nombre) {
        super(nombre);
    }
    public void dirigir(){
        System.out.println(nombre + " está dirigiendo");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

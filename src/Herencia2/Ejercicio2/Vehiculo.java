package Herencia2.Ejercicio2;

public abstract class Vehiculo implements Movimiento{
    protected String marca;
    protected String tipoCombustible;

    public Vehiculo(String marca, String tipoCombustible) {
        this.marca = marca;
        this.tipoCombustible = tipoCombustible;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    public abstract void encender();
}

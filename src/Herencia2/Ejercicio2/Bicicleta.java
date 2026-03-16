package Herencia2.Ejercicio2;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String marca) {
        super(marca, "Energía mecánica");
    }

    @Override
    public void encender() {
        System.out.println("La bicicleta arranca con un pedal");
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve en la ciclovía");
    }
}

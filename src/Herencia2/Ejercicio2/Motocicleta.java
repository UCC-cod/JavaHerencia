package Herencia2.Ejercicio2;

public class Motocicleta extends Vehiculo{
    public Motocicleta(String marca ) {
        super(marca, "Gasolina");
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta se enciende con NFC");
    }

    @Override
    public void moverse() {
        System.out.println("La motocicleta va por la carretera");
    }


}

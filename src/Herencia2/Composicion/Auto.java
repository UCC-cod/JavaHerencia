package Herencia2.Composicion;

public class Auto {
    private Motor motor;

    public Auto() {
        //Creando una instancia de Motor
        motor = new Motor("Motor de Gasolina");
    }

    public void mostrarMotor(){
        System.out.println("Motor: " + motor.getTipo());
    }
}

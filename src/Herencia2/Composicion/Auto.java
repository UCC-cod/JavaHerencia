package Herencia2.Composicion;

public class Auto {
    private Motor motor;

    public Auto() {
        //Creando una instancia de Motor
        motor = new Motor("Motor de Gasolina");
    }

    //Estructura de un método en java
    //visibilidad - retorno - nombre
    //Paréntesis - recibe o no parámetros
    public void mostrarMotor(){
        System.out.println("Motor: " + motor.getTipo());
    }
}

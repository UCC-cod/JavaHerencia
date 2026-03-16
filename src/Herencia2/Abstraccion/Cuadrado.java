package Herencia2.Abstraccion;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Polimorfismo
    //Sobreescribir
    @Override
    public double calcularArea() {
        return lado*lado;
    }
}

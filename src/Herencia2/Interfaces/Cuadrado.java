package Herencia2.Interfaces;

public class Cuadrado implements Figura, Imprimible{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void imprimir() {
        System.out.println("Estoy imprimiendo un Cuadrado");
    }
}

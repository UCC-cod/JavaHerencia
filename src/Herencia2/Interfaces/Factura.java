package Herencia2.Interfaces;

public class Factura implements Imprimible{
    public Factura() {
    }
    @Override
    public void imprimir() {
        System.out.println("Estoy imprimiendo una factura");
    }
}

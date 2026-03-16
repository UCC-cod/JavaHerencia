package Herencia2.Herencia;

public class Desarrollador extends Empleado{
    private Gerente gerente;

    public Desarrollador(String nombre, Gerente gerente) {
        super(nombre);
        this.gerente = gerente;
    }

    public void codificar(){
        System.out.println(nombre + " está desarrollando software");
    }

    public void lider(){
        System.out.println("Mi líder es: " + gerente);
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "gerente=" + gerente +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

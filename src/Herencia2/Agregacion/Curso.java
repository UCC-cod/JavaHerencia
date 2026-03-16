package Herencia2.Agregacion;

public class Curso {
    private Profesor profesor;

    public Curso(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarProfesor(){
        System.out.println("Profesor del curso: " + profesor.getNombre());
    }
}

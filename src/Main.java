import Herencia1.Cat;
import Herencia1.Dog;
import Herencia2.Abstraccion.Cuadrado;
import Herencia2.Abstraccion.Rectangulo;
import Herencia2.Abstraccion.Triangulo;
import Herencia2.Agregacion.Curso;
import Herencia2.Agregacion.Profesor;
import Herencia2.Composicion.Auto;
import Herencia2.Ejercicio.Autor;
import Herencia2.Ejercicio.Biblioteca;
import Herencia2.Herencia.Desarrollador;
import Herencia2.Herencia.Empleado;
import Herencia2.Herencia.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Ejemplo Composición
    /*Auto auto1 = new Auto();
    System.out.println("El auto: " + auto1);
    auto1.mostrarMotor();*/

    //Ejemplo agregación
    /*Profesor profesor1 = new Profesor("Adriana");
    System.out.println(profesor1.getNombre());*/

    /*Autor autor = new Autor("GGM");
    Biblioteca biblioteca1 = new Biblioteca("UCC");
    System.out.println(biblioteca1.toString());*/

    /*
    Empleado empleado1 = new Empleado("Adriana");
    System.out.println(empleado1);

    Gerente gerente1 = new Gerente("Gerente Luis");
    gerente1.trabajar();
    gerente1.dirigir();

    Desarrollador desarrollador1 = new Desarrollador("Carla", gerente1);
    System.out.println(desarrollador1.toString());
     */
    /*
    Cuadrado cuadrado1 = new Cuadrado(10);
    Rectangulo rectangulo1 = new Rectangulo(10, 5);
    Triangulo triangulo1 = new Triangulo(20, 5);

    System.out.println("Área del cuadrado: " + cuadrado1.calcularArea());
    System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
    System.out.println("Área del triángulo: " + triangulo1.calcularArea());
     */


}

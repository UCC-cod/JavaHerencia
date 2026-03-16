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
import Herencia2.Ejercicio2.Bicicleta;
import Herencia2.Ejercicio2.Motocicleta;
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

    /*
    Motocicleta motocicleta1 = new Motocicleta("Yamaha");
    motocicleta1.encender();

    Bicicleta bicicleta1 = new Bicicleta("GW");
    bicicleta1.encender();
    bicicleta1.moverse();

     */

    //Colecciones

    //ArrayList -> Listas ordenadas
    ArrayList<String> nombres = new ArrayList<>();
    nombres.add("Adriana");
    nombres.add("Juan");
    nombres.add("Emma");
    System.out.println("Nombres: " +nombres);

    Motocicleta moto1 = new Motocicleta("Yamaha");
    Motocicleta moto2 = new Motocicleta("Auteco");
    ArrayList<Motocicleta> motos = new ArrayList<>();
    motos.add(moto1);
    motos.add(moto2);
    System.out.println(motos);

    //Set -> Lista sin valores duplicados
    Set<Integer> numeros = new HashSet<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(1);
    numeros.add(1);
    numeros.add(1);
    numeros.add(1);

    System.out.println(numeros);

    Set<String> apellidos = new HashSet<>();
    apellidos.add("Rojas");
    apellidos.add("Jiménez");
    apellidos.add("Rodríguez");
    apellidos.add("Rojas");

    System.out.println(apellidos);

    //HashMap tienen una estructura en pares-> llave:valor
    HashMap<String, Integer> notas = new HashMap<>();
    notas.put("Carla", 4);
    notas.put("Keisy", 5);
    notas.put("Emma", 2);
    System.out.println(notas);

    /*
    //Ejercicio:
    Crear un sistema de gestión de estudiantes
    ->Lista de nombres (ArrayList)
    ->Set de DNI únicos (HashSet)
    -> Mapa de nombres con la edad (HashMap)
    */
}

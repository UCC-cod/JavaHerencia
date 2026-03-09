public abstract class Animal {
    //Atributos de la clase
    public String name;
    public boolean sex;
    public int edad;
    public double weight;
    public String color;

    //Constructor
    public Animal(String name, boolean sex, int edad, double weight, String color) {
        this.name = name;
        this.sex = sex;
        this.edad = edad;
        this.weight = weight;
        this.color = color;
    }

    //Métodos
    public void breathe(){
        System.out.println("Está respirando");
    }
    public void eat(String food){
        System.out.println("Está comiendo " + food);
    }
    public void run(String destination){
        System.out.println("Está corriendo hacia el" + destination);
    }
    public void sleep(int hours){
        System.out.println("Está durmiendo " + hours);
    }
}

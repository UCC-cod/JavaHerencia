package Herencia1;

public class Cat extends Animal {
    //Atributo propio
    private boolean isNasty;

    //Constructor
    public Cat(String name, boolean sex, int edad, double weight, String color, boolean isNasty) {
        super(name, sex, edad, weight, color);
        this.isNasty = isNasty;
    }

    //Get
    public boolean isNasty() {
        return isNasty;
    }

    //Metodo propio
    public void meow(){
        System.out.println(name + "hizo meow");
    }
}

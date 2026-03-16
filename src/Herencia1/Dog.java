package Herencia1;

public class Dog extends Animal {
    private String bestFriend;

    public Dog(String name, boolean sex, int edad, double weight, String color, String bestFriend) {
        super(name, sex, edad, weight, color);
        this.bestFriend = bestFriend;
    }

    public String getBestFriend() {
        return bestFriend;
    }

    public void bark(){
        System.out.println(name + "hizo guau");
    }
}

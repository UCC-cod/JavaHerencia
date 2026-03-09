//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cat gato1 = new Cat("Emma", true, 10, 6, "Atigrado", true);
    Cat gato2 = new Cat("Chontaduro", false, 1, 1, "Naranjoso", false);
    Dog perro1 = new Dog("Goofy", false, 6, 10, "Naranjoso", "Adriana");

    gato1.meow();
    perro1.bark();

    perro1.run("Parque");
}

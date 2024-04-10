package MASTERCLASS.Section_7.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog pitbull = new Dog("Pitbull", "Medium", 45.00);
        doAnimalStuff(pitbull, "lazy");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "fast");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "rapid");
    }
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------");

    }
}

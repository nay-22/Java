public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", "Huge", 28);
        Dog wolf = new Dog("Wolf", "Very Huge", 36);
        dog.makeNoise(); 
        System.out.println(dog.toString());
        wolf.makeNoise();
        System.out.println(wolf.toString());
    }
}

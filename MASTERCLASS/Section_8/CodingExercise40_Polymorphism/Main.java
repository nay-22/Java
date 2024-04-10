package MASTERCLASS.Section_8.CodingExercise40_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,"Generic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        Car mitsubishi = new Mitsubishi(4,"Lancer EVO");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println();

        Car ford = new Ford(6,"Ford Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println();


    }
}

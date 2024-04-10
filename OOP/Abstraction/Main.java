package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Audi car = new Audi();
        car.start();
    }
}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("Audi Starting");
    }
}

class BMW extends Car {

    @Override
    void start() {
        System.out.println("BMW Starting");
    }
}

abstract class Car {
    int price;
    abstract void start();

    ;
}

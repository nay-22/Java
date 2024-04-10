package MASTERCLASS.Section_8.PolyChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini Huracan STO");
        runRace(car);
        System.out.println();

        Car ferrari = new HybridCar("Ferrari 296 GTB",5.5,6,20);
        runRace(ferrari);
        System.out.println();

        Car tesla = new ElectricCar("Tesla Model S Plaid", 720, 92);
        runRace(tesla);
        System.out.println();
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}

package MASTERCLASS.Section_8.PolymorphismChallenge21_12_23;

public class Main {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Tesla Model S Plaid", 100);
        electricCar.startEngine();
        Car gasCar = new GasCar("Lamborghini Huracan STO", 10);
        gasCar.startEngine();
        Car hybridCar = new HybridCar("Ferrari SF90 Stradale", 8, 7);
        hybridCar.startEngine();
    }
}

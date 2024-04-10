package MASTERCLASS.Section_8.PolymorphismChallenge21_12_23;

public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, int cylinders, int batterySize) {
        super(description);
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("1) The electrical systems go online.");
        System.out.println("2) The Electric Motor is ready to go.");
        System.out.println("3) The starter motors runs firing up all the " + cylinders + " cylinders.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("1) The valves open up further allowing for more fuel and air.");
        System.out.println("2) Bigger combustion occurs resulting in more energy.");
        System.out.println("3) Higher torque and horsepower is produced which rotates the shaft faster.");
        System.out.println("4) Shaft connected to the transmission.");
        System.out.println("5) Transmission connected to the wheels.");
        System.out.println("1) The electric motor consumes more energy from the battery whose size is " + batterySize + "kWh.");
        System.out.println("2) More energy results in higher torque and horsepower.");
        System.out.println("6) The wheels rotate faster.");
    }
}

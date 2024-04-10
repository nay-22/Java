package MASTERCLASS.Section_8.PolymorphismChallenge21_12_23;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private final int batterySize;

    public ElectricCar(String description, int batterySize) {
        super(description);
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("1) The electric motor consumes more energy from the battery whose size is " + batterySize + "kWh.");
        System.out.println("2) More energy results in higher torque and horsepower.");
        System.out.println("3) The wheels rotate faster.");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("1) The electrical systems go online.");
        System.out.println("2) The Electric Motor is ready to go.");
        runEngine();
    }
}

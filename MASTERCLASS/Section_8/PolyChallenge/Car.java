package MASTERCLASS.Section_8.PolyChallenge;

public class Car {
    private String description;

    public Car(String description) {this.description = description;}

    public void startEngine() {
        System.out.println(description+" Engine Started...");
    }

    public void drive() {
        System.out.println(description+" Being Driven is a "+getClass().getSimpleName()+"...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car Engine Running");
    }

    public String getDescription() {
        return description;
    }

}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
        cylinders = 6;
    }
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starter Generator Starts the "+super.getDescription()+"...");
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Using Gas, Clutch, Brake Pedals...");
        super.drive();
    }

    public double getMileage() {
        return avgKmPerLitre;
    }

    public int getNoOfCyclinders() {
        return cylinders;
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int battery;

    public ElectricCar(String description, double avgKmPerCharge, int battery) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battery = battery;
    }

    @Override
    public void drive() {
        System.out.println("Using Accelerator, Brake Pedals...");
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println(super.getDescription()+" Motor Turned On...");
        super.startEngine();
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBattery() {
        return battery;
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int battery;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int battery) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.battery = battery;
    }


    @Override
    public void startEngine() {
        System.out.println("Starter Generator Starts the "+super.getDescription()+"...");
        System.out.println(super.getDescription()+" Motor Turned On...");
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Using Accelerator, Clutch, Brake, Motor...");
//        super.drive();
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBattery() {
        return battery;
    }
}

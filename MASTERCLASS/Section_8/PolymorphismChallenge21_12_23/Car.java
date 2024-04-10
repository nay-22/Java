package MASTERCLASS.Section_8.PolymorphismChallenge21_12_23;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println();
        System.out.println("Starting the " + this.getClass().getSimpleName() + ", " + description + "..");
    }

    public void drive() {
        System.out.println("Pushing the accelerator...");
    }

    protected void runEngine() {
        System.out.println("Engine runs as following..");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

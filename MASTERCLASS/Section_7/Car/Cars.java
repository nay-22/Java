package MASTERCLASS.Section_7.Car;

public class Cars {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible = false;
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public boolean getConvertible() {
        return this.convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public void describeCar() {
        System.out.println("\n"+color+" "+make + " " + model+", "+doors+"-Doors, "+"Convertible: "+convertible);
    }
}

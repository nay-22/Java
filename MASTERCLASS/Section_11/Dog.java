public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Dog Moves as an Animal at " + speed + "km/h");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
    
    
}

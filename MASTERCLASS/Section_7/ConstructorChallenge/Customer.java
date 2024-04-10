package MASTERCLASS.Section_7.ConstructorChallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    // Getters
    public String getName() {
        return this.name;
    }
    public double getCreditLimit() {
        return this.creditLimit;
    }
    public String getEmail() {
        return this.email;
    }

    // Constructors
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer() {
        this("Nayan","nayan92001@gmail.com");
    }
    public Customer(String name, String email) {
        this(name,70000, email);
    }

}

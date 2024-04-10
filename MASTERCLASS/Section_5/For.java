package MASTERCLASS.Section_5;

public class For {
    public static void main(String[] args) {
        calculateInterest(100);
    }
    public static void calculateInterest(double amount) {
        for(double rate=7.5; rate<=10; rate+=0.25 ) {
            System.out.println("Interest At Rate "+rate+": "+(amount*rate)/100);
        }
    }
}

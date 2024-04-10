package MASTERCLASS.Section_7.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Customer nay = new Customer();
        Customer jay = new Customer("Jay","jay92001@gmail.com");
        Customer pay = new Customer("Pay",90000.00,"pay92001@gmail.com");

        System.out.println("Nay details: ");
        System.out.println("Name: "+nay.getName());
        System.out.println("Credit Limit: "+nay.getCreditLimit());
        System.out.println("Email: "+nay.getEmail());

        System.out.println();

        System.out.println("Jay details: ");
        System.out.println("Name: "+jay.getName());
        System.out.println("Credit Limit: "+jay.getCreditLimit());
        System.out.println("Email: "+jay.getEmail());

        System.out.println();

        System.out.println("Pay details: ");
        System.out.println("Name: "+pay.getName());
        System.out.println("Credit Limit: "+pay.getCreditLimit());
        System.out.println("Email: "+pay.getEmail());
    }
}

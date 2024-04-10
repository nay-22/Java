package Challenge_1;

public class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String desrciption) {
        super(type, price, desrciption);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + "is a beautiful ancient piece");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(desrciption);
    }
    
}

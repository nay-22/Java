package Challenge_1;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String desrciption;

    public ProductForSale(String type, double price, String desrciption) {
        this.type = type;
        this.price = price;
        this.desrciption = desrciption;
    }

    public double getSalesPrice(int qty) {
        return price*qty;
    }

    public void printPricedLineItem(int qty) {
        System.out.println("Quantity: "+qty);
        System.out.println("Type: "+type);
        System.out.println("Description: "+desrciption);
        System.out.println("Price: "+price);
    }

    public abstract void showDetails();
}

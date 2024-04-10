package Challenge_1;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> products = new ArrayList<>();
    
    public static void main(String[] args) {
        products.add(new ArtObject("Oil Painting", 1389, "Au Revior"));
        products.add(new ArtObject("Charcoal Painting", 907, "The Time Piece"));
        printOrderedItems();
    }

    public static void addItem() {
        
    }

    public static void printOrderedItems() {
        for (var item: products) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

}

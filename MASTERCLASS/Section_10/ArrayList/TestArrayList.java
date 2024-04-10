package Section_10.ArrayList;

import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("\n  %d %s in %s", count, name.toUpperCase(), type);
    }
}

public class TestArrayList {
    public static void main(String[] args) {
         ArrayList<GroceryItem> objectList = new ArrayList<>();
         objectList.add(new GroceryItem("Butter"));
         objectList.add(new GroceryItem("Fries", "JUNK", 12));
         System.out.println(objectList);
    }
    
}

package Section_10.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Mango", "Papaya"};
        ArrayList<String> groceries = new ArrayList<>(List.of(items));
        groceries.add("Dragon Fruit");
        System.out.println(groceries);
        
    }
}

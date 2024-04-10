package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex17SortHashMapByKeys {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Audi R8","V10");
        map.put("Lexus LFA","V10");
        map.put("Lamborghini Sian","V12");
        map.put("Bugatti Chiron","W16");
        map.put("Porsche 911","Flat 6");
        map.put("Ferrari 296 GTB","V6");

        System.out.println("-".repeat(30)+"Before Sorting"+"-".repeat(30));
        for(String car : map.keySet()) {
            System.out.println(car + ": " + map.get(car));
        }

        Map<String,String> sortedCar = new TreeMap<>(map);
        System.out.println("-".repeat(30)+"After Sorting"+"-".repeat(30));
        for(String car : sortedCar.keySet()) {
            System.out.println(car + ": " + sortedCar.get(car));
        }

// Method 2: using Comparable
    }
}

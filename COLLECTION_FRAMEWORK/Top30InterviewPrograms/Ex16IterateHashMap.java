package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex16IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> shapeEdges = new HashMap<>();
        shapeEdges.put("Square", 4);
        shapeEdges.put("Rectangle", 4);
        shapeEdges.put("Triangle", 3);
        shapeEdges.put("Hexagon", 6);
        shapeEdges.put("Circle", 1);

        for(String key : shapeEdges.keySet()) {
            System.out.println("Key: "+key.toUpperCase()+"->Value: "+shapeEdges.get(key));
        }

    }
}

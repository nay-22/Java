package MASTERCLASS.Section_15_CollectionsFramework.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        Map<String, Object> address = new HashMap<>();

//        INSERT = map.put()
        student.put("Name", "Nayan");
        address.put("Society", "Balaji Symphony");
        address.put("Location", "New Panvel");
        address.put("City", "Navi Mumbai");
        address.put("PIN", 410206);
        student.put("Address", address);
        student.put("Phone", "8879898578");
        System.out.println(student);

//        SEARCH - map.contains()
        if (student.containsKey("Address")) {
            System.out.println("Yes, Address exists");
            System.out.println(student.get("Address"));
        }

//        ITERATION
        for (Map.Entry<String, Object> e : student.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

//        Set<String> keys = student.keySet();
        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }

//        DELETE
//        student.remove("Address");
        student.remove("Address", "PIN");
        System.out.println(student);

//        hashCode()
        int code = "Address".hashCode();
        System.out.println(code);
    }
}

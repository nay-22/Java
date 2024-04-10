package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.HashMap;

public class Ex10Ex14Ex15AddHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> age =  new HashMap<>();
        age.put("Luffy",20);
        age.put("Zoro",26);
        age.put("Sanji",26);
        age.put("Nami",19);

        System.out.println(age);
        System.out.println(age.size());
        System.out.println(age.isEmpty());
    }
}

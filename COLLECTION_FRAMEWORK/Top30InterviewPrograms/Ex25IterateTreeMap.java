package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class Ex25IterateTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> stu = new TreeMap<>();
        stu.put(44,"Luffy");
        stu.put(41,"Zoro");
        stu.put(26,"Sanji");
        stu.put(13,"Usopp");
        stu.put(89,"Nami");
        stu.put(66,"Robin");

        System.out.println(stu);


        for(Integer key : stu.keySet()) {
            System.out.println(key + " " + stu.get(key));
        }
    }
}

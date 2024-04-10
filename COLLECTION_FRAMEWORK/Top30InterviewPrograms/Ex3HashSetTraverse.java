package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3HashSetTraverse {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Luffy");
        stringSet.add("Zoro");
        stringSet.add("Sanji");
        stringSet.add("Nami");
        stringSet.add("Robin");
        stringSet.add("Brook");
        stringSet.add("Chopper");
        stringSet.add("Usopp");

//        for(String string : stringSet) {
//            System.out.println(string);
//        }

        Iterator<String> it = stringSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

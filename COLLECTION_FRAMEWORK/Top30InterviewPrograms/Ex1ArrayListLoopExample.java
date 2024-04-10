package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1ArrayListLoopExample {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);

//        for(int i=0; i<intList.size(); i++) {
//            System.out.printf("Index[%d] = %d\n",i,intList.get(i));
//        }

//        for(int item : intList) {
//            System.out.println(item);
//        }

//        for (Integer integer : intList) {
//            System.out.println(integer);
//        }

//        int count = 0;
//        while(count<intList.size()) {
//            System.out.println(intList.get(count));
//            count++;
//        }

//        Iterator it = intList.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

//        Using Stream API
//        intList.forEach((num) -> {
//            System.out.println(num);
//        });
    }
}

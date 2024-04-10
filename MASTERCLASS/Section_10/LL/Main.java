package MASTERCLASS.Section_10.LL;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> aList = getArrayList(5,6,7,8,9);
        System.out.println(aList);
    }

    public static ArrayList<Object> getArrayList(int... varargs) {
        var aList = new ArrayList<>();
        for (int num : varargs) {
            aList.add(num);
        }
        return aList;
    }
}

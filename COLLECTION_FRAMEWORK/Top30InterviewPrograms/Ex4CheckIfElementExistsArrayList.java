package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4CheckIfElementExistsArrayList {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        System.out.print("Enter element to check: ");
        if(list.contains(in.nextInt())) {
            System.out.println("List has the element.");
        } else {
            System.out.println("List does not have the element");
        }


    }
}

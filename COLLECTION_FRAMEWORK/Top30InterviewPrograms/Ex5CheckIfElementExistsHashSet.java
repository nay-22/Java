package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class Ex5CheckIfElementExistsHashSet {
    private static final Scanner in = new Scanner(System.in);
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

        System.out.println(stringSet);
        System.out.print("Enter element to check: ");
        if(stringSet.contains(in.nextLine())) {
            System.out.println("CONTAINS");
        } else {
            System.out.println("NOT CONTAINS");
        }
    }
}

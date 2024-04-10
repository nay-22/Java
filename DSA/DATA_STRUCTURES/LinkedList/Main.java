package DSA.DATA_STRUCTURES.LinkedList;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();

        System.out.println("-".repeat(20)+"Doubly Linked List"+"-".repeat(20));
        int choice = printInstructions();
        while(choice<=7) {
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter data: ");
                    linkedList.addFirst(in.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter data: ");
                    linkedList.addLast(in.nextInt());
                }
                case 3 -> System.out.println("First Element: " + linkedList.peekFirst());
                case 4 -> System.out.println("Last Element: " + linkedList.peekLast());
                case 5 -> {
                    System.out.print("Enter Element to be Removed: ");
                    linkedList.remove(in.nextInt());
                }
                case 6 -> {
                    linkedList.clearList();
                    System.out.println("List has been cleared...");
                }
                case 7 -> linkedList.printList();
                default -> System.out.println("Invalid Operation, Try Again.");
            }
            choice = printInstructions();
        }
    }
    public static int printInstructions() {
        System.out.println("1. Insert At Beginning");
        System.out.println("2. Insert At End");
        System.out.println("3. Get Element At Beginning");
        System.out.println("4. Get Element At End");
        System.out.println("5. Remove Element");
        System.out.println("6. Clear List");
        System.out.println("7. Print List");
        System.out.println("8. Exit");
        System.out.print("Enter Choice: ");
        return in.nextInt();
    }
}

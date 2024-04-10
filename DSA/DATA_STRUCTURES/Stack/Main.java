package DSA.DATA_STRUCTURES.Stack;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("-".repeat(20)+"Stack"+"-".repeat(20));
        printInstructions();
        System.out.print("Enter you choice: ");
        int choice = in.nextInt();
        while(choice<=7) {
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    stack.push(in.nextInt());
                    break;
                case 2:
                    System.out.println(stack.pop()+" Element Popped");
                    break;
                case 3:
                    System.out.println("Top Stack Element: "+stack.peek());
                    break;
                case 4:
                    System.out.println("the Stack is "+(stack.isEmpty()?"Empty":"Not Empty"));
                    break;
                case 5:
                    System.out.println("Stack size: " + stack.getSize());
                    break;
                case 6:
                    stack.printStack();
                    break;
                case 7:
                    printInstructions();
                    break;
                default:
                    System.out.println("Invalid Operation, Try Again.");
                    break;
            }
            System.out.print("Enter Choice (7 to print list of operations): ");
            choice = in.nextInt();
        }
    }
    public static void printInstructions() {
        System.out.println("1. Push Element");
        System.out.println("2. Pop Element");
        System.out.println("3. Peek Stack");
        System.out.println("4. Check if Empty");
        System.out.println("5. Get Size");
        System.out.println("6. Print Stack");
        System.out.println("7. Print Operations");
        System.out.println("8. Exit");
    }
}

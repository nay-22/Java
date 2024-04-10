package DSA.DATA_STRUCTURES.Queue;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        System.out.println("-".repeat(20)+"Queue"+"-".repeat(20));
        printInstructions();
        System.out.print("Enter you choice: ");
        int choice = in.nextInt();
        while(choice<=7) {
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    queue.enQueue(in.nextInt());
                    break;
                case 2:
                    System.out.println(queue.deQueue()+" Element Dequeued");
                    break;
                case 3:
                    System.out.println("First Queue Element: "+queue.peek());
                    break;
                case 4:
                    System.out.println("the Queue is "+(queue.isEmpty()?"Empty":"Not Empty"));
                    break;
                case 5:
                    System.out.println("Stack size: " + queue.getSize());
                    break;
                case 6:
                    queue.printQueue();
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
        System.out.println("1. enQueue Element");
        System.out.println("2. deQueue Element");
        System.out.println("3. Peek Queue");
        System.out.println("4. Check if Empty");
        System.out.println("5. Get Size");
        System.out.println("6. Print Queue");
        System.out.println("7. Print Operations");
        System.out.println("8. Exit");
    }
}

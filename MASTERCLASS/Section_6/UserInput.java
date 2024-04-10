package MASTERCLASS.Section_6;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int sum = 0;
            int counter = 0;
            while(counter<5) {
                System.out.print("ENter Number: ");
                String number = in.nextLine();
                try {
                    int num = Integer.parseInt(number);
                    sum+=num;
                    counter++;
                } catch(NumberFormatException e) {
                    System.out.println("Invalid Value..Try Again!");
                }
            }
            System.out.println("Sum: "+sum);
        } finally {
            in.close();
        }
    }

}

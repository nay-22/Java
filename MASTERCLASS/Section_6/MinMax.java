package MASTERCLASS.Section_6;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        try {
            while(true) {
                String number = in.nextLine();
                try {
                    int num = Integer.parseInt(number);
                    if(num>max) {
                        max = num;
                    }
                    if(num<min) {
                        min = num;
                    }
                } catch(NumberFormatException e) {
                    System.out.println("Invalid Value...Breaking Out Of Loop...");
                    break;
                }
                System.out.println("Max Number: "+max);
                System.out.println("Min Number: "+min);
            }
        } finally {
            in.close();
        }
    }
}

package MASTERCLASS.Section_6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner in = new Scanner(System.in);
        try {
            int count = 0, sum = 0;
            double avg = 0;
            while(true) {
                try {
                    sum += in.nextInt();
                    count++;
                } catch (InputMismatchException e) {
                    avg = (double)sum/count;
                    System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
                    break;
                }
            }
        } finally {
            in.close();
        }
    }
}

package MASTERCLASS.Section_5;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Sum Of Digits Of 125: "+sumDigits(125));
    }
    public static int sumDigits(int number) {
        if(number>0) {
            int sumOfDigits = 0;
            while(number!=0) {
                int rem = number%10;
                number = number/10;
                sumOfDigits+=rem;
            }
            return sumOfDigits;
        }
        return -1;
    }
}

package MASTERCLASS.Section_5;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int i=1; i<=15; i++) {
            System.out.println("Is "+i+" a Prime Number -> "+isPrime(i));
        }
    }
    public static boolean isPrime(int number) {
        boolean isIt = false;
        int counter = 0;
        for(int i=1; i<=number; i++) {
            if(number%i==0) {
                counter++;
            }
        }
        if(counter==2) {
            isIt = true;
        }
        return isIt;
    }
}

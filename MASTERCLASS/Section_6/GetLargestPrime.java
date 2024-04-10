package MASTERCLASS.Section_6;

public class GetLargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number) {
        if(number<1) {
            return -1;
        }
        int maxPrime = 2;
        for(int i=2; i<number; i++) {
            if(isPrime(i) && number%i==0) {
                maxPrime = i;
            }
        }
        return maxPrime;
    }
    public static boolean isPrime(int number) {
        int count = 0;
        for(int i=1; i<=number; i++) {
            if(number%i==0) {
                count++;
            }
        }
        if(count==2) {
            return true;
        }
        return false;
    }
}

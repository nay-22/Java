package MASTERCLASS.Section_6;

public class get_largest_prime {
    public static void main(String[] args) {
        
    }
    public static int getLargestPrime (int number) {
        if (number<2) return -1;
        for (int i=number/2; i>1; i--) {
            if(number%i==0) number=i;
        }
        return number;
    }
}

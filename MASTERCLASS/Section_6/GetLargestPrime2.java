package MASTERCLASS.Section_6;

public class GetLargestPrime2 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number) {
        if(number<1) {
            return -1;
        }
        int maxPrime=-1;
        for(int i=2; i<number; i++) {
            if(number%i==0) {
                int count = 0;
                for(int j=1; j<=i; j++) {
                    if(i%j==0) {
                        count++;
                    }
                }
                boolean ans = (count==2)?true:false;
                maxPrime = ans?i:maxPrime;
            }
        }
        return maxPrime;
    }
}

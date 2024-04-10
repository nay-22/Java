package MASTERCLASS.Section_5;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 5, ceven = 0, codd = 0;
        while(i<=20) {
            if(isEven(i)) {
                System.out.println(i);
                ceven++;
            }
            codd++;
            i++;
            if(ceven==5) {
                break;
            }
        }
        System.out.println("Total Even Numbers: "+ceven);
        System.out.println("Total Odd Numbers: "+codd);
    }
    public static boolean isEven(int number) {
        if(number%2==0) {
            return true;
        } 
        return false;
    }
}

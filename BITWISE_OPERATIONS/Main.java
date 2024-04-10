package BITWISE_OPERATIONS;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        if((in.nextInt()&1)==1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
}

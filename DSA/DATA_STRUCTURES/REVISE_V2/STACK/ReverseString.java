package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    private static final Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
        String exp = "MY NAME IS SWIFT";
        String rev = reverseString(exp);
        System.out.println("String : " + exp);
        System.out.println("Reverse: " + rev);
        System.out.println("Reversed Words:\n" + reverseWords(exp));
    }
    public static String reverseString(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            stack.push(exp.charAt(i));
        }
        StringBuilder rev = new StringBuilder("");
        for (int i = 0; i < exp.length(); i++) {
            rev.append(stack.pop());
        }
        return rev.toString();
    }
    public static String reverseWords(String exp) {
        String[] temp = exp.split(" ");
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = reverseString(temp[i]);
            str.append(temp[i]).append(" ");
        }
        str.delete(str.length()-1, str.length());
        return str.toString();
    }
}

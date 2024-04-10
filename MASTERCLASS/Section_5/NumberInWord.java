package MASTERCLASS.Section_5;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(2);
    }
    
        public static void printNumberInWord(int number) {
            String Word = switch(number) {
                case 0 -> "ZERO";
                case 1,-1 -> "ONE";
                case 2,-2 -> "TWO";
                case 3,-3 -> "THREE";
                case 4,-4 -> "FOUR";
                case 5,-5 -> "FIVE";
                case 6,-6 -> "SIX";
                case 7,-7 -> "SEVEN";
                case 8,-8 -> "EIGHT";
                case 9,-9 -> "NINE";
                default -> "OTHER";
            };
            System.out.println(number+" -> "+Word);
        }
    
}

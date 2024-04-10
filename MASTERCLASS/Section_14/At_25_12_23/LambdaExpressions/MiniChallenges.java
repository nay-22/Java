package MASTERCLASS.Section_14.At_25_12_23.LambdaExpressions;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChallenges {
    public static void main(String[] args) {
        String s = "I am a disco dancer, tan tan tan dan.";

        Consumer<String> printTheParts = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(p -> System.out.println(p));
        };

//        Consumer<String> printTheParts = sentence -> {
//            String[] parts = sentence.split(" ");
//            for (String part : parts) System.out.println(part);
//        };

//        Consumer<String> printTheParts = sentence -> {
//            String[] parts = sentence.split(" ");
//            Arrays.asList(parts).forEach(System.out::println);
//        };

//        Consumer<String> printTheParts = sentence -> {
//            Arrays.asList(sentence.split(" ")).forEach(System.out::println);
//        };

        printTheParts.accept(s);

        UnaryOperator<String> everySecondChar = src -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < src.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(src.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String source = "1234567890";

        String result = everySecondChar.apply(source);
        System.out.println("result = " + result);

        System.out.println("Result from method: " + everySecondCharacter(everySecondChar, source));

        System.out.println("Result from method: " + everySecondCharacter(src -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < src.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(src.charAt(i));
                }
            }
            return returnVal.toString();
        }, source));

        Supplier<String> supplier = () -> "I love Java";
        String res = supplier.get();
        System.out.println("Supplier Result = " + res);

    }

    public static String everySecondCharacter(UnaryOperator<String> func, String source) {
        return func.apply(source);
    }
}

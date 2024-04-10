package MASTERCLASS.Section_14.MiniChallenges;

import java.util.Arrays;
import java.util.function.*;

public class AllMiniChallenges {
    public static void main(String[] args) {

//        CHALLENGE !
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Consumer<String> printWordsLambdaForEach = sentence ->
            Arrays.asList(sentence.split(" ")).forEach(System.out::println);

        System.out.println();
        System.out.println("-".repeat(10) + "Consumer Anonymous Class" + "-".repeat(10));
        printWords.accept("Kaizoku Ou Ni Ore Wa Naru");
        System.out.println();
        System.out.println("-".repeat(10) + "Consumer Lambda Expression" + "-".repeat(10));
        printWordsLambda.accept("Kaizoku Ou Ni Ore Wa Naru");
        System.out.println();
        System.out.println("-".repeat(10) + "Consumer Lambda Expression forEach" + "-".repeat(10));
        printWordsLambdaForEach.accept("Kaizoku Ou Ni Ore Wa Naru");

//        CHALLENGE 2 Solution
//        Can also use UnaryOperator<String>
        UnaryOperator<String> everySecondCharLambda = sentence -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                if(i%2 == 1) {
                    returnVal.append(sentence.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        CHALLENGE 3 - Use that lambda function
        System.out.println();
        System.out.println("-".repeat(10) + "UnaryOperator Lambda Expression" + "-".repeat(10));
        String str = everySecondCharLambda.apply("1234567890");
        System.out.println(str);

//        CHALLENGE 5 - contd of 4
        System.out.println();
        String result = everySecondCharacter(everySecondCharLambda, "1234567890");
        System.out.println("-".repeat(10) + "UnaryOperator Lambda Expression and method" + "-".repeat(10));
        System.out.println(result);

//        CHALLENGE 6
        System.out.println();
        System.out.println("-".repeat(10) + "Supplier Lambda Expression" + "-".repeat(10));
        Supplier<String> iLoveJava = () -> "I love Java";

//        CHALLENGE 7
        System.out.println();
        System.out.println("-".repeat(10) + "Supplier Lambda Expression result" + "-".repeat(10));
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }
    //        CHALLENGE 2
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if(i%2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

//    CHALLENGE 4
    public static String everySecondCharacter(Function<String,String> op, String source) {
        return op.apply(source);
    }

}



package MASTERCLASS.Section_14.At_25_12_23.LambdaExpressions;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaExpressionChallenge {

    public static void main(String[] args) {
        List<String> firstNames = new ArrayList<>(List.of("fRankY", "UsSop", "Zoro", "Bob", "AnNa", "NaYAn"));
        List<String> middleNames = new ArrayList<>(List.of("Roronoa", "Vinsmoke", "Monkey D.", "Waterlaw"));



        System.out.println(firstNames);
        firstNames.replaceAll(String::toUpperCase);
        System.out.println(firstNames);

        Random random = new Random();
        firstNames.replaceAll(s -> s + " " + middleNames.get(random.nextInt(0, 4)));
        System.out.println(firstNames);

        firstNames.replaceAll(s -> {
            StringBuilder str = new StringBuilder(s);
            return s + " " + str.reverse().toString();
        });
        System.out.println(firstNames);

        LambdaExpressionChallenge c = new LambdaExpressionChallenge();
        // Method Reference
        firstNames.forEach(c::println);
//        firstNames.forEach(LambdaExpressionChallenge::println); //for static methods

//        UnaryOperator<List<String>> uCase = String::toUpperCase;
//        UnaryOperator<List<String>> rMiddle = s -> s.replaceAll(str -> str + " " + middleNames.get(random.nextInt(0, 4)));
//
//        UnaryOperator<List<String>> process = uCase.andThen(rMiddle).apply(firstNames);
    }

    public static void process(List<String> firstNames) {

    }

    public <T> void println(T s) {
        System.out.println("FirstName -> " + s);
    }

}

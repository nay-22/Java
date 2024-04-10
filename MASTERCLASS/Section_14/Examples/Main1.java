package MASTERCLASS.Section_14.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));
        //forEach
        list.forEach((var s) -> System.out.println(s));
//        list.forEach(s -> System.out.println(s));
        //list.forEach(System.out::println); // method reference

        System.out.println("-".repeat(40));

        String exclamation = "!";
        list.forEach(s -> {
            char first = s.charAt(0);
            System.out.println(s + " means " + first + exclamation);
        });

//        Can't do it, lambda throws compile-time error, must not change over time
//        exclamation = "not";

        System.out.println("-".repeat(40));

        int result1 = calculator((var a, var b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.25, 2.25);
        var result3 = calculator((a, b)->{
            return b + " is " + a + "'s right-hand";
        },"Luffy", "Zoro");

        var coords = Arrays.asList(
                new double[]{47.2150, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        System.out.println("-".repeat(40));

        BiConsumer<Double, Double> p1 = (lat,lng) -> System.out.println(lat + " " + lng);

        var firstpoint = coords.get(0);
        processPoint(firstpoint[0], firstpoint[1], p1);

        System.out.println("-".repeat(40));

        coords.forEach(s -> processPoint(s[0], s[1], p1));

        System.out.println("-".repeat(40));

        coords.forEach(s -> processPoint(s[0], s[1], (lat, lng)-> System.out.println("Lat: "+lat + " Long: "+ lng)));

//        System.out.println("-".repeat(40));
//        boolean val = list.removeIf(s -> s.equalsIgnoreCase("alpha"));
//        System.out.println(list);
//        System.out.println(val);
//
//        System.out.println("-".repeat(40));
//        list.removeIf(s -> s.startsWith("br"));
//        System.out.println(list);

        System.out.println("-".repeat(40));
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        list.forEach(System.out::println);

        System.out.println("-".repeat(40));
    }

//    Function Interface
    public static <T> T calculator(BinaryOperator<T> function, T v1, T v2) {
        T result = function.apply(v1, v2);
        System.out.println("Result of Operation: " + result);
        return result;
    }

//    Consumer Interface
    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }

//    Predicate Interface


}

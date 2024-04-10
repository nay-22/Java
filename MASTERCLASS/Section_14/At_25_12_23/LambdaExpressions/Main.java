package MASTERCLASS.Section_14.At_25_12_23.LambdaExpressions;

import MASTERCLASS.Section_14.At_25_12_23.Operation;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "bravo",
                "charlie",
                "delta"
        ));
//        list.forEach(e -> System.out.println(e));


        Map<Integer, String> map = new HashMap<>(Map.of(
                1, "Luffy",
                2, "Zoro",
                3, "Sanji",
                4, "Jimbei",
                5, "Franky"
        ));
//        map.forEach(((id, name) -> System.out.println("id = " + id + ", name = " + name)));

        int result = calculator((a, b) -> a + b, 5, 4);

        var coords = Arrays.asList(
                new double[] {47.2160, -95.2348},
                new double[] {29.1140, -89.1548},
                new double[] {35.2110, -92.8745}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat: %.3f, lon: %.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processCoords(firstPoint[0], firstPoint[1], p1);

        System.out.println("-----------------------------");
        coords.forEach(s -> processCoords(s[0], s[1], p1));
//        coords.forEach(s -> processCoords(s[0], s[1], (lat, lng) -> System.out.printf("[lat: %.3f, lon: %.3f]%n", lat, lng)));
    }

    public static <T> void processCoords(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static <T> T calculator(BinaryOperator<T> function, T v1, T v2) {
        T result = function.apply(v1, v2);
        System.out.println("Result of Operation = " + result);
        return result;
    }
}

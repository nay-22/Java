package MASTERCLASS.Section_14.At_25_12_23.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // BiConsumer
        var coords = Arrays.asList(
                new double[] {47.2160, -95.2348},
                new double[] {29.1140, -89.1548},
                new double[] {35.2110, -92.8745}
        );
        // Printing with default format
        System.out.println("-----------------------Default Format----------------------");
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        // Printing with custom format using BiConsumer
        BiConsumer<Double, Double> biConsumer = (lat, lng) -> System.out.printf("[lat: %.3f, lon: %.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processCoords(firstPoint[0], firstPoint[1], biConsumer);

        System.out.println("--------------Custom Format Using BiConsumer---------------");
        coords.forEach(s -> processCoords(s[0], s[1], biConsumer));

        String str = "Hello";
        Predicate<String> predicate = s -> s.equalsIgnoreCase("hello");
        System.out.println("---------------------Predicate Testing---------------------");
        System.out.println(processString(str, predicate));

        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "bravo",
                "charlie",
                "delta",
                "echo"
        ));
        System.out.println("Before removing bravo: " + list);
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        System.out.println("After removing bravo: " + list);

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-----------------------------------------------------------");
        System.out.println(list);

        System.out.println("-----------------------------------------------------------");
        String[] es = new String[10];
        System.out.println(Arrays.toString(es));
        Arrays.fill(es, "");
        System.out.println(Arrays.toString(es));
        Arrays.setAll(es, i -> "" + (i + 1));
        System.out.println(Arrays.toString(es));;
    }

    // BiConsumer
    public static <T> void processCoords(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    // Predicate
    public static <T> boolean processString(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }
}

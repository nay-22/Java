package MASTERCLASS.Section_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaChallenge {

    private static final Random rn = new Random();

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of(
                "Ryan", "Bob", "Anna", "Nathan", "Priya", "Jay", "Nayan"
        ));
        System.out.println();
        System.out.println(names);
        names.replaceAll(s -> {
            String val = s + " " + generateRandomChar('A', 'Z') + ". " + new StringBuilder(s).reverse();
            return val.toUpperCase();
        });
        System.out.println("-".repeat(30));
        names.forEach(System.out::println);
    }


    public static char generateRandomChar(char start, char end) {
        return (char) rn.nextInt((int)start, (int)end);
    }
}

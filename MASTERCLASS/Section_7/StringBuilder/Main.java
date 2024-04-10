package MASTERCLASS.Section_7.StringBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and GoodBye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and GoodBye");



    printInfo(helloWorld);
    printInfo(helloWorldBuilder);
    }
    public static void printInfo(String string) {
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());
    }
    public static void printInfo(StringBuilder builder) {
        System.out.println("StringBuilder = "+builder);
        System.out.println("length = "+builder.length());
    }
}

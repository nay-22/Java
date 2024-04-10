package MASTERCLASS.Section_5;
public class OverLoad {
    public static void main(String[] args) {
        System.out.println("Height in centimeters(One): "+convertToCentimeters(72));
        System.out.println("Height in centimeters(One): "+convertToCentimeters(6,2));
    }
    public static double convertToCentimeters(int height) {
        return (double)(height*2.54);
    }
    public static double convertToCentimeters(int hFeet, int hInch) {
        return (double)(hFeet*12*2.54+hInch*2.54);
    }
}

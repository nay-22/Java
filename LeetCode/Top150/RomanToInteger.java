package LeetCode.Top150;

public class RomanToInteger {
    public static int romanToInt(String s) {

        int res = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> {
                    num = 5;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='I') {
                        --num;
                    }
                }case 'X' -> {
                    num = 10;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='I') {
                        --num;
                    }
                }case 'L' -> {
                    num = 50;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='X') {
                        num -= 10;
                    }
                }case 'C' -> {
                    num = 100;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='X') {
                        num -= 10;
                    }
                }case 'D' -> {
                    num = 500;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='C') {
                        num -= 100;
                    }
                }case 'M' -> {
                    num = 1000;
                    if (i == 0) break;
                    if (s.charAt(i-1)=='C') {
                        num -= 100;
                    }
                }
            }
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}

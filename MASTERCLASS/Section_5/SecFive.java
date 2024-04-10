package MASTERCLASS.Section_5;

public class SecFive {
    public static void main(String[] args) {
        System.out.println("");
        int s1 = 1500, s2 = 500, s3 = 100, s4 = 25;
        int p1 = calculateHighScorePosition(s1);
        int p2 = calculateHighScorePosition(s2);
        int p3 = calculateHighScorePosition(s3);
        int p4 = calculateHighScorePosition(s4);
        displayHighScorePosition("Nay", p1);
        displayHighScorePosition("Jay", p2);
        displayHighScorePosition("Tay", p3);
        displayHighScorePosition("Zay", p4);
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }
    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        }
        else if(score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
        return 4;
    }
}

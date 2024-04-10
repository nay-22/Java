package MASTERCLASS.Section_5;
public class SecondsMinutes {
    public static void main(String[] args) {
        System.out.println("Seconds --> "+getDurationString(6451));
        System.out.println("Minutes Seconds --> "+getDurationString(155,36));
    }
    public static String getDurationString(int seconds) {
        if(seconds>=0) {
            int min = seconds/60;
            int s = seconds%60;
            int h = min/60;
            int m = min%60; 
            return h+"h "+m+"m "+s+"s";
        }
        return "Invalid Value";
    }
    public static String getDurationString(int minutes, int seconds) {
        if(minutes>=0 && seconds>=0 && seconds<=59) {
            int h = minutes/60;
            int m = minutes%60; 
            return h+"h "+m+"m "+seconds+"s";
        }
        return "Invalid Value";
    }
}

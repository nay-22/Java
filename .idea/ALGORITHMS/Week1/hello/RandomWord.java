package ALGORITHMS.Week1.hello;
import edu.princeton.cs.algs4.*;

public class RandomWord {
    public static void main(String[] args) {
        String ans = "";
        for(int i=1; !StdIn.isEmpty(); i++) {
            String word = StdIn.readString();
            if(StdRandom.bernoulli(1/(double)i)) {
                ans = word;
            }
        }
        System.out.println(ans);
    }
}

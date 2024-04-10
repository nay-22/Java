package COLLECTION_FRAMEWORK.Top30InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class OnePiece implements Comparable<OnePiece>{
    private String name;
    private int age;
    private double bounty;
    public OnePiece(String name, int age, double bounty) {
        this.name = name;
        this.age = age;
        this.bounty = bounty;
    }
    public double getBounty() {
        return this.bounty;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(OnePiece o) {
//        return (int)(this.bounty - o.getBounty());
        return (int)(o.getBounty() - this.bounty);
    }

    @Override
    public String toString() {
        return "OnePiece{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bounty=" + bounty +
                "}\n";
    }

    public static void main(String[] args) {
        ArrayList<OnePiece> strawHatMembers = new ArrayList<>();
        strawHatMembers.add(new OnePiece("Luffy",19,4));
        strawHatMembers.add(new OnePiece("Zoro",23,3));
        strawHatMembers.add(new OnePiece("Sanji",23,2));

        Collections.sort(strawHatMembers);

        System.out.println(strawHatMembers);

    }
}

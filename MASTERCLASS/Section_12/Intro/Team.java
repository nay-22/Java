package MASTERCLASS.Section_12.Intro;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String teamName;
    private List<T> team = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team() {

    }

    public void addTeamMember(T t) {
        if (!team.contains(t)) {
            team.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(team);
    }

    public int ranking() {
        return (totalLosses*2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}

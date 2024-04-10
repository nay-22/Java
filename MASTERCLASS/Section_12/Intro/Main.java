package MASTERCLASS.Section_12.Intro;

import java.util.Arrays;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");

        var harper = new BaseballPlayer("B. Harper", "Right Fielder");
        var joe = new BaseballPlayer("B. Joe", "Left Fielder");

        Team<BaseballPlayer> baseballTeam = new Team<>("Test team");
        baseballTeam.addTeamMember(harper);
        baseballTeam.addTeamMember(joe);

        phillies.addTeamMember(harper);
        phillies.addTeamMember(joe);
        phillies.listTeamMembers();

        baseballTeam.listTeamMembers();
        System.out.println(baseballTeam.getClass().getSimpleName());
    }
}


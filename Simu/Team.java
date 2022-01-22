package Simu;

import Players.Player;
import project.Venue;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private Venue venue;
    private final ArrayList<Player> players = new ArrayList<>();
    public Team(String teamName, Venue venue){
        this.setTeamName(teamName);
        this.setVenue(venue);
    }

    public String getTeamName() {

        return teamName;
    }

    public void setTeamName(String teamName) {

        this.teamName = teamName;
    }


    public Venue getVenue() {

        return venue;
    }

    public void setVenue(Venue venue) {

        this.venue = venue;
    }

    public ArrayList<Player> getPlayers() {

        return players;
    }

    public void setPlayer(Player player) {

        this.players.add(player);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", venue=" + venue +
                // ", players=" + players +
                '}';
    }

}

package Players;

import Simu.Team;

public class Player {
    private String playerName;
    private Team teamName;
    private String role;

    public Player(String playerName, String role, Team teamName) {
        setPlayerName(playerName);
        setTeamName(teamName);
        setRole(role);
    }

    public Player() {

    }

    public String getPlayerName() {

        return playerName;
    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;
    }

    public Team getTeamName() {

        return teamName;
    }

    public void setTeamName(Team teamName) {

        this.teamName = teamName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {

        this.role = role;
    }


}

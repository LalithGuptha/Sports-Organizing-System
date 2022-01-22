package Simu;

import java.util.ArrayList;
import java.util.Comparator;

public class PointsTable {
    private Team team;
    private int position, points, played, won, lost;
    private double netRunRate;

    public PointsTable(Team team, int position, int points, int played, int won, int lost, double netRunRate) {
        setTeam(team);
        setPosition(position);
        setPlayed(played);
        setPoints(points);
        setWon(won);
        setLost(lost);
        setNetRunRate(netRunRate);
    }

    public PointsTable(Team team) {
        setTeam(team);
        setPosition(0);
        setPoints(0);
        setPlayed(0);
        setWon(0);
        setLost(0);
        setNetRunRate(0.0);
    }
    public PointsTable()
    {

    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getNetRunRate() {
        return netRunRate;
    }

    public void setNetRunRate(double netRunRate) {
        this.netRunRate = netRunRate;
    }

    public void incwon(){ this.won++; }
    public void inclost(){ this.lost++;}
    public void incpoints(int a){ this.points = this.points+a;}
    public void incplayed(){ this.played++;}
    public void incnrr(double nrr){ this.netRunRate = this.netRunRate + nrr ;}
    public void decnrr(double nrr){ this.netRunRate= Math.round(this.netRunRate- nrr);}
    public void points(ArrayList<PointsTable> table){

        table.sort(Comparator.comparing(PointsTable::getPoints).thenComparing(PointsTable::getNetRunRate).reversed());
        for(int i=0;i< table.size();i++)
        {
            table.get(i).setPosition(i+1);
        }
    }


    @Override
    public String toString() {
        return "PointsTable:" +
                "Team:" + team.getTeamName() +
                ", Position=" + position +
                ", Points=" + points +
                ", Played=" + played +
                ", Won=" + won +
                ", Lost=" + lost +
                ", NetRunRate=" + String.format("%.2f",netRunRate)
                + "\n ";
    }
}

package Simu;

import java.util.Random;

public class Toss {
    private Team callBy, wonBy, other;
    String choice;

    public Toss(Team callBy, Team other){
        setCallBy(callBy);
        setOther(other);
    }
    public Team getCallBy() {
        return callBy;
    }

    public void setCallBy(Team callBy) {
        this.callBy = callBy;
    }

    public Team getWonBy() {
        return wonBy;
    }

    public void setWonBy(Team wonBy) {
        this.wonBy = wonBy;
    }

    public Team getOther() {
        return other;
    }

    public void setOther(Team other) {
        this.other = other;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Team coinFlip(){
        Random r = new Random();
        if(r.nextInt(2)==0){
            setWonBy(callBy);
            this.choice = choice();
        }
        else{
            setWonBy(other);
            this.choice =choice();
        }
        return getWonBy();

    }
    private String choice(){
        Random r  = new Random();
        int a = r.nextInt(2);
        if(a==0){
            return "Batting";
        }
        else{
            return "Bowling";
        }
    }
}

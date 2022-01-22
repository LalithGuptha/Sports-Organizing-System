package Players;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Batsman extends Player implements Salary{

    private int runsscored, inningsplayed, ballsfaced, noof4, noof6;
    private double salary;

    public Batsman(Player player) {
        super(player.getPlayerName(), player.getRole(), player.getTeamName());
        setRunsscored(0);
        setBallsfaced(0);
        setInningsplayed(2);
        setNoof4(0);
        setNoof6(6);
    }

    public int getRunsscored() {
        return runsscored;
    }

    public void setRunsscored(int runsscored) {
        this.runsscored = runsscored;
    }

    public int getInningsplayed() {
        return inningsplayed;
    }

    public void setInningsplayed(int inningsplayed) {
        this.inningsplayed = inningsplayed;
    }



    public int getBallsfaced() {
        return ballsfaced;
    }

    public void setBallsfaced(int ballsfaced) {this.ballsfaced = ballsfaced;}

    public int getNoof4() {return noof4;}

    public void setNoof4(int noof4) {this.noof4 = noof4;}

    public int getNoof6() {return noof6;}

    public void setNoof6(int noof6) {this.noof6 = noof6;}

    @Override
    public void calcSalary() throws IOException {

        salary = BASIC_PAY + getRunsscored()*10 + getNoof6()*6+ getNoof4()*4;
        write();

    }

    @Override
    public void write() throws IOException {
        String s = this.getPlayerName()+".txt";
        File file = new File(s);
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("Salary of the player is "+ Double.toString(salary)+ "\n");
        fileWriter.close();
    }
}

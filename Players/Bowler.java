package Players;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bowler extends Player implements Salary{
    private int runsconceded, ballsbowled, wicketstaken, oversbowled, economy, maiden;
    double salary;

    public Bowler(Player player) {
        super(player.getPlayerName(), player.getRole(), player.getTeamName());
        setBallsbowled(0);
        setEconomy(0);
        setMaiden(0);
        setRunsconceded(0);
        setWicketstaken(0);
    }


    public int getRunsconceded() {
        return runsconceded;
    }

    public void setRunsconceded(int runsconceded) {
        this.runsconceded = runsconceded;
    }

    public int getBallsbowled() {
        return ballsbowled;
    }

    public void setBallsbowled(int ballsbowled) {
        this.ballsbowled = ballsbowled;
    }

    public int getWicketstaken() {
        return wicketstaken;
    }

    public void setWicketstaken(int wicketstaken) {
        this.wicketstaken = wicketstaken;
    }

    public int getOversbowled() {
        return oversbowled;
    }

    public void setOversbowled(int oversbowled) {
        this.oversbowled = oversbowled;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public int getMaiden() {
        return maiden;
    }

    public void setMaiden(int maiden) {
        this.maiden = maiden;
    }

    @Override
    public void calcSalary() throws IOException {
        salary =  BASIC_PAY+ getRunsconceded()*0.01 + getBallsbowled()/getRunsconceded() + getWicketstaken()*25;
        write();
    }



    @Override
    public void write() throws IOException {
        String s = this.getPlayerName()+".txt";
        File file = new File(s);
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("Salary of the player is "+ Double.toString(salary)+"\n");
        fileWriter.close();
    }
}

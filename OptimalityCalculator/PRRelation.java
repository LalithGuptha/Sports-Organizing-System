package OptimalityCalculator;

import java.util.ArrayList;
import java.util.Comparator;

public class PRRelation {
    private String name;
    private String firm;
    public int Rating;
    private double experience;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public int getR() {
        return this.Rating;
    }

    public void setR(int r) {
        this.Rating = r;
    }

    public PRRelation(String name, String firm, int r, double experience) {
        this.name = name;
        this.firm = firm;
        this.Rating = r;
        this.experience = experience;
    }
    public PRRelation() {}

    public void opCalc(ArrayList <PRRelation> pr) {
            double cs = 0, cavg = 0;
            int rs = 0, ravg = 0;
            for (int i = 0; i < pr.size(); i++) {
                cs = cs + pr.get(i).getExperience();
                rs = rs + pr.get(i).getR();
            }
            cavg = cs / pr.size();
            ravg = rs / pr.size();
            ArrayList<PRRelation> best = new ArrayList<>();

            for (int i = 0; i < pr.size(); i++) {
                if (pr.get(i).getExperience() >= cavg && pr.get(i).getR() >= ravg) {
                    best.add(pr.get(i));
                }
            }

            best.sort(Comparator.comparing(PRRelation::getExperience).reversed().thenComparing(PRRelation::getR).reversed());
            System.out.println("\nOptimal PR:"+best.get(0));
        }


    public String toString() {
        return
                "Manager Name:" + name + " " +
                ", Firm:'" + firm + '\'' +",Rating:"+ this.Rating +
                ", Experience:" + experience+" years";
    }
}


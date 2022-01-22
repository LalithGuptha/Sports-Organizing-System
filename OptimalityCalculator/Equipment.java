package OptimalityCalculator;

import java.util.ArrayList;
import java.util.Comparator;


public class Equipment {
    private String name;
    private String brand;
    private String type;
    private double price;
    private double qualityPercent;


    public Equipment(String name, String brand, String type, double price, double qualityPercent) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.qualityPercent = qualityPercent;
    }

    public Equipment() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQualityPercent() {
        return qualityPercent;
    }

    public void setQualityPercent(double qualityPercent) {
        this.qualityPercent = qualityPercent;
    }

    public void opCalc(ArrayList<Equipment> equipment) {
        double cs = 0, cavg = 0;
        double rs = 0, ravg = 0;

        for (int i = 0; i < equipment.size(); i++) {
            cs = cs + equipment.get(i).getPrice();
            rs = rs + equipment.get(i).getQualityPercent();
        }
        cavg = cs / equipment.size();
        ravg = rs / equipment.size();
        ArrayList<OptimalityCalculator.Equipment> best = new ArrayList<>();

        for (int i = 0; i < equipment.size(); i++) {
            if (equipment.get(i).getPrice() <= cavg && equipment.get(i).getQualityPercent() >= ravg) {
                best.add(equipment.get(i));
            }
        }

        best.sort(Comparator.comparing(Equipment::getPrice).thenComparing(Equipment::getQualityPercent));
        System.out.println("\nOptimal Equipment:"+best.get(0));
    }

    ;

    public String toString() {
        return
                "Equipment Name:'" + name + '\'' +
                        ", Brand:'" + brand + '\'' +
                        ", Type:'" + type + '\'' +
                        ", Price:" + price +
                        ", QualityPercent:" + qualityPercent;
    }


}

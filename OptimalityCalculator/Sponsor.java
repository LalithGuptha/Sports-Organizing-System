package OptimalityCalculator;

import java.util.ArrayList;
import java.util.Comparator;

public class Sponsor {

	private String name;
	private double contribution;
	private int reputation;

	public Sponsor(String name, double contribution, int reputation) {
		this.name = name;
		this.contribution = contribution;
		this.reputation = reputation;
	}

	public Sponsor() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getContribution() {
		return contribution;
	}

	public void setContribution(double contribution) {
		this.contribution = contribution;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public void opCalc(ArrayList<Sponsor> sponsors) {
		double cs = 0, cavg = 0;
		int rs = 0, ravg = 0;
		for (int i = 0; i < sponsors.size(); i++) {
			cs = cs + sponsors.get(i).getContribution();
			rs = rs + sponsors.get(i).getReputation();
		}
		cavg = cs / sponsors.size();
		ravg = rs / sponsors.size();
		ArrayList<Sponsor> best = new ArrayList<>();

		for (int i = 0; i < sponsors.size(); i++) {
			if (sponsors.get(i).getContribution() >= cavg && sponsors.get(i).getReputation() >= ravg) {
				best.add(sponsors.get(i));
			}
		}

		best.sort(Comparator.comparing(Sponsor::getContribution).reversed().thenComparing(Sponsor::getReputation).reversed());
		System.out.println("\nOptimal Sponsor:"+best.get(0));
	};

	public String toString() {
		return
				"Sponsor name:'" + name + '\'' +
				", Contribution:" + contribution +
				", Reputation:" + reputation;
	}

}

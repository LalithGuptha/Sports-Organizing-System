package win_predictor;

public class Achievements {
 
private String awards;
private int achievedYear;

//CONSTRUCTORS

public Achievements()
{
	
}

public Achievements(String awards, int achievedYear) {
	this.awards = awards;
	this.achievedYear = achievedYear;
}

//GETTER SETTER

/**
 * @return the awards
 */
public String getAwards() {
	return awards;
}

/**
 * @param awards the awards to set
 */
public void setAwards(String awards) {
	this.awards = awards;
}

/**
 * @return the achievedYear
 */
public int getAchievedYear() {
	return achievedYear;
}

/**
 * @param achievedYear the achievedYear to set
 */
public void setAchievedYear(int achievedYear) {
	this.achievedYear = achievedYear;
}

 

}

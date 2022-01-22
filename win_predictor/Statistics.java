package win_predictor;

public class Statistics {
	
private float average;
private String strength;
private String weakness;
private int experience;
private float highScore;

//CONSTRUCTORS
public Statistics(float average, String strength, String weakness, int experience, float highScore) {
	super();
	this.average = average;
	this.strength = strength;
	this.weakness = weakness;
	this.experience = experience;
	this.highScore = highScore;
}

//GETTER SETTER
public Statistics() {}

/**
 * @return the average
 */
public float getAverage() {
	return average;
}

/**
 * @param average the average to set
 */
public void setAverage(float average) {
	this.average = average;
}

/**
 * @return the strength
 */
public String getStrength() {
	return strength;
}

/**
 * @param strength the strength to set
 */
public void setStrength(String strength) {
	this.strength = strength;
}

/**
 * @return the weakness
 */
public String getWeakness() {
	return weakness;
}

/**
 * @param weakness the weakness to set
 */
public void setWeakness(String weakness) {
	this.weakness = weakness;
}

/**
 * @return the experience
 */
public int getExperience() {
	return experience;
}

/**
 * @param experience the experience to set
 */
public void setExperience(int experience) {
	this.experience = experience;
}

/**
 * @return the highScore
 */
public float getHighScore() {
	return highScore;
}

/**
 * @param highScore the highScore to set
 */
public void setHighScore(float highScore) {
	this.highScore = highScore;
}


public void  calculatepower()
{	int s1,s2;
 s1=0;
 s2=0;
	if((this.average>=10 && this.average<=15) &&(this.highScore>64&&this.highScore<75))
	{
		s1+=1;
	}
	else
	{
		s2+=1;
	}
	
	System.out.println(s1);
	System.out.println(s2);
}





}

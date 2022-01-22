package win_predictor;

public class Player {
private String name;
private int age;
private float height;
private String role;
private Statistics playerStats;
private Team teamDetails;

//CONSTRUCTORS
public Player(String name, int age, float height, String role, Statistics playerStats, Team teamDetails) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.role = role;
	this.playerStats = playerStats;
	this.teamDetails = teamDetails;
}

//GETTER SETTERS 

public Player()
{
	
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * @return the height
 */
public float getHeight() {
	return height;
}

/**
 * @param height the height to set
 */
public void setHeight(float height) {
	this.height = height;
}

/**
 * @return the role
 */
public String getRole() {
	return role;
}

/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}

/**
 * @return the playerStats
 */
public Statistics getPlayerStats() {
	return playerStats;
}

/**
 * @param playerStats the playerStats to set
 */
public void setPlayerStats(Statistics playerStats) {
	this.playerStats = playerStats;
}

/**
 * @return the teamDetails
 */
public Team getTeamDetails() {
	return teamDetails;
}

/**
 * @param teamDetails the teamDetails to set
 */
public void setTeamDetails(Team teamDetails) {
	this.teamDetails = teamDetails;
}








}

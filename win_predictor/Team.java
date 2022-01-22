package win_predictor;

public class Team {
private String team_name; 
private String captain;
private String owner;

//CONSTRUCTORS
public Team()
{
	
}
public Team(String team_name, String captain, String owner) {
	super();
	this.team_name = team_name;
	this.captain = captain;
	this.owner = owner;
}

//GETTER SETTERS

/**
 * @return the team_name
 */
public String getTeam_name() {
	return team_name;
}
/**
 * @param team_name the team_name to set
 */
public void setTeam_name(String team_name) {
	this.team_name = team_name;
}
/**
 * @return the captain
 */
public String getCaptain() {
	return captain;
}
/**
 * @param captain the captain to set
 */
public void setCaptain(String captain) {
	this.captain = captain;
}
/**
 * @return the owner
 */
public String getOwner() {
	return owner;
}
/**
 * @param owner the owner to set
 */
public void setOwner(String owner) {
	this.owner = owner;
}






}

package CheckEvent;

import win_predictor.*;

public class Reschedule {

private Team teamR;
private Team teamR1;
public Team getTeamR1() {
	return teamR1;
}
public void setTeamR1(Team teamR1) {
	this.teamR1 = teamR1;
}
private String timeR;
/**
 * @return the teamR
 */
public Team getTeamR() {
	return teamR;
}
/**
 * @param teamR the teamR to set
 */
public void setTeamR(Team teamR) {
	this.teamR = teamR;
}
/**
 * @return the timeR
 */
public String getTimeR() {
	return timeR;
}
/**
 * @param timeR the timeR to set
 */
public void setTimeR(String timeR) {
	this.timeR = timeR;
}
public Reschedule(Team teamR,Team teamR1, String timeR) {
	 this.teamR1=teamR1;
	this.teamR = teamR;
	this.timeR = timeR;
}

 
}

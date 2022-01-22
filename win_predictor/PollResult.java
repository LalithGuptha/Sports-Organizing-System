package win_predictor;

public class PollResult {
private int pollTotalCount;
private int team1PollCount;
private int team2Pollcount;

//CONSTRUCTORS
public PollResult()
{
	
}
public PollResult(int pollTotalCount, int team1PollCount, int team2Pollcount) {
	super();
	this.pollTotalCount = pollTotalCount;
	this.team1PollCount = team1PollCount;
	this.team2Pollcount = team2Pollcount;
}

//GETTER SETTER

/**
 * @return the pollTotalCount
 */
public int getPollTotalCount() {
	return pollTotalCount;
}
/**
 * @param pollTotalCount the pollTotalCount to set
 */
public void setPollTotalCount(int pollTotalCount) {
	this.pollTotalCount = pollTotalCount;
}
/**
 * @return the team1PollCount
 */
public int getTeam1PollCount() {
	return team1PollCount;
}
/**
 * @param team1PollCount the team1PollCount to set
 */
public void setTeam1PollCount(int team1PollCount) {
	this.team1PollCount = team1PollCount;
}
/**
 * @return the team2Pollcount
 */
public int getTeam2Pollcount() {
	return team2Pollcount;
}
/**
 * @param team2Pollcount the team2Pollcount to set
 */
public void setTeam2Pollcount(int team2Pollcount) {
	this.team2Pollcount = team2Pollcount;
}








}

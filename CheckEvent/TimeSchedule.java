package CheckEvent;

public class TimeSchedule {
private String date;
private String time;
private int slot;
private String team1;
private String team2;

//CONSTRUCTORS

public TimeSchedule() {}
public TimeSchedule(String date, String time, int slot, String team1, String team2) {
	super();
	this.date = date;
	this.time = time;
	this.slot = slot;
	this.team1 = team1;
	this.team2 = team2;
}

//GETTER SETTER

/**
 * @return the date
 */
public String getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(String date) {
	this.date = date;
}
/**
 * @return the time
 */
public String getTime() {
	return time;
}
/**
 * @param time the time to set
 */
public void setTime(String time) {
	this.time = time;
}
/**
 * @return the slot
 */
public int getSlot() {
	return slot;
}
/**
 * @param slot the slot to set
 */
public void setSlot(int slot) {
	this.slot = slot;
}
/**
 * @return the team1
 */
public String getTeam1() {
	return team1;
}
/**
 * @param team1 the team1 to set
 */
public void setTeam1(String team1) {
	this.team1 = team1;
}
/**
 * @return the team2
 */
public String getTeam2() {
	return team2;
}
/**
 * @param team2 the team2 to set
 */
public void setTeam2(String team2) {
	this.team2 = team2;
}

/*
 * ensureCurrentWeather(String type):boolean
 * ensureUpCommingWeather(String upcommingType):boolean
 * run(String type,String upcommingType)
 */






}

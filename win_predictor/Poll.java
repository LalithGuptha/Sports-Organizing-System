package win_predictor;

public class Poll {
private String audienceName;
private String audiencechoice;

//CONSTRUCTORS
public 	Poll() {}
public Poll(String audienceName, String audience) {
	this.audienceName = audienceName;
	this.audiencechoice = audience;
}
//GETTER SETTER 
/**
 * @return the audienceName
 */
public String getAudienceName() {
	return audienceName;
}
/**
 * @param audienceName the audienceName to set
 */
public void setAudienceName(String audienceName) {
	this.audienceName = audienceName;
}
/**
 * @return the audience
 */
public String getAudiencechoice() {
	return audiencechoice;
}
/**
 * @param audience the audience to set
 */
public void setAudiencechoice(String audience) {
	this.audiencechoice = audience;
}

/*
 * ensure(in choice:String): boolean
 * repoll(): String
 * 
 */

}

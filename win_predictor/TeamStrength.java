package win_predictor;

public class TeamStrength {

	private float totalStrength;
	private float batsmenStrength;
	private float bowlerStrength;
	private float feildingStrength;
	private int previousWonMatches;
	
	//CONSTRUCTORS
	public TeamStrength() {}

	public TeamStrength(float totalStrength,float batsmenStrength,float bowlerStrength,float feildingStrength,int previousWonMatches)
	{
		this.totalStrength=totalStrength;
		this.batsmenStrength=batsmenStrength;
		this.bowlerStrength=bowlerStrength;
		this.feildingStrength=feildingStrength;
		this.previousWonMatches=previousWonMatches;
				
	}
	
	//GETTERSETTERS

	/**
	 * @return the totalStrength
	 */
	public float getTotalStrength() {
		return totalStrength;
	}

	/**
	 * @param totalStrength the totalStrength to set
	 */
	public void setTotalStrength(float totalStrength) {
		this.totalStrength = totalStrength;
	}

	/**
	 * @return the batsmenStrength
	 */
	public float getBatsmenStrength() {
		return batsmenStrength;
	}

	/**
	 * @param batsmenStrength the batsmenStrength to set
	 */
	public void setBatsmenStrength(float batsmenStrength) {
		this.batsmenStrength = batsmenStrength;
	}

	/**
	 * @return the bowlerStrength
	 */
	public float getBowlerStrength() {
		return bowlerStrength;
	}

	/**
	 * @param bowlerStrength the bowlerStrength to set
	 */
	public void setBowlerStrength(float bowlerStrength) {
		this.bowlerStrength = bowlerStrength;
	}

	/**
	 * @return the feildingStrength
	 */
	public float getFeildingStrength() {
		return feildingStrength;
	}

	/**
	 * @param feildingStrength the feildingStrength to set
	 */
	public void setFeildingStrength(float feildingStrength) {
		this.feildingStrength = feildingStrength;
	}

	/**
	 * @return the previousWonMatches
	 */
	public int getPreviousWonMatches() {
		return previousWonMatches;
	}

	/**
	 * @param previousWonMatches the previousWonMatches to set
	 */
	public void setPreviousWonMatches(int previousWonMatches) {
		this.previousWonMatches = previousWonMatches;
	}
	
	
	
	/**
	 * 
	 * 
	 * 
	 */
	public float calculateBatsmenStrength(float batsmenStats,int acheievedAwards) {
		
		return this.batsmenStrength + acheievedAwards;
		
	}
	public float calculateBowlerStrength(float bowlerStats ,int acheievedAwards)
	{
		return this.bowlerStrength + acheievedAwards;
	}
	public float calculateFeildngStrength(float feildingStats  , int acheievedAwards )
	{
		return this.feildingStrength + acheievedAwards;
	}
	public void calculateTeamStrength(float st,float avg ) {
		this.totalStrength=this.batsmenStrength+this.bowlerStrength+this.feildingStrength+st+avg;
		 
	}
	
}
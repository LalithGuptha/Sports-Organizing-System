package win_predictor;

public class ComputerResult {

	private String predictedTeam;
	private float team1Strength;
	private float team2Strength;
	
	//CONSTRUCTORS
	public ComputerResult() {}
	public ComputerResult(String predictedTeam, float team1Strength, float team2Strength) {
		this.predictedTeam = predictedTeam;
		this.team1Strength = team1Strength;
		this.team2Strength = team2Strength;
	}
	public ComputerResult( float team1Strength, float team2Strength) {
	 
		this.team1Strength = team1Strength;
		this.team2Strength = team2Strength;
	}
	/**
	 * @return the predictedTeam
	 */
	public String getPredictedTeam() {
		return predictedTeam;
	}
	/**
	 * @param predictedTeam the predictedTeam to set
	 */
	public void setPredictedTeam(String predictedTeam) {
		this.predictedTeam = predictedTeam;
	}
	/**
	 * @return the team1Strength
	 */
	public float getTeam1Strength() {
		return team1Strength;
	}
	/**
	 * @param team1Strength the team1Strength to set
	 */
	public void setTeam1Strength(float team1Strength) {
		this.team1Strength = team1Strength;
	}
	/**
	 * @return the team2Strength
	 */
	public float getTeam2Strength() {
		return team2Strength;
	}
	/**
	 * @param team2Strength the team2Strength to set
	 */
	public void setTeam2Strength(float team2Strength) {
		this.team2Strength = team2Strength;
	}
	
	//GETTERSETTERS
	
	/**
	 * compareTeamStrength(in team1Strength:float, in team2Strength:float): float
	 * 
	 * 
	 * predict(in team1Strength:float, in team2Strength:float): String
	 */
	public int strongTeam(float team1Strength,float team2Strength) {
		if(team1Strength>team2Strength)
		{
			return 1;
		}
		else
		{
			return 2;
		}
		}
	public  int weakTeam(float team1Strength, float team2Strength)
	{
		if(team1Strength<team2Strength)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	
	public String predict(float team1Strength ,float team2Strength)
	{
		if(team1Strength>team2Strength)
		{
			return "team1";
		}
		else
		{
			return "team2";
		}
	}
	
	
	
	
	
	
	

}

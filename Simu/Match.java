package Simu;

import project.Venue;

import java.time.LocalDate;
import java.util.ArrayList;

public class Match {

	private int matchNumber;
	private LocalDate date;
	private ArrayList<Team> teams = new ArrayList<>(2);
	private Venue venue;



	public Match(int matchNumber, LocalDate date, Team team1,Team team2, Venue venue) {
		super();
		this.matchNumber = matchNumber;
		this.date = date;
		this.teams.add(0,team1);
		this.teams.add(1,team2);
		this.venue = venue;
	}

	public Match(Match peek)
	{

	}


	public int getMatchNumber() {
		return matchNumber;
	}



	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public ArrayList<Team> getTeams() {
		return teams;
	}


	public void setTeamsofmatch(Team a, Team b) {
		this.teams.add(a);
		this.teams.add(b);
	}



	public Venue getVenue() {
		return venue;
	}



	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return
				"MatchNumber:" + matchNumber +
						", Date:" + date +
						", Teams:" + teams.get(0).getTeamName() +" vs "+teams.get(1).getTeamName()+
						", Venue:" + venue.getVenueName();
	}

	// playmatch(); - func for renga
	// sendmail()


}


package project;

public class Event {

	public static String eventName;
	private String manager;
	private double budget;
	
	
	public Event(String eventName, String manager, double budget) {
		this.eventName = eventName;
		this.manager = manager;
		this.budget = budget;
	}

	public static String getEventName() {
		return eventName;
	}

	public static void setEventName(String eventName) {
		Event.eventName = eventName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	
}

package project;

public class Venue {

	private String venueName;
	private int capacity;
	private String location;

	public Venue(String venueName, int capacity, String location) {
		this.venueName = venueName;
		this.capacity = capacity;
		this.location = location;
	}

	public String getVenueName() {
		if(venueName.equals(null))
			return "null";
		else {
			return venueName;
		}
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "VenueName:'" + venueName + '\'' +
				", Capacity:" + capacity +
				", Location:'" + location + '\'';
	}
}

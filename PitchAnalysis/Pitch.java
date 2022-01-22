package PitchAnalysis;

public class Pitch implements Runnable{

	private double moisture;
	private String grass;
	private String weather;
	private double temperature;
	private double cracks;
	private String type;
	
	
	public Pitch(double moisture, String grass, String weather, double temperature, double cracks) {
		this.moisture = moisture;
		this.grass = grass;
		this.weather = weather;
		this.temperature = temperature;
		this.cracks = cracks;
	}
	public Pitch() {}

	public double getMoisture() {
		return moisture;
	}

	public void setMoisture(double moisture) {
		this.moisture = moisture;
	}

	public String getGrass() {
		return grass;
	}

	public void setGrass(String grass) {
		this.grass = grass;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getCracks() {
		return cracks;
	}

	public void setCracks(double cracks) {
		this.cracks = cracks;
	}

	public void run()
	{
		synchronized (this) {
			find();
		}
	}

	public void find() {
		double pitchavg;
		pitchavg = this.moisture + this.cracks / (double) (2);
		if (pitchavg <= 50) {
				if (this.grass.equals("straw") && (this.weather.equals("Rainy") || this.weather.equals("Cloudy"))) {
					this.type = "Dead Pitch";
			}
		} else {
				if (this.grass.equals("couch") && this.temperature >= 20 && (this.weather.equals("Sunny") || this.weather.equals("Cloudy"))) {
						this.type = "Dusty Pitch";
			}
				else {
					if (pitchavg >= 30 && this.grass.equals("green") && this.temperature >= 20 && (this.weather.equals("Sunny") || this.weather.equals("Cloudy"))) {
						this.type = "Green Pitch";
				}
					else {
						if(this.grass.equals("green"))
							this.type = "Green Pitch";


						else
						{
							this.type = "Dusty Pitch";
						}
				}
			}
		}
		System.out.println("\n"+this.type+"-("+this.moisture+","+this.grass+")");
	}

}

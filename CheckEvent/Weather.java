package CheckEvent;

public class Weather {
private String type;
private String upcommingType;

public Weather(){
}

public Weather(String type, String upcommingType) {
	 
	this.type = type;
	this.upcommingType = upcommingType;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getUpcommingType() {
	return upcommingType;
}

public void setUpcommingType(String upcommingType) {
	this.upcommingType = upcommingType;
}

public boolean ensureCurrentWeather(String weather)
{
	if(weather.equals("cloudy")||weather.equals("rainy")||weather.equals("moist"))
	{
		return false;
	}
	else
	{
		return true;
	}
}

public boolean ensureUpCommingWeather(String upcommingType)
{
	if( upcommingType.equals("cloudy")|| upcommingType.equals("rainy")|| upcommingType.equals("moist"))
	{
		return false;
	}
	else
	{
		return true;
	}
}

public boolean run(String weather,String upcommingType)
{
	if(ensureCurrentWeather(weather)&&ensureUpCommingWeather(upcommingType))
	{
		System.out.println("Weather : Sunny (Perfect)");
		System.out.println("************************************************************************************************************************************************************************");
		
		return true;
	}
	else
	{
		System.out.println("Weather :  ((x)BAD WEATHER)\n\n");
		System.out.println("************************************************************************************************************************************************************************");
		
		return false;
	}
}

 
}

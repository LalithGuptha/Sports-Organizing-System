package oopproj;

public class EventManager {
	
	private String ename;
	private float esal;
	private String etype;
	private float workHours;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public float getWorkHours() {
		return workHours;
	}
	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}
	@Override
	public String toString() {
		return "EventManager [ename=" + ename + ", esal=" + esal + ", etype=" + etype + ", workHours=" + workHours
				+ "]";
	}
	public EventManager() {
		super();
	}
	public EventManager(String ename, float esal, String etype, float workHours) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.etype = etype;
		this.workHours = workHours;
	}
	
	public String sendDiscountDetails()
	{
		return "oopproj\\promocodes.csv";
	}
	public String sendBankDetails()
	{
		return "oopproj\\bankpartners.csv";
	}
}

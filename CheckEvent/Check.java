package CheckEvent;
import win_predictor.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Check {
private String time;
private float Strength;
private String weather;
private boolean verify;

//CONSTRUCTORS
public Check() {}

public Check(String time, float strength, String weather, boolean verify) {
	super();
	this.time = time;
	Strength = strength;
	this.weather = weather;
	this.verify = verify;
}


//GETTER SETTER

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
 * @return the strength
 */
public float getStrength() {
	return Strength;
}

/**
 * @param strength the strength to set
 */
public void setStrength(float strength) {
	Strength = strength;
}

/**
 * @return the weather
 */
public String getWeather() {
	return weather;
}

/**
 * @param weather the weather to set
 */
public void setWeather(String weather) {
	this.weather = weather;
}

/**
 * @return the verify
 */
public boolean isVerify() {
	return verify;
}

/**
 * @param verify the verify to set
 */
public void setVerify(boolean verify) {
	this.verify = verify;
}

 
public boolean verifyTime(String time1 , String time2)
{
	if(time1.equals(time2))
	{
		 System.out.println("Time : "+time2);
		 
		 return true;
	}
	else
	{
		System.out.println("Time : ((X)NOT MATCHED )");
		return false;
	}

}

/*public boolean verifyStrength(float strength1, float Strength)
{
	
	
}*/

public boolean verifyWeather(String weather1,String weather2)
{boolean r;
	Weather wc = new Weather(weather1,weather2);
	r=wc.run(wc.getType(),wc.getUpcommingType());
	return r;
	
}

public boolean ensureAll(String time,float strength,String weather)
{
		
	return false;
}

public void testDriver()
{
	int cc=0;
	String k1=new String();
	String k2=new String();
	 String path1 = "CheckEvent//checkInput.csv";
	
	String line1 = "";
	try {
		BufferedReader br1 = new BufferedReader(new FileReader(path1));
		line1 = br1.readLine();
		
		while((line1 = br1.readLine())!=null )
		{
			 String[] prod1 = line1.split(",");
			 k1=prod1[0];
			 k2=prod1[1];
			 
			 
			 
			 
			 
				Check c1=new Check();
				
				Scanner sc=new Scanner(System.in);
				String name,captian,owner;
				 

						System.out.println("\t\t\t\t\t\t\t\t\tCHECK  EVENT");
						System.out.println("************************************************************************************************************************************************************************");
						System.out.println("NOTE: CHECK EVENT PROGRAMME IS USED TO CHECK EVERYTHING IN THE EVENT GOING PROPERLY  SUCH AS ASSIGNED TEAMS , MATCH TIME ,WEATHER CONDICTION,DATE,TIME SCHDULE....");
						System.out.println("************************************************************************************************************************************************************************");
						//(1) CHECKING CORRESPONDING TEAMS 
				System.out.print("Enter the 1st Team name :");
				name=prod1[0];
				System.out.println(name=prod1[0]);
				//System.out.print("Enter the "+name+" Captian name :");
				captian="  ";
				//System.out.print("Enter the "+name + " owner name :");
				owner= "  ";
				
				Team t1=new Team(name,captian,owner);
				
				System.out.print("Enter the 2nd Team name :");
				name=prod1[1];
				System.out.println(name=prod1[1]);
				//System.out.print("Enter the "+name+" Captian name :");
				captian="  ";
				//System.out.print("Enter the "+name + " owner name :");
				owner= "  ";
				Team t2=new Team(name,captian,owner);
				 
				
				//csk mi
				if((t1.getTeam_name().equals("csk"))&&(t2.getTeam_name().equals("mi")))
				{ 
					System.out.println("						//////// ( Assgined Teams are Matched )////////\n\n\n");
					System.out.println("************************************************************************************************************************************************************************");
					
					
					System.out.println("						CHENNAI SUPER KINGS (CSK) VS MUMBAI INDIANS (MI)\n\n");
					//2.CHECKING TIME 
					int q,w,e;
					q=w=e=0;
					boolean r;
					String date;
					String time;
					int slot;
					String team1,team2;
					team1="csk";
					team2="mi";
					System.out.println("Enter Date :(dd-mm-yy) : ");
					//date=sc.next();
					date=prod1[2];
					System.out.println("Enter time :(hr:min)   : ");
					//time=sc.next();
					time=prod1[3];
					System.out.println("Enter slot (1||2 || 3) :");
					//slot=sc.nextInt();
					slot=Integer.parseInt(prod1[4]);
					
					//CHECKING WEATHER 
					System.out.println("Enter the current weather (SUNNY/CLOUDY/RAINY/MOIST) :");
					String weather,weatherc;
					//weather=sc.next();
					weather=prod1[5];
					System.out.println("Enter the upcomming weater (SUNNY/CLOUDY/RAINY/MOIST) :");
					//weatherc=sc.next();
					weatherc=prod1[6];
					System.out.println("************************************************************************************************************************************************************************");
					
					System.out.println("\n\n: GENARATING SLIP  :");
					System.out.println("Team : CSK (VS) MI ");
				
					TimeSchedule t=new TimeSchedule(date,time,slot,team1,team2);
					
					//CHECKING DATE 
					if(date.equals("01-01-2022"))
					{
						System.out.println("Date : 01-01-2022");
						q=1;
					}
					else
					{
						System.out.println("Date : ((X)NOT MATCHED )");
					}
					
					//CHECKING TIME 
					if(c1.verifyTime(time,"10:00"))
					{
						 
						 w=1;
					}
					else
					{
						w=0;
					}
					
					//CHECKING SLOT 
					if(slot==1)
					{
						System.out.println("Slot : 1");
						e=1;
					}
					else
					{
						System.out.println("Slot : ((X)NOT MATCHED )");
					}
					
			//CHECKING WEATHER 
				
					if(c1.verifyWeather(weather, weatherc))
					{
						r=true;
					}
					else
					{
						r=false;
					}
					
					if(q==0||w==0||e==0||r==false)
					{
						System.out.println("\n\n*********The System warns you to Reschdule the match ************");
						
						System.out.println("Enter the time to reschedule the match(hr:min):");
						String ti;
						//ti=sc.next();
						ti=prod1[7];
						System.out.println("Enter Slot to reschdule Match :");
						int slots;
						//slots=sc.nextInt();
						slots=Integer.parseInt(prod1[8]);
						
						Reschedule r1=new Reschedule(t1,t2,ti);
						System.out.println("The match is reschduled you can proceed .....");
						int bsd;
						System.out.println("Do You Want To Genarate the Slip of Reschudled match ::");
						System.out.println("Press: \n(1)Genarate\n(2)Quit");
						System.out.println("Enter : ");
						bsd=1;
						if(bsd==1)
						{
							System.out.println(":: SLIP  ::");
							System.out.println("Reschduled Time : "+ti);
							System.out.println("Reschduled Slot : "+slots);
						}
						else
						{
							System.out.println("\t\t\t\t\t\t\t\t\t Thank you.....");
						}
						
						
						
					}
					else
					{
						System.out.println("\n\n			ALL ARE GOING PERFECT YOU ARE READY TO START MATCH \n");
						System.out.println("\n\n				ALL THE BEST \n\n");
					}
					
					 
					 
				}
				else if((t1.getTeam_name().equals("csk"))&&t2.getTeam_name()!="mi")
				{
					System.out.println("							******Assgined Teams are Not matched(CSK is schduled with mi )*******");
				}
				else if((t1.getTeam_name()!="csk")&&t2.getTeam_name().equals("mi"))
				{
					System.out.println("							******Assgined Teams are Not matched(mi is schduled with CSK )*******");
				}
				
				//rcb kkr
				else if((t1.getTeam_name().equals("rcb"))&&(t2.getTeam_name().equals("kkr")))
					
				{
					System.out.println("							******Assgined Teams are Matched*******");
					
					System.out.println("						ROYAL CHALLENGERS BANGLORE (RCB) VS KOLKATHA KNIGHT RIDERS (KKR)\n\n");
					//2.CHECKING TIME 
					int q,w,e;
					q=w=e=0;
					boolean r;
					String date;
					String time;
					int slot;
					String team1,team2;
					team1="RCB";
					team2="KKR";
					System.out.println("Enter Date :(dd-mm-yy) : ");
					//date=sc.next();
					date=prod1[2];
					System.out.println("Enter time :(hr:min)   : ");
					//time=sc.next();
					time=prod1[3];

					System.out.println("Enter slot (1||2 || 3) : ");
					slot=Integer.parseInt(prod1[4]);

					//CHECKING WEATHER 
					System.out.println("Enter the current weather (SUNNY/CLOUDY/RAINY/MOIST) :");
					String weather,weatherc;
					weather=prod1[5];
					System.out.println("Enter the upcomming weater (SUNNY/CLOUDY/RAINY/MOIST) :");

weatherc=prod1[6];
					System.out.println("************************************************************************************************************************************************************************");

					System.out.println("\n\n: GENARATING SLIP  :");
					System.out.println("Team : RCB (VS) KKR ");
				
					TimeSchedule t=new TimeSchedule(date,time,slot,team1,team2);
					
					//CHECKING DATE 
					if(date.equals("22-02-2022"))
					{
						System.out.println("Date : 22-02-2022");
						q=1;
					}
					else
					{
						System.out.println("Date : ((X)NOT MATCHED )");
					}
					
					//CHECKING TIME 
					if(c1.verifyTime(time,"13:00"))
					{
						 
						 w=1;
					}
					else
					{
						w=0;
					}
					
					//CHECKING SLOT 
					if(slot==2)
					{
						System.out.println("Slot : 2");
						e=1;
					}
					else
					{
						System.out.println("Slot : ((X)NOT MATCHED )");
					}
					
			//CHECKING WEATHER 
				
					if(c1.verifyWeather(weather, weatherc))
					{
						r=true;
					}
					else
					{
						r=false;
					}
					
					if(q==0||w==0||e==0||r==false)
					{
						System.out.println("\n\n*********The System warns you to Reschdule the match ************");
						
						System.out.println("Enter the time to reschedule the match(hr:min):");
						String ti;
						ti=prod1[7];
						System.out.println("Enter Slot to reschdule Match :");
						int slots;
						slots=Integer.parseInt(prod1[8]);
						
						Reschedule r1=new Reschedule(t1,t2,ti);
						System.out.println("The match is reschduled you can proceed .....");
						int bsd;
						System.out.println("Do You Want To Genarate the Slip of Reschudled match ::");
						System.out.println("Press: \n(1)Genarate\n(2)Quit");
						System.out.println("Enter : ");
						bsd=1;
						if(bsd==1)
						{
							System.out.println(":: SLIP  ::");
							System.out.println("Reschduled Time : "+ti);
							System.out.println("Reschduled Slot : "+slots);
						}
						else
						{
							System.out.println("\t\t\t\t\t\t\t\t\t Thank you.....");
						}
						
						
						
					}
					else
					{
						System.out.println("\n\n			ALL ARE GOING PERFECT YOU ARE READY TO START MATCH \n");
						System.out.println("\n\n				ALL THE BEST \n\n");
					}
					
					 
					
				}
				else if((t1.getTeam_name().equals("rcb")&&(t2.getTeam_name()!="kkr")))
				{
					System.out.println("							******Assgined Teams are Not matched(rcb is schduled with kkr )*******");
				}
				else if((t1.getTeam_name()!="rcb")&&(t2.getTeam_name().equals("kkr")))
				{
					System.out.println("							******Assgined Teams are Not matched(kkr is schduled with rcb )*******");
				}
				
				//srh dc
				else if((t1.getTeam_name().equals("srh"))&&(t2.getTeam_name().equals("dc")))
				{
					System.out.println("							******Assgined Teams are Matched*******");
					
					System.out.println("						SUNRISES HYDRABAD (SRH) VS  DELHI CAPITALS(DC)\n\n");
					//2.CHECKING TIME 
					int q,w,e;
					q=w=e=0;
					boolean r;
					String date;
					String time;
					int slot;
					String team1,team2;
					team1="SRH";
					team2="DC";
					System.out.println("Enter Date :(dd-mm-yy) : ");
					date=prod1[2];

					System.out.println("Enter time :(hr:min)   : ");
					time=prod1[3];

					System.out.println("Enter slot (1||2 || 3) :");

slot=Integer.parseInt(prod1[4]);

					//CHECKING WEATHER 
					System.out.println("Enter the current weather (SUNNY/CLOUDY/RAINY/MOIST) :");
					String weather,weatherc;
					weather=prod1[5];
					System.out.println("Enter the upcomming weater (SUNNY/CLOUDY/RAINY/MOIST) :");
					weatherc=prod1[6];
					System.out.println("************************************************************************************************************************************************************************");

					System.out.println("\n\n: GENARATING SLIP  :");
					System.out.println("Team : SRH (VS) DC ");
				
					TimeSchedule t=new TimeSchedule(date,time,slot,team1,team2);
					
					//CHECKING DATE 
					if(date.equals("04-03-2022"))
					{
						System.out.println("Date : 04-03-2022");
						q=1;
					}
					else
					{
						System.out.println("Date : ((X)NOT MATCHED )");
					}
					
					//CHECKING TIME 
					if(c1.verifyTime(time,"14:00"))
					{
						 
						 w=1;
					}
					else
					{
						w=0;
					}
					
					//CHECKING SLOT 
					if(slot==3)
					{
						System.out.println("Slot : 3");
						e=1;
					}
					else
					{
						System.out.println("Slot : ((X)NOT MATCHED )");
					}
					
			//CHECKING WEATHER 
				
					if(c1.verifyWeather(weather, weatherc))
					{
						r=true;
					}
					else
					{
						r=false;
					}
					
					if(q==0||w==0||e==0||r==false)
					{
						System.out.println("\n\n*********The System warns you to Reschdule the match ************");
						
						System.out.println("Enter the time to reschedule the match(hr:min):");
						String ti;
						ti=prod1[7];
						Reschedule r1=new Reschedule(t1,t2,ti);
						System.out.println("Enter Slot to reschdule Match :");
						int slots;
						slots=Integer.parseInt(prod1[8]);
						
						 
						System.out.println("The match is reschduled you can proceed .....");
						int bsd;
						System.out.println("Do You Want To Genarate the Slip of Reschudled match ::");
						System.out.println("Press: \n(1)Genarate\n(2)Quit");
						System.out.println("Enter : ");
						bsd=1;
						if(bsd==1)
						{
							System.out.println(":: SLIP  ::");
							System.out.println("Reschduled Time : "+ti);
							System.out.println("Reschduled Slot : "+slots);
						}
						else
						{
							System.out.println("\t\t\t\t\t\t\t\t\t Thank you.....");
						}
						
						
						
					}
					else
					{
						System.out.println("\n\n			ALL ARE GOING PERFECT YOU ARE READY TO START MATCH \n");
						System.out.println("\n\n				ALL THE BEST \n\n");
					}
					
					 
					 
				}
				else if((t1.getTeam_name().equals("srh"))&&(t2.getTeam_name()!="dc"))
				{
					System.out.println("							******Assgined Teams are Not matched(srh is schduled with dc )*******");
				}
				else if((t1.getTeam_name()!="srh")&&(t2.getTeam_name().equals("dc")))
				{
					System.out.println("							******Assgined Teams are Not matched(dc is schduled with srh )*******");
				}
				//rr pk
				
				else if((t1.getTeam_name().equals("rr"))&&(t2.getTeam_name().equals("pk")))
				{
					System.out.println("							******Assgined Teams are Matched*******");
					System.out.println("						RAJASTHAN ROYALS (RR) VS  PUNJAB KINGS(PK)\n\n");
					//2.CHECKING TIME 
					int q,w,e;
					q=w=e=0;
					boolean r;
					String date;
					String time;
					int slot;
					String team1,team2;
					team1="csk";
					team2="mi";
					System.out.println("Enter Date :(dd-mm-yy) : ");
					date=prod1[2];
					System.out.println("Enter time :(hr:min)   : ");
					time=prod1[3];
					System.out.println("Enter slot (1||2 || 3)");
					slot=Integer.parseInt(prod1[4]);

					//CHECKING WEATHER 
					System.out.println("Enter the current weather (SUNNY/CLOUDY/RAINY/MOIST)");
					String weather,weatherc;
					weather=prod1[5];

					System.out.println("Enter the upcomming weater (SUNNY/CLOUDY/RAINY/MOIST)");
					weatherc=prod1[6];
					
					System.out.println("\n\n: GENARATING SLIP  :");
					System.out.println("Team : RR (VS) PK ");
				
					TimeSchedule t=new TimeSchedule(date,time,slot,team1,team2);
					
					//CHECKING DATE 
					if(date.equals("06-07-2022"))
					{
						System.out.println("Date : 06-07-2022");
						q=1;
					}
					else
					{
						System.out.println("Date : ((X)NOT MATCHED )");
					}
					
					//CHECKING TIME 
					if(c1.verifyTime(time,"17:00"))
					{
						 
						 w=1;
					}
					else
					{
						w=0;
					}
					
					//CHECKING SLOT 
					if(slot==3)
					{
						System.out.println("Slot : 3");
						e=1;
					}
					else
					{
						System.out.println("Slot : ((X)NOT MATCHED )");
					}
					
			//CHECKING WEATHER 
				
					if(c1.verifyWeather(weather, weatherc))
					{
						r=true;
					}
					else
					{
						r=false;
					}
					
					if(q==0||w==0||e==0||r==false)
					{
						System.out.println("\n\n*********The System warns you to Reschdule the match ************");
						
						System.out.println("Enter the time to reschedule the match(hr:min):");
						String ti;
						ti=prod1[7];
						System.out.println("Enter Slot to reschdule Match :");
						int slots;
						slots=Integer.parseInt(prod1[8]);
						
						Reschedule r1=new Reschedule(t1,t2,ti);
						System.out.println("The match is reschduled you can proceed .....");
						int bsd;
						System.out.println("Do You Want To Genarate the Slip of Reschudled match ::");
						System.out.println("Press: \n(1)Genarate\n(2)Quit");
						System.out.println("Enter : ");
						bsd=1;
						if(bsd==1)
						{
							System.out.println(":: SLIP  ::");
							System.out.println("Reschduled Time : "+ti);
							System.out.println("Reschduled Slot : "+slots);
						}
						else
						{
							System.out.println("\t\t\t\t\t\t\t\t\t Thank you.....");
						}
						
						
						
					}
					else
					{
						System.out.println("\n\n			ALL ARE GOING PERFECT YOU ARE READY TO START MATCH \n");
						System.out.println("\n\n				ALL THE BEST \n\n");
					}
					
				
					
				}
				else if((t1.getTeam_name().equals("rr"))&&(t2.getTeam_name()!="pk"))
				{
					System.out.println("							******Assgined Teams are Not matched(rr is schduled with pk )*******");
				}
				else if((t1.getTeam_name()!="rr")&&(t2.getTeam_name().equals("pk")))
				{
					System.out.println("							******Assgined Teams are Not matched(rr is schduled with pk )*******");
				}
				
				
				
				
				System.out.println("\n\n");
				

				
				cc+=1;
			 
			}
			 
			 
			 
			 
			 
		
	}
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} }}



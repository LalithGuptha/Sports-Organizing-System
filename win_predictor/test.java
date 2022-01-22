package win_predictor;

import java.io.*;
public class test {
 

public  void kasi( )
{
	int inse=1;
	String t1=new String();
	String t2=new String();
	 String path1 = "CheckEvent\\winInput.csv";
	
	String line1 = "";
	try {
		BufferedReader br1 = new BufferedReader(new FileReader(path1));
		line1 = br1.readLine();
		
		while((line1 = br1.readLine())!=null )
		{
			 String[] prod1 = line1.split(",");
			 t1=prod1[0];
			 t2=prod1[1];
			 
			
			 System.out.println("\n\t\t\t\t\t\t\t\t  WIN  PREDICTOR\n");
				System.out.println("**************************************************************************************************************************************************************************************");
				System.out.println("NOTE : WIN PREDICTOR IS A COMPUTER BASED RESULT IT WILL PREDICT A TEAM AS WINNER IN BOTH OF GIVEN TEAMS , BASED ON THE EACH  PLAYER'S STATISTICS ,STRENGTH , AVERAGE ,WEAKNESS,PREVIOUS WON MATCHES");
				System.out.println("**************************************************************************************************************************************************************************************");
				System.out.println("\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\t\t\t\t\t\t\t* Team1   |  Team2*");
				System.out.println("\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\t\t\t\t\t\t\t* CSK     |  MI   *");
				System.out.println("\t\t\t\t\t\t\t\t* RCB     |  KKR  *");
				System.out.println("\t\t\t\t\t\t\t\t* SRH     |  DC   *");
				System.out.println("\t\t\t\t\t\t\t\t* RR      |  PK   *");
				System.out.println("\t\t\t\t\t\t\t\t*******************");
				
				  

				
				
				int mg=0;
				/*Scanner sc=new Scanner(System.in);
				System.out.println("Enter 1st Team Name :");
				t1=sc.next();
				System.out.println("Enter 2nd Team Name :");
				t2=sc.next();*/
				
				
				
				
				Statistics[] csk = new Statistics[11];
				Statistics[] mi=new Statistics[11];
				Statistics[] rcb=new Statistics[11];
				Statistics[] kkr=new Statistics[11];
				Statistics[] srh=new Statistics[11];
				Statistics[] dc=new Statistics[11];
				Statistics[] rr=new Statistics[11];
				Statistics[] pk=new Statistics[11];
				
				csk[0]=new Statistics(12.03f,"batting","feilding",17,52.4f);
				csk[1]=new Statistics(15.03f,"bowling","feilding",20,59.2f);
				csk[2]=new Statistics(16.53f,"batting","bowling",15,51.4f);
				csk[3]=new Statistics(11.03f,"batting","feilding",11,51.4f);
				csk[4]=new Statistics(14.03f,"bowling","batting",15,59.4f);
				csk[5]=new Statistics(18.03f,"feilding","bowling",19,59.5f);
				csk[6]=new Statistics(22.03f,"batting","-",23,65.4f);
				csk[7]=new Statistics(26.03f,"batting","feilding",13,68.4f);
				csk[8]=new Statistics(91.03f,"batting","bowling",19,72.4f);
				csk[9]=new Statistics(16.03f,"bowling","feilding",17,52.4f);
				csk[10]=new Statistics(11.03f,"bowling","batting",17,69.4f);
				
				rcb[0]=new Statistics(22.03f,"bowling","feilding",19,67.4f);
				rcb[1]=new Statistics(11.03f,"bowling","feilding",20,62.2f);
				rcb[2]=new Statistics(12.53f,"bowling","bowling",15,52.4f);
				rcb[3]=new Statistics(14.03f,"feilding","feilding",11,53.4f);
				rcb[4]=new Statistics(16.03f,"bowling","batting",15,51.4f);
				rcb[5]=new Statistics(19.03f,"feilding","bowling",19,59.5f);
				rcb[6]=new Statistics(13.03f,"batting","feilding",23,65.4f);
				rcb[7]=new Statistics(11.03f,"batting","feilding",13,58.4f);
				rcb[8]=new Statistics(19.03f,"batting","bowling",19,62.4f);
				rcb[9]=new Statistics(16.03f,"bowling","feilding",17,52.4f);
				rcb[10]=new Statistics(25.03f,"bowling","batting",17,59.4f);
				
				mi[0]=new Statistics(21.03f,"batting","feilding",19,67.4f);
				mi[1]=new Statistics(10.03f,"bowling","feilding",20,62.2f);
				mi[2]=new Statistics(11.53f,"bowling","bowling",15,51.4f);
				mi[3]=new Statistics(14.03f,"feilding","feilding",11,53.4f);
				mi[4]=new Statistics(12.03f,"bowling","batting",15,58.4f);
				mi[5]=new Statistics(13.03f,"feilding","batting",19,59.5f);
				mi[6]=new Statistics(17.03f,"batting","feilding",23,69.4f);
				mi[7]=new Statistics(22.03f,"batting","feilding",13,51.4f);
				mi[8]=new Statistics(23.03f,"batting","bowling",19,64.4f);
				mi[9]=new Statistics(22.03f,"bowling","feilding",17,72.4f);
				mi[10]=new Statistics(25.03f,"bowling","batting",17,69.4f);
				
				kkr[0]=new Statistics(23.03f,"batting","feilding",17,52.4f);
				kkr[1]=new Statistics(20.03f,"bowling","feilding",20,58.2f);
				kkr[2]=new Statistics(26.53f,"bowling","bowling",15,52.4f);
				kkr[3]=new Statistics(21.03f,"bowling","bowling",11,50.4f);
				kkr[4]=new Statistics(14.03f,"bowling","batting",15,51.4f);
				kkr[5]=new Statistics(18.03f,"feilding","bowling",19,53.5f);
				kkr[6]=new Statistics(22.03f,"batting","feilding",23,65.4f);
				kkr[7]=new Statistics(26.03f,"batting","bowling",13,65.4f);
				kkr[8]=new Statistics(21.03f,"batting","bowling",19,61.4f);
				kkr[9]=new Statistics(26.03f,"bowling","feilding",17,53.4f);
				kkr[10]=new Statistics(11.03f,"bowling","batting",17,60.4f);

			 
				
				srh[0]=new Statistics(23.03f,"batting","feilding",17,52.4f);
				srh[1]=new Statistics(20.03f,"bowling","feilding",20,58.2f);
				srh[2]=new Statistics(26.53f,"bowling","bowling",15,52.4f);
				srh[3]=new Statistics(21.03f,"bowling","bowling",11,50.4f);
				srh[4]=new Statistics(14.03f,"bowling","batting",15,51.4f);
				srh[5]=new Statistics(18.03f,"feilding","bowling",19,53.5f);
				srh[6]=new Statistics(22.03f,"batting","feilding",23,65.4f);
				srh[7]=new Statistics(26.03f,"batting","bowling",13,65.4f);
				srh[8]=new Statistics(21.03f,"batting","bowling",19,61.4f);
				srh[9]=new Statistics(26.03f,"bowling","feilding",17,53.4f);
				srh[10]=new Statistics(11.03f,"bowling","batting",17,60.4f);
				
				dc[0]=new Statistics(24.03f,"bowling","feilding",19,57.4f);
				dc[1]=new Statistics(21.03f,"feilding","feilding",20,44.2f);
				dc[2]=new Statistics(11.53f,"bowling","bowling",15,51.4f);
				dc[3]=new Statistics(12.03f,"feilding","feilding",11,50.4f);
				dc[4]=new Statistics(18.03f,"feilding","batting",15,52.4f);
				dc[5]=new Statistics(12.03f,"feilding","bowling",19,56.5f);
				dc[6]=new Statistics(13.03f,"batting","feilding",23,65.4f);
				dc[7]=new Statistics(18.03f,"batting","feilding",13,69.4f);
				dc[8]=new Statistics(13.03f,"bowling","bowling",19,62.4f);
				dc[9]=new Statistics(19.03f,"bowling","feilding",17,52.4f);
				dc[10]=new Statistics(20.03f,"bowling","batting",14,69.4f);
				
				rr[0]=new Statistics(21.03f,"batting","feilding",17,62.4f);
				rr[1]=new Statistics(16.03f,"bowling","feilding",20,68.2f);
				rr[2]=new Statistics(12.53f,"bowling","bowling",15,75.4f);
				rr[3]=new Statistics(21.03f,"batting","bowling",11,50.4f);
				rr[4]=new Statistics(16.03f,"batting","bowling",15,61.4f);
				rr[5]=new Statistics(15.03f,"feilding","bowling",19,53.5f);
				rr[6]=new Statistics(30.03f,"batting","bowling",23,57.4f);
				rr[7]=new Statistics(11.03f,"batting","bowling",13,65.4f);
				rr[8]=new Statistics(26.03f,"batting","bowling",19,61.4f);
				rr[9]=new Statistics(47.03f,"bowling","feilding",17,53.4f);
				rr[10]=new Statistics(33.03f,"bowling","batting",17,60.4f);
				
				pk[0]=new Statistics(30.03f,"bowling","feilding",19,67.4f);
				pk[1]=new Statistics(21.03f,"bowling","feilding",20,62.2f);
				pk[2]=new Statistics(23.53f,"bowling","bowling",15,52.4f);
				pk[3]=new Statistics(12.03f,"feilding","feilding",11,53.4f);
				pk[4]=new Statistics(11.03f,"batting","batting",15,50.4f);
				pk[5]=new Statistics(14.03f,"batting","feilding",19,59.5f);
				pk[6]=new Statistics(10.03f,"batting","feilding",23,55.4f);
				pk[7]=new Statistics(12.03f,"batting","feilding",13,58.4f);
				pk[8]=new Statistics(29.03f,"batting","bowling",19,61.4f);
				pk[9]=new Statistics(36.03f,"bowling","feilding",17,56.4f);
				pk[10]=new Statistics(45.03f,"bowling","batting",15,51.4f);
				
				
				//ACHIEVEMENTS
				
				Achievements[] arr=new Achievements[8];
				arr[0]=new Achievements("ipl",2021);
				arr[1]=new Achievements("ipl",2016);
				arr[2]=new Achievements("ipl",2017);
				arr[3]=new Achievements("ipl",2019);
				arr[4]=new Achievements("ipl",2020);
				arr[5]=new Achievements("ipl",2017);
				arr[6]=new Achievements("ipl",2017);
				arr[7]=new Achievements("ipl",2018);
				
				//Team strength
				TeamStrength team1=new TeamStrength();
				TeamStrength team2=new TeamStrength();
				
				int i=0;
				float average1=0.0f,highscore1=0.0f;
				float average2=0.0f,highscore2=0.0f;
				int bat,bowl,feild;
				bat=0;
				bowl=0;
				feild=0;
				int bat1,bowl1,feild1;
				bat1=0;
				bowl1=0;
				feild1=0;
				if(t1.equals("csk")&&t2.equals("mi"))
				{
					  
				while (i<11)
				{
					 average1+=csk[i].getAverage();
					 highscore1+=csk[i].getHighScore();
					if(csk[i].getStrength().equals("batting"))
					{
						bat+=1;
					}
					else if (csk[i].getStrength().equals("bowling"))
					{
						bowl+=1;
					}
					else if (csk[i].getStrength().equals("batting"))
					{
						feild+=1;
					}
					
					
					 average2+=mi[i].getAverage();
					 highscore2+=mi[i].getHighScore();
					if(mi[i].getStrength().equals("batting"))
					{
						bat1+=1;
					}
					else if (mi[i].getStrength().equals("bowling"))
					{
						bowl1+=1;
					}
					else if (mi[i].getStrength().equals("feilding"))
					{
						feild1+=1;
					}	
					
				    i++;     	
				}
				}
				else if(t1.equals("rcb")&&t2.equals("kkr"))
				{
					average1+=rcb[i].getAverage();
					 highscore1+=rcb[i].getHighScore();
					if(rcb[i].getStrength().equals("batting"))
					{
						bat+=1;
					}
					else if (rcb[i].getStrength().equals("bowling"))
					{
						bowl+=1;
					}
					else if (rcb[i].getStrength().equals("feilding"))
					{
						feild+=1;
					}
					
					
					 average2+=kkr[i].getAverage();
					 highscore2+=kkr[i].getHighScore();
					if(kkr[i].getStrength().equals("batting"))
					{
						bat1+=1;
					}
					else if (kkr[i].getStrength().equals("bowling"))
					{
						bowl1+=1;
					}
					else if (kkr[i].getStrength().equals("feilding"))
					{
						feild1+=1;
					}	
					
				    i++;     
				}
				
				else if(t1.equals("srh")&&t2.equals("dc"))
				{
					average1+=srh[i].getAverage();
					 highscore1+=srh[i].getHighScore();
					if(srh[i].getStrength().equals("batting"))
					{
						bat+=1;
					}
					else if (srh[i].getStrength().equals("bowling"))
					{
						bowl+=1;
					}
					else if (srh[i].getStrength().equals("feilding"))
					{
						feild+=1;
					}
					
					
					 average2+=dc[i].getAverage();
					 highscore2+=dc[i].getHighScore();
					if(dc[i].getStrength().equals("batting"))
					{
						bat1+=1;
					}
					else if (dc[i].getStrength().equals("bowling"))
					{
						bowl1+=1;
					}
					else if (dc[i].getStrength().equals("feilding"))
					{
						feild1+=1;
					}	
					
				    i++;     
				}
				else if(t1.equals("rr")&&t2.equals("pk"))
				{
					average1+=rr[i].getAverage();
					 highscore1+=rr[i].getHighScore();
					if(rr[i].getStrength().equals("batting"))
					{
						bat+=1;
					}
					else if (rr[i].getStrength().equals("bowling"))
					{
						bowl+=1;
					}
					else if (rr[i].getStrength().equals("feilding"))
					{
						feild+=1;
					}
					
					
					 average2+=pk[i].getAverage();
					 highscore2+=pk[i].getHighScore();
					if(pk[i].getStrength().equals("batting"))
					{
						bat1+=1;
					}
					else if (pk[i].getStrength().equals("bowling"))
					{
						bowl1+=1;
					}
					else if (pk[i].getStrength().equals("feilding"))
					{
						feild1+=1;
					}	
					
				    i++;     
				}
				
				team1.setBatsmenStrength(bat);
				team1.setBowlerStrength(bowl);
				team1.setFeildingStrength(feild);
			 
				
				
				team2.setBatsmenStrength(bat1);
				team2.setBowlerStrength(bowl1);
				team2.setFeildingStrength(feild1);
			 
				team1.calculateTeamStrength(average1,highscore1);
				team2.calculateTeamStrength(average2,highscore2);
				
				ComputerResult ck=new ComputerResult(team1.getTotalStrength(),team2.getTotalStrength());	
				System.out.println("\n ((((((((((((((((((The predicted team based on the computer result is : ))))))))))))))))))\n");
				 
				String pr,lr;
				 
				if(ck.predict(team1.getTotalStrength(),team2.getTotalStrength()).equals("team1"))
				{   
					System.out.println("\nVICTORY ::( "+t1+" )::\n");
					pr=t1;
					lr=t2;
					int choice;
					/*System.out.println("Press :\n(1)Additional Details\n(2)Quit");
					System.out.println("Enter :");*/
					choice=1;
					if(choice==1)
					{   System.out.println("							(((((((((((( "+t1+" ( Vs ) "+t2+" ))))))))))))");
					
						System.out.println("															|| Victory	: "+pr+" ||");
						 
						System.out.println("Team(1) Name : "+t1);
						System.out.println("Team(2) Name : "+t2);
						
						System.out.println("The predicted Team to be win : "+pr);
						System.out.println(":::::::The Scores Collected :::::");
						System.out.println("Score of predicted *Winned Team*"+pr+" :"+team1.getTotalStrength());
						System.out.println("Score of predicted *loosed Team*"+lr+" :"+team2.getTotalStrength());
						
						System.out.println("\nTeam : "+t1);
						System.out.println("\t\t\t\t\t\t\t******************************************** ");
						System.out.println("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*");
						System.out.println("\t\t\t\t\t\t\t********************************************* ");
						System.out.println("\t\t\t\t\t\t\t*"+bat+"\t|"+bowl+"\t|"+feild+"\t  |"+average1+"\t|"+highscore1+"*");
						System.out.println("\t\t\t\t\t\t\t*********************************************\n\n");
						
						System.out.println("\nTeam : "+t2);
						System.out.println("\t\t\t\t\t\t\t******************************************** ");
						System.out.println("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*");
						System.out.println("\t\t\t\t\t\t\t********************************************* ");
						System.out.println("\t\t\t\t\t\t\t*"+bat1+"\t|"+bowl1+"\t|"+feild1+"\t  |"+average2+"\t|"+highscore2+"*");
						System.out.println("\t\t\t\t\t\t\t*********************************************\n\n");
						
						//start file
						try {
						      File myObj = new File("winnerdata.txt");
						      if (myObj.createNewFile()) {
						         
						      } else {
						        
						      }
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
						
						
						try {
						      FileWriter myWriter = new FileWriter("winnerdata.txt");
						      myWriter.write("\n\nCOMPUTER PREDICTED WINNER TEAM RECORD \n\n");
						      myWriter.write("							(((((((((((( "+t1+" ( Vs ) "+t2+" ))))))))))))\n");
								
						      myWriter.write("															|| Victory	: "+pr+" ||\n");
								 
						      myWriter.write("Team(1) Name : "+t1+"\n");
						      myWriter.write("Team(2) Name : "+t2+"\n");
								
						      myWriter.write("The predicted Team to be win : "+pr+"\n");
						      myWriter.write(":::::::The Scores Collected :::::"+"\n");
						      myWriter.write("Score of predicted *Winned Team*"+pr+" :"+team1.getTotalStrength()+"\n");
						      myWriter.write("Score of predicted *loosed Team*"+lr+" :"+team2.getTotalStrength()+"\n");
								
						      myWriter.write("\nTeam : "+t1+"\n");
						      myWriter.write("\t\t\t\t\t\t\t******************************************** "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t********************************************* "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*"+bat+"\t|"+bowl+"\t|"+feild+"\t  |"+average1+"\t|"+highscore1+"*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*********************************************\n\n"+"\n");
								
						      myWriter.write("\nTeam : "+t2+"\n");
						      myWriter.write("\t\t\t\t\t\t\t******************************************** "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t********************************************* "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*"+bat1+"\t|"+bowl1+"\t|"+feild1+"\t  |"+average2+"\t|"+highscore2+"*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*********************************************\n\n"+"\n");
						      myWriter.close();
						      System.out.println("Successfully wrote to the file.");
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }

						//end file
						
					}
					
					
					
					
					else
					{
						System.out.println("								THANK YOU :-)");
					}
					
					 
				}
				else
				{ 
					System.out.println("\nVICTORY ::( "+t2+" )::\n");
					 int choice;
					/*	System.out.println("Press :\n(1)Additional Details\n(2)Quit");
						System.out.println("Enter :");*/
					pr=t2;
				 
					lr=t1;
					choice=1;
					if(choice==1)
					{   System.out.println("							(((((((((((( "+t1+" ( Vs ) "+t2+" ))))))))))))");
					
						System.out.println("															|| Victory	: "+pr+" ||");
						 
						System.out.println("Team(1) Name : "+t1);
						System.out.println("Team(2) Name : "+t2);
						
						System.out.println("The predicted Team to be win : "+pr);
						System.out.println(":::::::The Scores Collected :::::");
						System.out.println("Score of predicted *Winned Team*"+pr+" :"+team2.getTotalStrength());
						System.out.println("Score of predicted *loosed Team*"+lr+" :"+team1.getTotalStrength());
						
						System.out.println("\nTeam : "+t1);
						System.out.println("\t\t\t\t\t\t\t******************************************** ");
						System.out.println("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*");
						System.out.println("\t\t\t\t\t\t\t********************************************* ");
						System.out.println("\t\t\t\t\t\t\t*"+bat+"\t|"+bowl+"\t|"+feild+"\t  |"+average1+"\t|"+highscore1+"*");
						System.out.println("\t\t\t\t\t\t\t*********************************************\n\n");
						
						System.out.println("\nTeam : "+t2);
						System.out.println("\t\t\t\t\t\t\t******************************************** ");
						System.out.println("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*");
						System.out.println("\t\t\t\t\t\t\t********************************************* ");
						System.out.println("\t\t\t\t\t\t\t*"+bat1+"\t|"+bowl1+"\t|"+feild1+"\t  |"+average2+"\t|"+highscore2+"*");
						System.out.println("\t\t\t\t\t\t\t*********************************************\n\n");
						
						
						

						//start file
						try {
						      File myObj = new File("winnerdata.txt");
						      if (myObj.createNewFile()) {
						         
						      } else {
						        
						      }
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
						
						
						try {
						      FileWriter myWriter = new FileWriter("winnerdata.txt");
						      myWriter.write("\n\nCOMPUTER PREDICTED WINNER TEAM RECORD \n\n");
						      myWriter.write("							(((((((((((( "+t1+" ( Vs ) "+t2+" ))))))))))))\n");
								
						      myWriter.write("															|| Victory	: "+pr+" ||\n");
								 
						      myWriter.write("Team(1) Name : "+t1+"\n");
						      myWriter.write("Team(2) Name : "+t2+"\n");
								
						      myWriter.write("The predicted Team to be win : "+pr+"\n");
						      myWriter.write(":::::::The Scores Collected :::::"+"\n");
						      myWriter.write("Score of predicted *Winned Team*"+pr+" :"+team1.getTotalStrength()+"\n");
						      myWriter.write("Score of predicted *loosed Team*"+lr+" :"+team2.getTotalStrength()+"\n");
								
						      myWriter.write("\nTeam : "+t1+"\n");
						      myWriter.write("\t\t\t\t\t\t\t******************************************** "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t********************************************* "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*"+bat+"\t|"+bowl+"\t|"+feild+"\t  |"+average1+"\t|"+highscore1+"*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*********************************************\n\n"+"\n");
								
						      myWriter.write("\nTeam : "+t2+"\n");
						      myWriter.write("\t\t\t\t\t\t\t******************************************** "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*Batting|Bowling|Fielding|Average|Highscore*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t********************************************* "+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*"+bat1+"\t|"+bowl1+"\t|"+feild1+"\t  |"+average2+"\t|"+highscore2+"*"+"\n");
						      myWriter.write("\t\t\t\t\t\t\t*********************************************\n\n"+"\n");
						      myWriter.close();
						  
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }

						//end file
						
						
						
					}
					else
					{
						System.out.println("								THANK YOU :-)");
					}
					


					
					
					
					
					
					
					
				
					 
				}
				 //public poll
				int aud;
				System.out.println("\n\n										(PUBLIC POLL)\n\n");
				/* System.out.println("Enter n.o of Audience : ");
				 aud=sc.nextInt();*/
				aud=4;
				String n = null;
				Poll[] pp=new Poll[aud];
			int count1=0,count2=0;
				i=0;
				String name = null;
				int fg=2,fh=3;
				while(i<aud)
				{	
					/*System.out.println("Enter your name :");
					name=sc.next();
					System.out.println("Enter your choice ("+t1+" Vs "+t2+") :");
					n=sc.next();*/
					 
				 
								 name=prod1[fg];
								 n=prod1[fh];
								 fg+=2;
								 fh+=2;
							//}
							//br1.close();
				 
					 
					pp[i]=new Poll(name,n);
					if(n.equals(t1))
					{
						count1+=1;
					}
					else
					{
						count2+=1;
					}
					i++;
					
				}
				
				System.out.println("\n||||||||||||||||||||||||||||||||||||||||VERIFYING AUDINCE POLL |||||||||||||||||||||||||||||||||||||||\n");
				if(count1>count2)
				{
					System.out.println("Team (1) "+t1+" got more votes compared to "+t2);
				}
				else
				{
					System.out.println("Team (2) "+t2+" got more votes comapred to "+t1);
				}
				
			  /*  System.out.println("Press ::\n(1)Display Results\n(2)Quit");
			    System.out.println("Enter :");*/
				int par;
				par=1;
				if(par==1)
					
				{
					System.out.println("N.o of votes for Team(1) "+t1+":"+count1);
					System.out.println("N.o of votes for Team(2) "+t2+":"+count2);
					System.out.println("\t\t\t\t\t\t*********************************");
					System.out.println("\t\t\t\t\t\t*Audience Name  | Poll result   *");
					System.out.println("\t\t\t\t\t\t*********************************");
					i=0;
					while(i<aud)
					{
					System.out.println("\t\t\t\t\t\t*"+pp[i].getAudienceName()+"\t\t|"+pp[i].getAudiencechoice()+"\t\t*");
					i++;
					}
					System.out.println("\t\t\t\t\t\t*********************************");
					
					
					
					//Entering into The file 
					try {
					      File myObj = new File("polldata.txt");
					      if (myObj.createNewFile()) {
					        System.out.println("File created: " + myObj.getName());
					      } else {
					         
					      }
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
				
			    try {
			        FileWriter myWriter = new FileWriter("polldata.txt");
			        myWriter.write("\n\nThe poll result Data : \n");
			        myWriter.write("N.o of votes for Team(1) "+t1+":"+count1+"\n");
			        myWriter.write("N.o of votes for Team(2) "+t2+":"+count2+"\n");
			        myWriter.write("\t\t\t\t\t\t*********************************\n");
			        myWriter.write("\t\t\t\t\t\t*Audience Name  | Poll result   *\n");
			        myWriter.write("\t\t\t\t\t\t*********************************\n");
					i=0;
					while(i<aud)
					{
					myWriter.write("\t\t\t\t\t\t*"+pp[i].getAudienceName()+"\t\t\t|"+pp[i].getAudiencechoice()+"\t\t*\n");
					i++;
					}
					System.out.println("\t\t\t\t\t\t*********************************\n");
			        myWriter.close();
			        
			      } catch (IOException e) {
			        System.out.println("An error occurred.");
			        e.printStackTrace();
			      }
			 

				}
					//end
				
				else
				{
					System.out.println("							Thank you ");
				}
				
			 
			 
			 
		}br1.close();
		System.out.println("\t\t\t\t\t\t\tALL HISTORY SAVED IN THE CORRESPONDING FILES ::::\n\n\tTHANK YOU ");
		//
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} 
	
   do {
	
	inse+=1;
   }while(inse<=4);
}

public static void main(String args[])
{
	test t1=new test();
	t1.kasi();
}



}

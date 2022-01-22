package oopproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.Arrays;

public class Ticket implements SummaryFinalAmount{
	
	private String[] blockName = new String[30];
	private String[] ticketType = new String[30];
	private String[] ticketPrice = new String[30];
	private String[] seatNumber = new String[30];
//	private int[] ticketQuantity;
	private String[][] tickbook = new String[30][30];
	private int k=0;
	private int m=0;
	private int fAmount=0;
	private int finalTickPrice;
	
	public String[] getBlockName() {
		return blockName;
	}

	public void setBlockName(String[] blockName) {
		this.blockName = blockName;
	}

	public String[] getTicketType() {
		return ticketType;
	}

	public void setTicketType(String[] ticketType) {
		this.ticketType = ticketType;
	}

	public String[] getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String[] ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String[] getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String[] seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String[][] getTickbook() {
		return tickbook;
	}

	public void setTickbook(String[][] tickbook) {
		this.tickbook = tickbook;
	}

	public int getfAmount() {
		return fAmount;
	}

	public void setfAmount(int fAmount) {
		this.fAmount = fAmount;
	}

	public int getFinalTickPrice() {
		return finalTickPrice;
	}

	public void setFinalTickPrice(int finalTickPrice) {
		this.finalTickPrice = finalTickPrice;
	}

	@Override
	public String toString() {
		return "Ticket [blockName=" + Arrays.toString(blockName) + ", ticketType=" + Arrays.toString(ticketType)
				+ ", ticketPrice=" + Arrays.toString(ticketPrice) + ", seatNumber=" + Arrays.toString(seatNumber)
				+ ", tickbook=" + Arrays.toString(tickbook) + ", fAmount=" + fAmount + ", finalTickPrice="
				+ finalTickPrice + "]";
	}

	public Ticket() {
		super();
	}

	public Ticket(String[] blockName, String[] ticketType, String[] ticketPrice, String[] seatNumber,
			String[][] tickbook, int fAmount, int finalTickPrice) {
		super();
		this.blockName = blockName;
		this.ticketType = ticketType;
		this.ticketPrice = ticketPrice;
		this.seatNumber = seatNumber;
		this.tickbook = tickbook;
		this.fAmount = fAmount;
		this.finalTickPrice = finalTickPrice;
	}



//	public char[] getBlockName() {
//		return blockName;
//	}
//
//	public void setBlockName(char[] blockName) {
//		this.blockName = blockName;
//	}
//
//	public String[] getTicketType() {
//		return ticketType;
//	}
//
//	public void setTicketType(String[] ticketType) {
//		this.ticketType = ticketType;
//	}
//
//	public float[] getTicketPrice() {
//		return ticketPrice;
//	}
//
//	public void setTicketPrice(float[] ticketPrice) {
//		this.ticketPrice = ticketPrice;
//	}
//
//	public int[] getSeatNumber() {
//		return seatNumber;
//	}
//
//	public void setSeatNumber(int[] seatNumber) {
//		this.seatNumber = seatNumber;
//	}
//
//	public int[] getTicketQuantity() {
//		return ticketQuantity;
//	}
//
//	public void setTicketQuantity(int[] ticketQuantity) {
//		this.ticketQuantity = ticketQuantity;
//	}
//
//	@Override
//	public String toString() {
//		return "Ticket [blockName=" + Arrays.toString(blockName) + ", ticketType=" + Arrays.toString(ticketType)
//				+ ", ticketPrice=" + Arrays.toString(ticketPrice) + ", seatNumber=" + Arrays.toString(seatNumber)
//				+ ", ticketQuantity=" + Arrays.toString(ticketQuantity) + "]";
//	}
//
//	public Ticket() {
//		super();
//	}
//
//	public Ticket(char[] blockName, String[] ticketType, float[] ticketPrice, int[] seatNumber, int[] ticketQuantity) {
//		super();
//		this.blockName = blockName;
//		this.ticketType = ticketType;
//		this.ticketPrice = ticketPrice;
//		this.seatNumber = seatNumber;
//		this.ticketQuantity = ticketQuantity;
//	}
	
	
	
	
	
//	public void combo()
//	{
//		
//	}
	
	public void extractFromTick1IntoProgram() //Done
	{
		String path = "oopproj\\blocktickets.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine())!=null)
			{
				String[] tick1 = line.split(",");
				seatNumber[m]=tick1[0];
				ticketPrice[m]=tick1[1];
				ticketType[m]=tick1[2];
				blockName[m]=tick1[3];
				m++;
			}	
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void blockTicket() //Done
	{
		String path = "oopproj\\ticket.csv";
		String path1 = "oopproj\\blocktickets.csv"; //my input of the seats i want to choose for user
		String path2 = "oopproj\\seatsblocked.csv"; //just to store seats booked till now
		String path3 = "oopproj\\blehbleh.csv";
		String line = "";
		String line1 = "";
		String line2 = "";
//for hell		String line3 = "";
		//boolean bleh=true;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			//BufferedReader br2 = new BufferedReader(new FileReader(path2));
			
			
			
			
			//BufferedWriter wr = new BufferedWriter(new FileWriter(path3));
			
			
			
			
			
			String[] nontick = new String[20];
			int s=0;
			
			while((line1 = br1.readLine())!=null)
			{
				BufferedWriter wr = new BufferedWriter(new FileWriter(path3));
				boolean bleh=false;
				/*if(line1 != null)
				{
					System.out.println("hello1");
				}
				System.out.println("line1: "+line1);
				*/
				
				String[] tick1 = line1.split(",");
				/*System.out.println("tick1: "+tick1[0]+"  "+tick1[1]+"  "+tick1[2]);*/
				String abc = new String();
				while((line = br.readLine())!=null)
				{
					/*System.out.println("line: "+line);*/
					String[] values = line.split(",");
					
					/*System.out.println("values: "+values[0]+"  "+values[1]+"  "+values[2]);*/

					if( tick1[0].equals(values[0]) && tick1[1].equals(values[1]) && tick1[2].equals(values[2]) && tick1[3].equals(values[3]) )
					{
						BufferedReader br2 = new BufferedReader(new FileReader(path2));
						//BufferedWriter wr = new BufferedWriter(new FileWriter(path2));
						//String line2 = "";//new String();
//						line2 = br2.readLine();
//						if(line2 == null)
//						{
//							System.out.println("hello");
//						}
		////				//BufferedWriter wr = new BufferedWriter(new FileWriter(path2));	
						/*System.out.println("bleh");*/
						//System.out.println("line2: "+line2);
						

						while((line2 = br2.readLine())!=null)
						{
							/*System.out.println("line2: "+line2);
							if(line2 != null)
							{
								System.out.println("line2: "+line2);
							}*/
//							if(line2 == null)
//							{
//								System.out.println("hellohihi");
//							}
							
							String[] val = line2.split(",");
							/*
							System.out.println("val:"+val[0]+"  "+val[1]+"  "+val[2]);
							*/
							int i=0;
							//while(val[i]!=null)
							//while(Integer.parseInt(val[i])<51)
							while(i<51 )//&& val[i]!=null)
							{
								/*
								System.out.println("val: "+val[i]);
								*/
								if(tick1[0].equals(val[i]))
								{
									abc=val[i];
									bleh=true;
									//System.out.println("Seat not available");
									//break;
								}
								else
								{
									wr.append(val[i]);
									wr.append(",");
								}
//								else
//								{
//									bleh=false;
//									//BufferedWriter wr = new BufferedWriter(new FileWriter(path3));
//									
//									
//									
//									
//									
//									
//									
//									tickbook[k++] = tick1;
//									//System.out.println("Ticket confirmed, seat blocked !");
//									wr.append(tick1[0]);
//									wr.append(",");
//									//wr.close();
//								}
								i++;
							}
						}
						//br2.close();
						//wr.close();
						break;
					}
				}
				if(bleh==true)
				{
					wr.append(abc);
					wr.append(",");
					System.out.println("\nSeat "+abc+" not available");
				}
				else
				{
					System.out.println("\nTicket confirmed, seat blocked !");
					System.out.println("Seat "+tick1[0]+" is booked");
					nontick[s]=tick1[0];
					s++;
					tickbook[k++] = tick1;
					//System.out.println("Ticket confirmed, seat blocked !");
					/*System.out.println("tick1[0]: "+tick1[0]);*/
//					wr.append(tick1[0]);
//					wr.append(",");
				}
				for(int j=0;j<s;j++)
				{
					//System.out.println("nontick"+j+":"+nontick[0]);
					wr.append(nontick[j]);
					wr.append(",");
				}
				wr.close();
			}			
			//wr.close();
			
			br1.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		////////////////////////////////////////////////////////
//for hell	
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(path3));
//			BufferedWriter wr = new BufferedWriter(new FileWriter(path2));
//			
//			while((line3 = br.readLine())!=null)
//			{
//				String[] values = line.split(",");
//				int j=0;
//				//while(values[j]!=null)
//				while(j<4)
//				{
//					System.out.println("j: "+j);
//					wr.append(values[j]);
//					wr.append(",");
//					j++;
//				}
//			}
//			
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
		
		////////////////////////////////////////////////////////		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void showSummary() //Done
	{
		System.out.println("\nNumber of tickets bought: "+k);
		for(int i=0;i<k;i++)
		{
			System.out.println("\nTick"+(i+1));
			System.out.println("Seat Number: "+tickbook[i][0]+"\nPrice: "+tickbook[i][1]+"\nType: "+tickbook[i][2]+"\nBlock: "+tickbook[i][3]);
		}
	}
	
	public void showDiffTicket() //Done
	{
		System.out.println("\nDifferent kinds of seats are: \n");
		System.out.println("| Seat Number | Price |   Type   | Block |");
		System.out.println("| 1-15        | 1000  | Bronze   | A	 |");
		System.out.println("| 16-30       | 2000  | Silver   | A	 |");
		System.out.println("| 31-45       | 3000  | Gold     | B	 |");
		System.out.println("| 16-30       | 2000  | Platinum | C	 |");
	}
	
	public void calcTicketPrice()
	{
		for(int i=0;i<k;i++)
		{
			finalTickPrice = finalTickPrice + Integer.parseInt(tickbook[i][1]);
			//System.out.println("\nTick"+(i+1));
			//System.out.println("Seat Number: "+tickbook[0]+"\nPrice: "+tickbook[1]+"\nType: "+tickbook[2]+"\nBlock: "+tickbook[3]);
		}
		System.out.println("\nTotal ticket price for all "+k+" tickets is: "+finalTickPrice);
		//return finalTickPrice;
	}
	
	public int addToFinalPrice(int finalAmount)
	{
		fAmount = finalAmount;
		System.out.println();
		return fAmount+finalTickPrice;
	}
	
//	public static void main(String[] args){
//		Ticket f = new Ticket();
//		f.extractFromTick1IntoProgram();
//		//System.out.println(f.seatNumber[1]);
//		f.blockTicket();
//		f.showDiffTicket();
//		//System.out.println("\n\n\n\n\n\n");
//		f.showSummary();
//		f.calcTicketPrice();
//		System.out.println(f.addToFinalPrice(5000));
////		f.showMenu();
////		f.buyFood();
////		f.showSummary();
////		System.out.println(f.addToFinalPrice(10050));
//	}
	
}
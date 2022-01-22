package oopproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Discount {

	EventManager em = new EventManager();
//	Scanner sc = new Scanner(System.in);

	private int quizScore;
//	private String promoCode;
//	private String bankName;
//	private String place;
//	private String userName;
	private int seatNumber;
	public int discOff=0;
	public int fAmount;
	
	//****************************
	public int getQuizScore() {
		return quizScore;
	}

	public void setQuizScore(int quizScore) {
		this.quizScore = quizScore;
	}
//
//	public String getPromoCode() {
//		return promoCode;
//	}
//
//	public void setPromoCode(String promoCode) {
//		this.promoCode = promoCode;
//	}
//
//	public String getBankName() {
//		return bankName;
//	}
//
//	public void setBankName(String bankName) {
//		this.bankName = bankName;
//	}
//
//	public String getPlace() {
//		return place;
//	}
//
//	public void setPlace(String place) {
//		this.place = place;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getDiscOff() {
		return discOff;
	}

	public void setDiscOff(int discOff) {
		this.discOff = discOff;
	}
	
	public int getfAmount() {
		return fAmount;
	}

	public void setfAmount(int fAmount) {
		this.fAmount = fAmount;
	}
//	
//	@Override
//	public String toString() {
//		return "Discount [quizScore=" + quizScore + ", promoCode=" + promoCode + ", bankName=" + bankName + ", place="
//				+ place + ", userName=" + userName + ", seatNumber=" + seatNumber + ", discOff=" + discOff + "]";
//	}
//	
//	public Discount() {
//		super();
//	}
//	
//	public Discount(int quizScore, String promoCode, String bankName, String place, String userName, int seatNumber, int discOff)
//	{
//		this.quizScore = quizScore;
//		this.promoCode = promoCode;
//		this.bankName = bankName;
//		this.place = place;
//		this.userName = userName;
//		this.seatNumber = seatNumber;
//		this.discOff = discOff;
//	}
	//****************************
	
	public int conductQuiz() //Done
	{
		char op;
		do {
			
			System.out.println("\nWho has won the most IPL's ?");
			System.out.println("\na)MI\nb)KKR\nc)SRH\nd)DC");
			System.out.println("\nEnter option: ");
			//op = sc.next().charAt(0);
			op = (char)(ThreadLocalRandom.current().nextInt(97, 101));
			System.out.println(op);
			if(op == 'a' ||op == 'b'||op == 'c'||op == 'd')
			{
				if(op == 'a')
				{
					quizScore++;
				}
			}
			else
			{
				System.out.println("Invalid Option");
				System.out.println("Try again");
			}
		}while(!(op == 'a' ||op == 'b'||op == 'c'||op == 'd'));
		
		do {
			
			System.out.println("\nWho made the first IPL century ?");
			System.out.println("\na)Chris Gayle\nb)Brendon McCullum\n"
					+ "c)Virat Kolhi\nd)AB D Villiers");
			System.out.println("\nEnter option: ");
			//op = sc.next().charAt(0);
			op = (char)(ThreadLocalRandom.current().nextInt(97, 101));
			System.out.println(op);
			if(op == 'a' ||op == 'b'||op == 'c'||op == 'd')
			{
				if(op == 'b')
				{
					quizScore++;
				}
			}
			else
			{
				System.out.println("Invalid Option");
				System.out.println("Try again");
			}
		}while(!(op == 'a' ||op == 'b'||op == 'c'||op == 'd'));
		
		do {
			
			System.out.println("\nWhat is the full form of IPL ?");
			System.out.println(
					"\na)Indian Premier League\n"
					+ "b)Intelligence People of Lahore\n"
					+ "c)India Primary Lost\n"
					+ "d)Indian Premeir League");
			System.out.println("\nEnter option: ");
			//op = sc.next().charAt(0);
			op = (char)(ThreadLocalRandom.current().nextInt(97, 101));
			System.out.println(op);
			if(op == 'a' ||op == 'b'||op == 'c'||op == 'd')
			{
				if(op == 'a')
				{
					quizScore++;
				}
			}
			else
			{
				System.out.println("\nInvalid Option");
				System.out.println("Try again");
			}
		}while(!(op == 'a' ||op == 'b'||op == 'c'||op == 'd'));
		
		
		
		return quizScore;
	}
	
//	public int calcQuizMarks()
//	{
//		
//	}
	
	public boolean checkPromoCode(String promocode) //Done
	{

		//String path = "/Users//siddharth/Downloads//promocodes.csv";
		String path = em.sendDiscountDetails();
		String line = "";
		int h=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine())!=null)
			{
				String[] values = line.split(",");
				if(promocode.equals(values[0])) // assuming i have 2 columns first being the promocodes and second being discount offered
				{
					h++;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(h==0)
		{
			System.out.println("\nSorry, promo code doesn't exist");
			return false;
		}
		else
		{
			System.out.println("\nCongratulations, promo code " + promocode + " has been applied !!!");
			return true;
		}
		
	}
	
	public void applyPromoCodeOnFinalAmount(String promocode) //Done
	{
		//String path = "/Users//siddharth/Downloads//promocodes.csv";
		String path = em.sendDiscountDetails();
		String line = "";
		
		if(checkPromoCode(promocode))
		{
			
			try {
				
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				while((line = br.readLine())!=null)
				{
					
					String[] values = line.split(",");
					if(promocode.equals(values[0])) 
					{
				        try{
				            discOff = Integer.parseInt(values[1]);
				            break;
				        }
				        catch (NumberFormatException ex){
				            ex.printStackTrace();
				        }
					}
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fAmount = ((100 - discOff)*fAmount)/100;
			System.out.println("\nFinal amt after applying promo is: "+fAmount);
		}
	}
	
	public void applyQuizPromoCodeOnFinalAmount(String promocode) //Done
	{
		//String path = "/Users//siddharth/Downloads//promocodes.csv";
		String path = em.sendDiscountDetails();
		String line = "";
		
		if(checkPromoCode(promocode))
		{
			
			try {
				
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				while((line = br.readLine())!=null)
				{
					
					String[] values = line.split(",");
					if(promocode.equals(values[0])) // assuming i have 2 columns first being the promocodes and second being discount offered
					{
						//System.out.println("hellohellohello");
				        try{
				        	//System.out.println("hihihi: "+Integer.parseInt(values[1]));
				            discOff = Integer.parseInt(values[1]);
//				            System.out.println("Final amt after quiz disc:"+discOff);
//							fAmount = ((100 - discOff)*fAmount)/100;
				            break;
				        }
				        catch (NumberFormatException ex){
				            ex.printStackTrace();
				        }
					}
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.println("Final amt after quiz disc:"+discOff);
			fAmount = ((100 - discOff)*fAmount)/100;
			//System.out.println("Discount applied on final amount");
			System.out.println("\nFinal amt after quiz disc: "+fAmount);
		}
	}
	
	
	
	public void calcQuizMarks() //Done
	{
		int c = conductQuiz();
		if(c == 0 || c==1)
		{
			System.out.println("\nBetter luck next time");
		}
		else if(c==2)
		{
			applyQuizPromoCodeOnFinalAmount("2OFF"); //2% off
			System.out.println("\nYou have received 2 % off !!!");
		}
		else if(c==3)
		{
			applyQuizPromoCodeOnFinalAmount("5OFF"); //5% off	
			System.out.println("\nYou have received 5 % off !!!");
		}
		
	}
	
	public boolean checkBankPartners(String bankname) //Done
	{
		//String path = "/Users//siddharth/Downloads//bankpartners.csv";
		String path = em.sendBankDetails();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine())!=null)
			{
				String[] values = line.split(",");
				if(bankname.equals(values[0])) // assuming i have 2 columns first being the banknames and second being promocodes offered
				{
					return true;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void applyBankDiscOnFinalAmount(String bankname) //Done
	{
		//String path = "/Users//siddharth/Downloads//bankpartners.csv";
		String path = em.sendBankDetails();
		String line = "";
		
		if(checkBankPartners(bankname))
		{
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				while((line = br.readLine())!=null)
				{
					String[] values = line.split(",");
					if(bankname.equals(values[0])) // assuming i have 2 columns first being the bankname and second being promocode offered
					{
				        try{
				            String prc = values[1];
////////////////
				            String path1 = "oopproj//promocodes.csv";
				    		String line1 = "";
				    		
				    		if(checkPromoCode(prc))
				    		{
				    			
				    			try {
				    				
				    				BufferedReader br1 = new BufferedReader(new FileReader(path1));
				    				
				    				while((line1 = br1.readLine())!=null)
				    				{
				    					
				    					String[] valuess = line1.split(",");
				    					if(prc.equals(valuess[0])) // assuming i have 2 columns first being the promocodes and second being discount offered
				    					{
				    				        try{
				    				            discOff = Integer.parseInt(valuess[1]);				    				         
				    				            break;
				    				        }
				    				        catch (NumberFormatException ex){
				    				            ex.printStackTrace();
				    				        }
				    					}
				    				}
				    				br1.close();
				    			} catch (FileNotFoundException e) {
				    				e.printStackTrace();
				    			} catch (IOException e) {
				    				e.printStackTrace();
				    			}
				    			
				    		}
////////////////
				            
				        }
				        catch (NumberFormatException ex){
				            ex.printStackTrace();
				        }
					}
				}
				br.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			fAmount = ((100 - discOff)*fAmount)/100;
			System.out.println("\nDiscount applied on final amount");
		}
	}
	
	public boolean checkPlaceOfMatch(int matchNumber, String place) //Done
	{
		String path = "oopproj\\localdisc.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine())!=null)
			{
				String[] values = line.split(",");
				if(Integer.parseInt(values[0])==matchNumber) // assuming i have 2 columns first being the banknames and second being promocodes offered
				{
					if(place.equals(values[1]))
					{
						return true;
					}
				}
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void applyLocalDiscOnFinalAmount(int matchNumber, String place) //Done
	{
		if(checkPlaceOfMatch(matchNumber,place))
		{
			String path = "oopproj\\localdisc.csv";
			String line = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				while((line = br.readLine())!=null)
				{
					String[] values = line.split(",");
					if(Integer.parseInt(values[0])==matchNumber) // assuming i have 2 columns first being the banknames and second being promocodes offered
					{
						if(place.equals(values[1]))
						{
							System.out.println("\nLocal Discount Applied !!!");
							fAmount = (95*fAmount)/100; //5% off local discount
						}
					}
				}
				br.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public boolean checkIfFirstTime(String username, String phno)
//	{
//		
//	}
//	
//	public void applyFirstTimeDiscOnFinalAmount()
//	{
//		
//	}
	
	public void organiseLuckyDraw() //Done
	{
		//Random r = new Random();
		seatNumber = ThreadLocalRandom.current().nextInt(1, 51);
		//seatNumber = ThreadLocalRandom.current().nextInt(1, 2);
		//System.out.println("luckyseat: "+seatNumber);
	
	}
	
	public void freeForLuckyDrawWinnerOnFinalAmount(int luck) //Done
	{
		organiseLuckyDraw();
//		for(int i=0;i<luck.length;i++)
//		{
			//if(seatNumber == Integer.parseInt(luck[i]))
		if(seatNumber == luck)
		{
			System.out.println("\nCongratulation you won your ticket for free !!!");
			fAmount = 0;
		}
		//}
	}
	
//	public void changeActualFinalAmount()
//	{
//		
//	}
//	
//	public static void main(String[] args){
//		
//		Discount d = new Discount();
//		d.fAmount = 4000;
//		//System.out.println(d.conductQuiz());
//		//d.calcQuizMarks();
//		//d.checkPromoCode("2FF");
//		//d.applyBankDiscOnFinalAmount("JPM");
//		//System.out.println("Final amt after bank disc:"+d.fAmount);
//		d.applyLocalDiscOnFinalAmount(3, "Bengaluru");
//		System.out.println("Final amt after local disc:"+d.fAmount);
//		//d.organiseLuckyDraw();
//		//d.freeForLuckyDrawWinnerOnFinalAmount(1);
//		//System.out.println("Final amt after local disc:"+d.fAmount);
//		
//	}

}

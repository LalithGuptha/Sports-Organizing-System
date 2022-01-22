package oopproj;

import java.util.Scanner;

public class User {
	
	Ticket t = new Ticket();
	Merchandise m = new Merchandise();
	Food f = new Food();
	Discount d = new Discount(); 
//	static private int fAmount;

	public void user() {
			
		User u1 = new User();
		int fAmount=0;
		
		Scanner sc = new Scanner(System.in);
		
		//Tickets
		u1.t.extractFromTick1IntoProgram();		
		u1.t.showDiffTicket();
		u1.t.blockTicket();
		u1.t.showSummary();
		u1.t.calcTicketPrice();
		fAmount = u1.t.addToFinalPrice(fAmount);
		System.out.println("Final price after adding cost of tickets: "+fAmount);
		
		//Food
		u1.f.extractFromTick1IntoProgram();
		u1.f.showMenu();
		u1.f.buyFood();
		u1.f.showSummary();
		fAmount = u1.f.addToFinalPrice(fAmount);
		System.out.println("Final price after adding cost of food items: "+fAmount);
		
		//Merchandise
		u1.m.extractFromProd1IntoProgram();
		u1.m.showMerch();
		u1.m.buyMerch();
		u1.m.showSummary();
		//System.out.println(fAmount);
		fAmount = u1.m.addToFinalPrice(fAmount);
		System.out.println("Final price after adding cost of merchandise: "+fAmount);
		System.out.println("\nChoose what discount you want to apply: ");
		System.out.println("\n1. Quiz");
		System.out.println("2. Bank Offer");
		System.out.println("3. Local Discount");
		System.out.println("4. Lucky Draw");
		System.out.println("5. Enter Promo Code");
		//System.out.println("Enter option: ");
		//int op = sc.nextInt();

//		int fAmount=4000;
		int s = fAmount;



			System.out.println("\n------------------------------------------------------------------------Quiz Disc------------------------------------------------------------------------");

			u1.d.setfAmount(fAmount);
			u1.d.calcQuizMarks();
			fAmount = u1.d.getfAmount();
			System.out.println("\nFinal amt after quiz disc: "+fAmount);
			fAmount = s;
//		}
//		else if(op==1)
//		{
			System.out.println("\n------------------------------------------------------------------------Bank Disc------------------------------------------------------------------------");

			u1.d.setfAmount(fAmount);
			u1.d.applyBankDiscOnFinalAmount("Ha");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after bank disc: "+fAmount);
			u1.d.applyBankDiscOnFinalAmount("JPM");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after bank disc: "+fAmount);
			fAmount = s;
//		}
//		else if(op==3)
//		{
			System.out.println("\n------------------------------------------------------------------------Local Disc-----------------------------------------------------------------------");

			u1.d.setfAmount(fAmount);
			u1.d.applyLocalDiscOnFinalAmount(4, "Bengaluru");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after local disc: "+fAmount);
			u1.d.setfAmount(fAmount);
			u1.d.applyLocalDiscOnFinalAmount(3, "Bengaluru");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after local disc: "+fAmount);
			fAmount = s;
//		}
//		else if(op==4)
//		{
			System.out.println("\n----------------------------------------------------------------------Lucky Draw Disc--------------------------------------------------------------------");

			u1.d.setfAmount(fAmount);
			u1.d.freeForLuckyDrawWinnerOnFinalAmount(1);
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after lucky draw: "+fAmount);
			fAmount = s;
//		}
//		else if(op==5)
//		{
			System.out.println("\n----------------------------------------------------------------------Promo Code Disc--------------------------------------------------------------------");

			u1.d.setfAmount(fAmount);
			u1.d.applyQuizPromoCodeOnFinalAmount("hello50");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after entering promo code: "+fAmount);
			u1.d.setfAmount(fAmount);
			u1.d.applyQuizPromoCodeOnFinalAmount("5OFF");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after entering promo code: "+fAmount);
			fAmount = s;

//		}
//		else
//		{
			System.out.println("Amount to be paid: "+fAmount);

		/*//Discount
		System.out.println("\nChoose what discount you want to apply: ");
		System.out.println("\n1. Quiz");
		System.out.println("2. Bank Offer");
		System.out.println("3. Local Discount");
		System.out.println("4. Lucky Draw");
		System.out.println("5. Enter Promo Code");
		System.out.println("Enter option: ");
		int op = sc.nextInt();

		
//		int fAmount=4000;

		
		if(op==1)
		{
			u1.d.setfAmount(fAmount);
			u1.d.calcQuizMarks();
			fAmount = u1.d.getfAmount();
			System.out.println("\nFinal amt after quiz disc: "+fAmount);
		}
		else if(op==2)
		{
			u1.d.setfAmount(fAmount);
			u1.d.applyBankDiscOnFinalAmount("Ha");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after bank disc: "+fAmount);
			u1.d.applyBankDiscOnFinalAmount("JPM");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after bank disc: "+fAmount);
		}
		else if(op==3)
		{
			u1.d.setfAmount(fAmount);
			u1.d.applyLocalDiscOnFinalAmount(4, "Bengaluru");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after local disc: "+fAmount);
			u1.d.setfAmount(fAmount);
			u1.d.applyLocalDiscOnFinalAmount(3, "Bengaluru");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after local disc: "+fAmount);
		}
		else if(op==4)
		{
			u1.d.setfAmount(fAmount);
			u1.d.freeForLuckyDrawWinnerOnFinalAmount(1);
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after lucky draw: "+fAmount);
		}
		else if(op==5)
		{
			u1.d.setfAmount(fAmount);
			u1.d.applyQuizPromoCodeOnFinalAmount("hello50");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after entering promo code: "+fAmount);
			u1.d.setfAmount(fAmount);
			u1.d.applyQuizPromoCodeOnFinalAmount("5OFF");
			fAmount = u1.d.getfAmount();
			System.out.println("Final amt after entering promo code: "+fAmount);
			
		}
		else
		{
			System.out.println("Amount to be paid: "+fAmount);
		}*/
			

	}

}

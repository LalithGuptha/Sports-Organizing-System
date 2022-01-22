package oopproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Food implements SummaryFinalAmount{
	
	private String[] foodName = new String[30];
	private String[] foodQuantity = new String[30];
	private float[] foodPrice = new float[10];
	
	private int[] foodWiseFinPrice = new int[10];
	
	private int finalFoodPrice;
	private int fAmount=0;
	private int k=0;
	private int m=0;
	
	public String[] getFoodName() {
		return foodName;
	}

	public void setFoodName(String[] foodName) {
		this.foodName = foodName;
	}

	public String[] getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(String[] foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public float[] getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(float[] foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int[] getFoodWiseFinPrice() {
		return foodWiseFinPrice;
	}

	public void setFoodWiseFinPrice(int[] foodWiseFinPrice) {
		this.foodWiseFinPrice = foodWiseFinPrice;
	}

	public int getFinalFoodPrice() {
		return finalFoodPrice;
	}

	public void setFinalFoodPrice(int finalFoodPrice) {
		this.finalFoodPrice = finalFoodPrice;
	}

	public int getfAmount() {
		return fAmount;
	}

	public void setfAmount(int fAmount) {
		this.fAmount = fAmount;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + Arrays.toString(foodName) + ", foodQuantity=" + Arrays.toString(foodQuantity)
				+ ", foodPrice=" + Arrays.toString(foodPrice) + ", foodWiseFinPrice="
				+ Arrays.toString(foodWiseFinPrice) + ", finalFoodPrice=" + finalFoodPrice + ", fAmount=" + fAmount
				+ "]";
	}

	public Food() {
		super();
	}

	public Food(String[] foodName, String[] foodQuantity, float[] foodPrice, int[] foodWiseFinPrice, int finalFoodPrice,
			int fAmount) {
		super();
		this.foodName = foodName;
		this.foodQuantity = foodQuantity;
		this.foodPrice = foodPrice;
		this.foodWiseFinPrice = foodWiseFinPrice;
		this.finalFoodPrice = finalFoodPrice;
		this.fAmount = fAmount;
	}

	
//	public String getFoodName() {
//		return foodName;
//	}
//	
//	public void setFoodName(String foodName) {
//		this.foodName = foodName;
//	}
//	
//	public String getFoodType() {
//		return foodType;
//	}
//	
//	public void setFoodType(String foodType) {
//		this.foodType = foodType;
//	}
//	
//	public float getFoodQuantity() {
//		return foodQuantity;
//	}
//	
//	public void setFoodQuantity(float foodQuantity) {
//		this.foodQuantity = foodQuantity;
//	}
//	
//	public float getMerchPrice() {
//		return merchPrice;
//	}
//	
//	public void setMerchPrice(float merchPrice) {
//		this.merchPrice = merchPrice;
//	}
//	
//	@Override
//	public String toString() {
//		return "Food [foodName=" + foodName + ", foodType=" + foodType + ", foodQuantity=" + foodQuantity
//				+ ", merchPrice=" + merchPrice + "]";
//	}
//	
//	public Food() {
//		super();
//	}
//	
//	public Food(String foodName, String foodType, float foodQuantity, float merchPrice) {
//		super();
//		this.foodName = foodName;
//		this.foodType = foodType;
//		this.foodQuantity = foodQuantity;
//		this.merchPrice = merchPrice;
//	}
//	
//	public void combo()
//	{
//		
//	}
	
	public void extractFromTick1IntoProgram() //Done
	{
		String path = "oopproj\\foodbought.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
//			Arrays.fill(foodName,'0');
//			Arrays.fill(foodQuantity,'0');
			Arrays.fill(foodPrice,0);
			while((line = br.readLine())!=null)
			{
				String[] food1 = line.split(",");
				foodName[m]=food1[0];
				foodQuantity[m]=food1[1];
				foodPrice[m] = foodWiseFinPrice[m]/Integer.parseInt(foodQuantity[m]);
				m++;
			}	
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void buyFood() //Done
	{
		String path = "oopproj\\food.csv";
		String path1 = "oopproj\\foodbought.csv";
		String line = "";
		String line1 = "";
		Arrays.fill(foodWiseFinPrice,0);
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			
			while((line1 = br1.readLine())!=null)
			{
				String[] food1 = line1.split(",");
				//System.out.println(food1[0]+"   "+food1[1]);
				while((line = br.readLine())!=null)
				{
					//System.out.println("hello");
					String[] values = line.split(",");
					if(food1[0].equals(values[0]))
					{
						finalFoodPrice = finalFoodPrice + Integer.parseInt(food1[1])*Integer.parseInt(values[1]);
						//System.out.println(Integer.parseInt(food1[1])*Integer.parseInt(values[1]));
						foodWiseFinPrice[k] = Integer.parseInt(food1[1])*Integer.parseInt(values[1]);
						k++;
						break;
					}
				}
			}	
			br.close();
			br1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showSummary() //Done
	{
		String path1 = "oopproj\\foodbought.csv";
		String line1 = "";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			int i=0;
			System.out.println("\nFood items bought by user: ");
			while((line1 = br1.readLine())!=null)
			{
				String[] food1 = line1.split(",");
				System.out.println("\nFood Name: "+food1[0]+"\nMerch Quantity: "+food1[1]+"\nMerch Wise Price: "+foodWiseFinPrice[i]+"\n");
				i++;
			}
			br1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
//	public void showSummaryOfEachFoodItem()
//	{
//		
//	}
	
	public void showMenu() //Done
	{
		System.out.println("\nDifferent kinds of foods available: \n");
		System.out.println("|  Product  | Price |");
		System.out.println("| Popcorn   | 200   |");
		System.out.println("| Chips     | 100   |");
		System.out.println("| Donut     | 200   |");
		System.out.println("| Pepsi     | 100   |");
		System.out.println("| Coke      | 100   |");
		System.out.println("| Fanta     | 100   |");
		System.out.println("| Sprite    | 100   |");
	}
	
//	public float calcFoodPrice()
//	{
//		
//	}
//	
//	public float calcFoodPrice(float price)
//	{
//		
//	}
//	
//	public float calcFoodPrice(float price, int disc)
//	{
//		
//	}
	
	public int addToFinalPrice(int finalAmount)
	{
		fAmount = finalAmount;
		return fAmount+finalFoodPrice;
	}
	
//	public static void main(String[] args){
//		Food f = new Food();
//		f.extractFromTick1IntoProgram();
//		System.out.println(f.foodQuantity[1]);
//		f.showMenu();
//		f.buyFood();
//		f.showSummary();
//		System.out.println(f.addToFinalPrice(0));
//	}
	
}
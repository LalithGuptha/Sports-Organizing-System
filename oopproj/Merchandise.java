package oopproj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Merchandise implements SummaryFinalAmount{

	private String[] merchName = new String[30];
	private String[] merchQuantity = new String[30];
	private float[] merchPrice = new float[10];
	
	private int[] merchWiseFinPrice = new int[10];
	
	private int finalProdPrice;
	private int fAmount=0;
	private int k=0;
	private int m=0;
	
	public String[] getMerchName() {
		return merchName;
	}

	public void setMerchName(String[] merchName) {
		this.merchName = merchName;
	}

	public String[] getMerchQuantity() {
		return merchQuantity;
	}

	public void setMerchQuantity(String[] merchQuantity) {
		this.merchQuantity = merchQuantity;
	}

	public float[] getMerchPrice() {
		return merchPrice;
	}

	public void setMerchPrice(float[] merchPrice) {
		this.merchPrice = merchPrice;
	}

	public int[] getMerchWiseFinPrice() {
		return merchWiseFinPrice;
	}

	public void setMerchWiseFinPrice(int[] merchWiseFinPrice) {
		this.merchWiseFinPrice = merchWiseFinPrice;
	}

	public int getFinalProdPrice() {
		return finalProdPrice;
	}

	public void setFinalProdPrice(int finalProdPrice) {
		this.finalProdPrice = finalProdPrice;
	}

	public int getfAmount() {
		return fAmount;
	}

	public void setfAmount(int fAmount) {
		this.fAmount = fAmount;
	}

	@Override
	public String toString() {
		return "Merchandise [merchName=" + Arrays.toString(merchName) + ", merchQuantity="
				+ Arrays.toString(merchQuantity) + ", merchPrice=" + Arrays.toString(merchPrice)
				+ ", merchWiseFinPrice=" + Arrays.toString(merchWiseFinPrice) + ", finalProdPrice=" + finalProdPrice
				+ ", fAmount=" + fAmount + "]";
	}

	public Merchandise() {
		super();
	}

	public Merchandise(String[] merchName, String[] merchQuantity, float[] merchPrice, int[] merchWiseFinPrice,
			int finalProdPrice, int fAmount) {
		super();
		this.merchName = merchName;
		this.merchQuantity = merchQuantity;
		this.merchPrice = merchPrice;
		this.merchWiseFinPrice = merchWiseFinPrice;
		this.finalProdPrice = finalProdPrice;
		this.fAmount = fAmount;
	}


	
//	public String getMerchName() {
//		return merchName;
//	}
//
//	public void setMerchName(String merchName) {
//		this.merchName = merchName;
//	}
//
//	public float getMerchQuantity() {
//		return merchQuantity;
//	}
//
//	public void setMerchQuantity(float merchQuantity) {
//		this.merchQuantity = merchQuantity;
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
//		return "Merchandise [merchName=" + merchName + ", merchType=" + merchType + ", merchQuantity=" + merchQuantity
//				+ ", merchPrice=" + merchPrice + "]";
//	}
//
//	public Merchandise() {
//		super();
//	}
//	
//	public Merchandise(String merchName, String merchType, float merchQuantity, float merchPrice) {
//		super();
//		this.merchName = merchName;
//		this.merchType = merchType;
//		this.merchQuantity = merchQuantity;
//		this.merchPrice = merchPrice;
//	}
	
//	public void combo()
//	{
//		
//	}
	
	public void extractFromProd1IntoProgram()
	{
		String path = "oopproj\\merchbought.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			Arrays.fill(merchPrice,0);
			while((line = br.readLine())!=null)
			{
				String[] prod1 = line.split(",");
				merchName[m]=prod1[0];
				merchQuantity[m]=prod1[1];
				merchPrice[m] = merchWiseFinPrice[m]/Integer.parseInt(merchQuantity[m]);
				m++;
			}	
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void buyMerch()
	{
		String path = "oopproj\\merchandise.csv";
		String path1 = "oopproj\\merchbought.csv";
		String line = "";
		String line1 = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			
			while((line1 = br1.readLine())!=null)
			{
				String[] prod1 = line1.split(",");
				while((line = br.readLine())!=null)
				{
					String[] values = line.split(",");
					if(prod1[0].equals(values[0]))
					{
						finalProdPrice = finalProdPrice + Integer.parseInt(prod1[1])*Integer.parseInt(values[1]);
						merchWiseFinPrice[k] = Integer.parseInt(prod1[1])*Integer.parseInt(values[1]);
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
	
	public void showSummary()
	{
		String path1 = "oopproj\\merchbought.csv";
		String line1 = "";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			int i=0;
			System.out.println("\nMerchandise bought by user: ");
			while((line1 = br1.readLine())!=null)
			{
				String[] prod1 = line1.split(",");
				System.out.println("\nMerch Name: "+prod1[0]+"\nMerch Quantity: "+prod1[1]+"\nMerch Wise Price: "+merchWiseFinPrice[i]+"\n");
				i++;
			}
			br1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
//	public void showSummaryOfEachMerch()
//	{
//		
//	}
	
	public void showMerch()
	{
		System.out.println("\nDifferent kinds of Merchandise available: \n");
		System.out.println("|  Product  | Price |");
		System.out.println("| Cap       | 100   |");
		System.out.println("| Shirt     | 500   |");
		System.out.println("| Cards     | 100   |");
		System.out.println("| Bat       | 1000  |");
		System.out.println("| Ball      | 100   |");
		System.out.println("| Poster    | 100   |");
		System.out.println("| Hoodie    | 1000  |");
	}
	
//	public float calcMerchPrice()
//	{
//		
//	}
//	
//	public float calcMerchPrice(float price)
//	{
//		
//	}
//	
//	public float calcMerchPrice(float price, int disc)
//	{
//		
//	}
	
	public int addToFinalPrice(int finalAmount)
	{
		fAmount = finalAmount;
		return fAmount+finalProdPrice;
	}
	
//	public static void main(String[] args){
//		Merchandise f = new Merchandise();
//		f.extractFromProd1IntoProgram();
//		System.out.println(f.merchQuantity[1]);
//		f.showMerch();
//		f.buyMerch();
//		f.showSummary();
//		System.out.println(f.addToFinalPrice(2000));
//	}
	
}
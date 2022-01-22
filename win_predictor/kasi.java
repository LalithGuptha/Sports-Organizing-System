package win_predictor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class kasi {
	public void showSummary()
	{
		String path1 = "CheckEvent\\winInput.csv";
		String line1 = "";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			int i=0;
			while((line1 = br1.readLine())!=null )
			{
				String[] prod1 = line1.split(",");
				System.out.println("Merch Name: "+prod1[0] );
				i++;
			}
			br1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void main (String args[])
	{
	
	}
}

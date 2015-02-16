
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class couplelist extends family
{
	public static void CoupleList() throws IOException 
	{
		FileReader file= new FileReader("G:/final project/Sandesh-Family-1-Feb-2015 .ged");
		BufferedReader buffer= new BufferedReader(file);

		String line=null;
		String first_name=null;
		String gender=null;

		while ((line = buffer.readLine()) != null)
		{
			if (line.contains("NAME"))
			{
				String[] list = line.split(" ");
				first_name = list[2];
			}
			if (line.contains("SEX"))
			{
				String[] pair = line.split(" ");
				gender = pair[2];
			}
			if (line.contains("FAMS") && gender.equals("M"))
			System.out.println("Husband's name is " + first_name );
			else if (line.contains("FAMS") && gender.equals("F"))
			System.out.println("Wife's name is " + first_name);
		}
	}
}

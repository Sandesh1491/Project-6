package agile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class family 
{
	public static void Family() throws IOException 
	{
		FileReader file= new FileReader("Users/naisargee/Documents/Sandesh-Family-1-Feb-2015.ged ");
		BufferedReader buffer = new BufferedReader(file);
		String line = null;
		String individual;
		String family;
		
		while ((line = buffer.readLine()) != null) 
		{
			if (line.contains("@I"))
			{
				individual= line.trim().substring(4, 5);
				if (individual.equals("5000"))
				System.out.println("Individual more than 5000");
			}
			if (line.contains("@F"))
			{
				family = line.trim().substring(4, 5);
				if (family.equals("1000"))
				System.out.println("Family more than 1000");
			}
			if (line.contains("NAME") && line.contains("1"))
			{

				String[] list = line.split(" ");
				String first_name1 = list[2]; 
				System.out.println(first_name1 );
			}		
		}  
	}
}

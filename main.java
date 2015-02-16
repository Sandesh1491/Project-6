import java.io.IOException;

public class main 
{
	public static void main(String[] n)
	{
		try
		{
			couplelist a=new couplelist();
			System.out.println("List of family members");
			a.Family();
			System.out.println("=======================");
			System.out.println("List of husband and wife");
			a.CoupleList();
		}
		catch(IOException a){

			System.out.println("Error is :"+a.getMessage());
		}
	}

}


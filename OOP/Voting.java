package EclipsePractice;
import java.util.*;

class NewException extends Exception
{
	public String toString()
	{
		return "kjhgf";
		
	}
}




public class Voting {

	public static void main(String[] args) throws Exception {
		NewException e=new NewException();
		System.out.println("Enter ur age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
	
		if(age>18)
			System.out.println("Valid for voting");
		
		else
			throw new NewException();
		//throw System.out.println(e.toString());
			
	}

}

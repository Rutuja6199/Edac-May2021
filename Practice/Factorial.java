import java.util.*;

class Factor
{
	static int facto(int n)
	{		
			int fact=1;
		for(int i=1;i<=n;i++)	
		{
			fact=fact*i;
	
		}
		return fact;
		//System.out.println(fact);
	}
}

class Factorial
{
	public static void main(String args[])

	{
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int f=Factor.facto(number);
		System.out.println(f);
	}

}
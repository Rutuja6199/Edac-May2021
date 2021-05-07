import java.util.*;

class Ques5
{
	public static void main(String args[])
	{
		System.out.println("Enter 2 no:");
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		int j=s1.nextInt();
		int k=i*j;
		System.out.println("First no: " +i);
		System.out.println("Second no: " +j);
		System.out.println("Product is: " +k);
	}
}
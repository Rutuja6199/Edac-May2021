import java.util.*;

class Ques12
{
	public static void main(String args[])
	{
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float d;
	
		d=(a+b+c)/3;
		System.out.println("Average of number is: "+d);
	}
}
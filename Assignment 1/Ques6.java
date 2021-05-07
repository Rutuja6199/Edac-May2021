import java.util.*;

class Ques6
{
	public static void main(String args [])
	{
	System.out.println("Enter 2 numbers:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int add, sub, mult, div, rem;
	add=a+b;
	sub=a-b;
	mult=a*b;
	div=a/b;
	rem=a%b;

	System.out.println("Addition : " +add);
	System.out.println("Subtraction : " +sub);
	System.out.println("Multiplication : " +mult);
	System.out.println("Division : " +div);
	System.out.println("Remainder : " +rem);
	}
}
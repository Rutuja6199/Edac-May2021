import java.util.*;

class Ques15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second no: ");
		int num2=sc.nextInt();
	
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swaping : ");
		System.out.println("First no is : "+ num1);
		System.out.println("Second no is : "+num2);
		
	}
}
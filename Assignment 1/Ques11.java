import java.util.*;

class Ques11
{
	public static void main(String args[])
	{
		System.out.println("Enter radius: ");
		Scanner sc=new Scanner(System.in);
		double rad=sc.nextDouble();
	
		double area, peri;
		area= (3.14*rad*rad);
		peri=(2*3.14*rad);
		System.out.println("Area of Circle is : "+ area);
		System.out.println("Perimeter of Circle is : "+peri);
		
	}
}
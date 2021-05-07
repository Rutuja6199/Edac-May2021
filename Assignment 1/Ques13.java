import java.util.*;

class Ques13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		double l=sc.nextDouble();
		System.out.println("Enter breadth: ");
		double b=sc.nextDouble();
	
		double area, peri;
		area=l*b;
		peri=2*(l+b);
		System.out.println("Area of Rectangle is : "+ area);
		System.out.println("Perimeter of Rectangle is : "+peri);
		
	}
}
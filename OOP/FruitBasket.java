package EclipsePractice;
import java.util.*;
class Apple
{
	int countapp(int a)
	{
		System.out.println("Total no of apples is :" +a);
		return a;
	}

}
class Mango extends Apple
{
	int countman(int m)
	{
		System.out.println("Total no of Mangoes is :" +m);
		return m;
	}
}

class Fruit extends Mango
{
	int cal(int a,int m)
	{
		System.out.println("Total no of fruits is :" +(a+m));
		return a+m;
	}
}

public class FruitBasket {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Fruit f=new Fruit();
		System.out.println("Enter no of apples");
		int a=sc.nextInt();
		f.countapp(a);
		System.out.println("Enter no of mangoes");
		int m=sc.nextInt();
		f.countapp(m);
		f.cal(a, m);
		
	}
}

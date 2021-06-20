package EclipsePractice;
import java.util.*;

class Marks
{
	int rn;
	String name;
	 Marks(int rn, String name)
	{
		this.rn=rn;
		this.name=name;
	}
}

class Physics extends Marks
{	
	
int p;
	

	
}

class Chemistry extends Marks
{
	int c;
	
	Chemistry(int rn, String name,int c) {
		super(rn, name);
		this.c=c;
	}

}

class Math extends Marks
{
	int m;
	
	Math(int rn, String name,int m) {
		super(rn, name);
		this.m=m;
	}

}

class Average 
{
Average(int rn, String name, int m) {
		super(rn, name, m);
		// TODO Auto-generated constructor stub
	}

}







public class Students {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{	System.out.println("Enter roll no:");
			int roll=sc.nextInt();
		System.out.println("Enter name:");
			sc.nextLine();
			String nm=sc.nextLine();
			System.out.println("physics");
			int p=sc.nextInt();
			System.out.println("chem");
			int c=sc.nextInt();
			System.out.println("math");
			int m=sc.nextInt();
			Marks m1=new Marks(roll,nm);
			//System.out.println(m1.rn+m1.name);
		}
		
	}
}

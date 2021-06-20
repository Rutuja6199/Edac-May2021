import java.util.*;

class Arr_remove
{
	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter size ");
	int n=sc.nextInt();

	int a[]= new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	

	System.out.println("Enter number ");
	int num=sc.nextInt();
	int flag=0;
	for(int i=0;i<a.length;i++)
	{
		if(num==a[i])
		{System.out.println("array contains "+num+ "at position"+(i+1));
		
		flag=1;}
	}
	if(flag==0)
	System.out.println("array not contains "+num);
	else
	{
		System.out.println("enter no u want to remove");
		int c=sc.nextInt();

		for(int i=c;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("Updated array is ");
		for(int i=0;i<a.length-1;i++)
		{
		System.out.print("  "+a[i]);
		}
	}
} 
}
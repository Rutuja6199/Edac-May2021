import java.util.*;

class Arr_avg
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
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Average is "+ ((float)sum/n));

} 
}
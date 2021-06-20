
 package EclipsePractice;
 import java.util.*;
 
 
 public class ArrayFunction {
	public static void main(String args[])
	{
		Arrfeat a1=new Arrfeat();
		a1.SetDetails();
		int ar[]=a1.getArray();
		
		System.out.println("Max no is :"+a1.max(ar));
		System.out.println("Min no is :"+a1.min(ar));
		System.out.println("Average is :"+a1.avg(ar));
		System.out.println("Reverse array is :"+a1.rev(ar));
		
	}
}

 class Arrfeat
{

	Scanner sc= new Scanner(System.in);
	
		{System.out.println("Enter size of array");}
	    int n=sc.nextInt();
	    int a[]=new int[n];
	
	   void SetDetails()
	   {
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	   }
	
	   int[] getArray()
	   {
		   System.out.println("Array is");
		   for(int i=0;i<n;i++)
			System.out.println(a[i]);
		   return a;
	   }
	
	   int max(int a[])
	   {
		   int m=a[0];
		   for(int i=1;i<a.length;i++)
		   {
			   if(m<a[i])
			   	{
				   m=a[i];
			   	}
		   }
		   	return m;
		}
	
	int min(int a[])
	{
		int m=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(m>a[i])
			{
				m=a[i];
			}
		}
		return m;
	}
	
	double avg(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		
		double average=sum/a.length;
		return average;
		
	}
	
	int rev(int a[])
	{
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			
			b[j]=a[i];
			j++;
				
		}
		for(int x:b)
			System.out.println(x);
			return 0;
		
	}
	
	
}
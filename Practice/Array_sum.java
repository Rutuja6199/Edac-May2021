import java.util.*;

class Array_sum
{
	public static void main(String args[])

	{
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}

}
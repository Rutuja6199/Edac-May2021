import java.util.*;
public class MissingNumber {

	static int missingno(int a[],int n)
	{
		int sum1=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			sum=sum+a[i];
		}
		return sum1-sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int a[]=new int[n-1];
		System.out.println("Enter element");
		for(int i=0;i<n-1;i++)
			a[i]=sc.nextInt();
		
		int ans=missingno(a,n);
		System.out.println("missing no is "+ans);
	}

}

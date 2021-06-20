/* How to find repeated numbers in an array if it contains
multiple duplicates?*/
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrray");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int x:a)
			System.out.println(x);
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				System.out.println(a[i]+" is repeated");	
			}
			
		}

	}

}

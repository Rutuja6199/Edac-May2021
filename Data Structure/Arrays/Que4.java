/*4. Write a program to find all pairs on an integer array whose sum
is equal to a given number?
Eg :
Input : 1 2 4 5 3 6 3 7
Output: 3, 3 and 4, 2
6,1 and 4 , 3*/
import java.util.*;
public class Que4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of arrray");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int x:a)
			System.out.println(x);
		
		System.out.println("Enter number");
		int x=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==x)
					System.out.println(a[i]+" ,"+a[j]);
			}
		}
	}

}

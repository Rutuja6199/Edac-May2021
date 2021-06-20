/*How to find the missing number in an integer array of 1
to 100?*/
import java.util.*;
public class Question1 {

	 static void search(int a[],int key)
	{int f=0;;
		 for(int i=0;i<100;i++)
		 {
			 if(a[i]==key)
				System.out.println("Element found");
			
		 }
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		for(int i=0;i<100;i++)
			a[i]=i+1;
		
		System.out.println("Enter element:");
		int x=sc.nextInt();
		
		search(a,x);
		

	}

}

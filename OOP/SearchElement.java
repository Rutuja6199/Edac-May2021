/*7. Write a Java program to search an element in an array list. */

package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> clr=new ArrayList<String>();
		System.out.println("Enter no element");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter element");
		for(int i=0;i<n;i++)
		{
		String e=sc.nextLine();
		clr.add(e);
		}
	
		
		System.out.println("Enter element do u want to search");
		String c=sc.nextLine();
		
		int i=clr.indexOf(c);
		
		if(i!=-1)
		System.out.println(c+" is present at position "+i);
		else
			System.out.println(c+" is not present  ");	
}
}

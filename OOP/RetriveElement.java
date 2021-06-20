/*4. Write a Java program to retrieve an element (at a specified index) from a given array list.*/
package Collections;

import java.util.*;


public class RetriveElement {

	public static void main(String[] args) {
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index no:");
		int i=sc.nextInt();
		System.out.println(clr.get(i));

	}

}

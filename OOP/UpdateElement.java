/*5. Write a Java program to update specific array elements by a given element.*/ 
package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateElement {
	public static void main(String[] args) {
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter color:");
		String s=sc.nextLine();
		System.out.println("enter index no:");
		int i=sc.nextInt();
		clr.set(i, s);
		
		for(String a:clr)
			System.out.println(a);

}
}
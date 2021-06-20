/*1. Write a Java program to create a new array list, add some colors (string) and print out the collection
*/
package Collections;

import java.util.*;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
		
		for(String s:clr)
			System.out.println(s);
	}

}

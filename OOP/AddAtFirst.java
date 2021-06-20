/*3. Write a Java program to insert an element into the array list at the first position.*/
package Collections;

import java.util.ArrayList;
import java.util.List;

public class AddAtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
		
		System.out.println("------Before adding element------");
		for(String s:clr)
			System.out.println(s);
		
		clr.add(1,"White");
		System.out.println("------After adding element------");
		for(String s:clr)
			System.out.println(s);

	}

}

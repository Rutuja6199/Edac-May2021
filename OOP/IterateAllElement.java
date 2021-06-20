/*2. Write a Java program to iterate through all elements in an array list.*/
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateAllElement {
	public static void main(String args[])
	{
		
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
		
		Iterator itr=clr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

/*6. Write a Java program to remove the third element from an array list. */

package Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> clr=new ArrayList<String>();
		clr.add("Red");
		clr.add("YEllow");
		clr.add("Blue");
		clr.add("Purple");
		clr.add("Pink");
	
		clr.remove(3);
		for(String a:clr)
			System.out.println(a);
}
}
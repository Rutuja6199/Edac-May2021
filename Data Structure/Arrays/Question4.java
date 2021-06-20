/*Write a program to find the intersection of two sorted arrays
in Java?*/
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1[]= {1,5,9,6,3,4,5,2};
		int a2[]= {3,4,6,2,1,8,7};
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
			}
		}
	}

}

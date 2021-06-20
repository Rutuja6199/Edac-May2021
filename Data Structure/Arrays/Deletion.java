import java.util.*;
public class Deletion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {5,6,8,7,5};
		System.out.println("Enter pos:");
		int pos=sc.nextInt();
		int n=a.length-1;
	for(int i=pos;i<n;i++)
		a[i]=a[i+1];
	for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}

}

import java.util.*;
public class BinarySearch {
	
	static int bsearch(int a1[],int key,int low,int high)
	{
		if(high>=low) 
		{
			int mid = low + (high - low)/2;
			
			if(a1[mid]==key)
				return mid;
			
			 if(key<a1[mid])
				return bsearch(a1,key,low,mid-1);
		
			return bsearch(a1,key,mid+1,high);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1[]= {10,20,36,45,59,68,75,84,96,100,103,115,198};
		System.out.println("Enter key:");
		int key=sc.nextInt();
		
		int ans=bsearch(a1,key,0,a1.length-1);
		
		if(ans!=-1)
			System.out.println(key+" is found at position "+ans );
		else
			System.out.println(" not found");
		
		
	}

}

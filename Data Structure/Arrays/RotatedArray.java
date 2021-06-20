import java.util.Scanner;

public class RotatedArray {
	
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
	
	static int rotatesearch(int a1[],int key,int low,int high)
	{
		int max=0;
		
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>max)
				max=i;
		}
		
		int mid=max;
		if(a1[mid]==key)
			return mid;
		else {
		int ans1=bsearch(a1,key,0,mid-1);
		if(ans1!=-1) {
			return ans1;
			}
		else {
			int ans2=bsearch(a1,key,mid+1,a1.length-1);
			return ans2;
			}
	}}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1[]= {5,7,8,9,10,1,2,3,4};
		System.out.println("Enter key:");
		int key=sc.nextInt();
		
		int ans=rotatesearch(a1,key,0,a1.length-1);
		if(ans!=-1)
			System.out.println(key+" is found at position "+ans );
		else
			System.out.println(" not found");

	}

}

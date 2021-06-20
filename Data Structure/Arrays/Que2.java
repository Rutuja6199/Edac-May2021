/*2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10
After splitting :
Array 1 : 1 2 3 4
5
Array 2 : 6 7 8 9
10*/
public class Que2 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int a1[]=new int[a.length/2];
		int a2[]=new int[a.length/2];
		int x=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length/2)
				{
				a1[i]=a[i];
				
				}
			else
				{a2[x]=a[i];	
			x++;}
		}
		System.out.println("Array 1:  ");
		for(int i:a1)
			System.out.print(i+" ");
		
		System.out.println("\n Array 2:  ");
		for(int i:a2)
			System.out.print(i+" ");
	}
}

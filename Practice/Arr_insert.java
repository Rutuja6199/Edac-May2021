import java.util.*;

class Arr_insert
{
	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter size ");
	int n=sc.nextInt();

	int a[]= new int[n];
	int b[]= new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("array is"+ Arrays.toString(a));
	
	System.out.println("Enter number to insert ");
	int num=sc.nextInt();
	System.out.println("Enter position to insert ");
	int pos=sc.nextInt();
	int temp;
	temp=a[pos];
	a[pos]=num;
	for(int i=pos;i<n+1;i++)
	{
		a[i+1]=a[i-1];
	}
	
	System.out.println("New array is"+ Arrays.toString(a));

} 
}
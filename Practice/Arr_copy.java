import java.util.*;

class Arr_copy
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
	
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	
	System.out.println("New array is"+ Arrays.toString(b));

} 
}
import java.util.*;
 
class Ques7
{
	public static void main(String args[])
	{
		System.out.println("Enter no: ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		int a,j;
		for(a=1;a<=10;a++)
		{
			j=i*a;
			System.out.print(i +"*"+a);
			System.out.println("="+j);
		}
	}
}
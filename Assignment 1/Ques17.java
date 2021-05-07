import java.util.*;

class Ques17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first binary no:");
		int b1=sc.nextInt();
		System.out.println("Enter second binary no:");
		int b2=sc.nextInt();

		int sum[]=new int[10];
		int carry=0, i=0;
		
		while(b1!=0 || b2!=0)
		{
			sum[i]=((b1%10 + b2%10 +carry)%2);
			i++;
			carry=((b1%10 + b2%10 +carry)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if(carry!=0)
		{
			sum[i]=carry;
		}
		while(i>=0)	
		{
			System.out.print(sum[i]);
			i--;
		}

	}
}
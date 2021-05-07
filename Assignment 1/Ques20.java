import java.util.*;

class Ques20
{
	public static void main(String args[])
	{
		System.out.println("Decimal to Hexadecimal");
		System.out.println("Enter decimal no: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		String hex_no="";
		int remainder, i=1;
		char rtemp=Character.parseChar(remainder);

		while(n!=0)
		{
			remainder=n%16;
			rtemp=remainder;
			if(remainder>=10)
			{
				if(remainder==10)
				remainder='A';

				else if(remainder==11)
				remainder='B';

				else if(remainder==12)
				remainder='C';

				else if(remainder==13)
				remainder='D';

				else if(remainder==14)
				remainder='E';

				else if(remainder==15)
				remainder='F';


			}
			n /=2;
			hex_no+=rtemp;
			//i*=10;
		}

		System.out.println("Hexadecimal no is : "+hex_no);		
	}
}
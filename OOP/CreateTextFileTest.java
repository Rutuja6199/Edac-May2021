import java.io.*;
import java.util.*;
import java.util.Scanner;
public class CreateTextFileTest {

	public static void main(String[] args) throws IOException {
		CreateTextFile c=new CreateTextFile();
		c.addRecord();
	}

}

 class AccountRecord
{
	private int account;
	private String firstname;
	private String lastname;
	private double balnce;
	
	public AccountRecord()
	{
		
	}
	public AccountRecord(int acct,String first,String last,double bal)
	{
		account=acct;
		firstname=first;
		lastname=last;
		balnce=bal;
	}
}
 
 class CreateTextFile
 {
	 Scanner sc=new Scanner(System.in);
	void addRecord()throws IOException
	{
		System.out.println("Enter how many employee data u want:");
		int n=sc.nextInt();
		FileWriter fw=new FileWriter("client.txt"); 
		 PrintWriter p=new PrintWriter(fw); 
		while(n!=0)
		{	
			System.out.println("Enter id:");
			int a=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter fname:");
			String b=sc.nextLine();
			System.out.println("Enter lname:");
			String c=sc.nextLine();
			System.out.println("Enter bal:");
			double d=sc.nextDouble();
			AccountRecord ar=new AccountRecord(a,b,c,d);
			p.print(ar);
			n--;
		}
		
		BufferedReader br=new BufferedReader(new FileReader("client.txt")); 
		 String line=br.readLine(); 
		 while(line!=null) 
		 { 
		 System.out.println(line); 
		 line=br.readLine(); 
		 } 
		// br.close(); 
		 p.flush(); 
		 br.close(); 
		 p.close(); 
		/*List<AccountRecord> data =new ArrayList<AccountRecord>();
		for(AccountRecord emp : data)
			System.out.println(emp);*/
		
	}
	 
 }
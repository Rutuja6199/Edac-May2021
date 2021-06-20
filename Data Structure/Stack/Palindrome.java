import java.util.*;
public class Palindrome {

	void palindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		String s1=s;
		int n=s.length();
		Stackarray st=new Stackarray(n);
		for(int i=0;i<n;i++)
			st.push(s.charAt(i));
		for(int i=0;i<n;i++)
		{
			if(s1.charAt(i)==st.arr[st.top])
			{char ch=(char)st.pop();
			System.out.println(ch);
			}
		}
		if(st.isempty())
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.palindrome();
		
		
	}

}

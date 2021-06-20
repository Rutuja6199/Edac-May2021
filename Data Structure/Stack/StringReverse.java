
public class StringReverse {
	
	public static void reverse(StringBuffer str)
	{
		int n=str.length();
		Stackarray st=new Stackarray(n);
		for(int i=0;i<n;i++)
			st.push(str.charAt(i));
		for(int i=0;i<n;i++)
		{
			char ch=(char)st.pop();
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("RUTUJA");
		reverse(s);

	}

}


public class InfixtoPost {
	static void postfix(String s)
	{	Stackarray1 st=new Stackarray1(s.length()); 
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' || ch=='(')
			{
				st.push(ch);}
			else if(ch==')')
			{
				do
				{
					char x=st.pop();
					if(x!='(')
					System.out.println(x);
				}while(st.pop()==')');
			}
			else
				System.out.println(ch);
				
		}
		System.out.println(st.pop());
	}
	public static void main(String args[])
	{
		String s="((a+b)-(c+d)*e)/f)";
		
		postfix(s);
	}

}


 class Stackarray1 {
	char arr[];
	int cap;
	int top=-1;
	
	Stackarray1(int size)
	{
		arr=new char [size];
		cap=size;
	}
	public boolean isempty()
	{
		return top==-1;
	}
	
	public boolean isfull()
	{
		return top==cap-1;
	}
	
	public void push(char data)
	{
		if(isfull())
		{
			System.out.println("Stack is full..can't push no");
		}
		arr[++top]=data;
	}
	
	public char pop()
	{
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		//System.out.println("pop element is :"+arr[top]);
		return arr[top--];
		
	}}
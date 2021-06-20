class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}
public class StackusingLinkL {
	Node top=null;
	public boolean isempty()
	{
		return top==null;
	}
	
	public void push(int d)
	{
		Node temp=new Node(d);
		if(top==null)
		{
			top=temp;
		}
		else
		{
			temp.next=top;
			top=temp;
		}
	}
	
	public void pop()
	{
		top=top.next;
	}
	void display()
	{
		Node i=top;
		while(i!=null)
		{
			System.out.println(i.data);
			i=i.next;
		}
	}
	public static void main(String[] args) {
		StackusingLinkL s=new StackusingLinkL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.display();

	}

}

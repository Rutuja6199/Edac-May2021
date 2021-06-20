import java.util.Scanner;



public class Que1 {

	Scanner sc=new Scanner(System.in);
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
	public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void create()
	{	Node p=null;
		
		System.out.println("Enter no of nodes");
		int n=sc.nextInt();
		System.out.println("Enter data");
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			
			if(head==null)
			{
				 p=head=new Node(d);
			}
			else
			{
				Node temp=new Node(d);
				//Node p=head;
				p.next=temp;
				p=p.next;
			}
		}
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void evenodd()
	{
		create();
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data%2==0)
				System.out.print("-->"+temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
			if(temp.data%2==1)
				System.out.print("-->"+temp.data);
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		Que1 q1=new Que1();
		
		q1.evenodd();
		//q1.display();

	}

}

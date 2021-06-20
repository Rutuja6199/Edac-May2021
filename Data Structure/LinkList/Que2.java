import java.util.Scanner;




public class Que2 {

	Scanner sc=new Scanner(System.in);
	Node head1,head2;
	
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
	
	void create1()
	{	Node p=null;
		
		System.out.println("Enter no of nodes");
		int n=sc.nextInt();
		System.out.println("Enter data");
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			
			if(head1==null)
			{
				 p=head1=new Node(d);
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
	
	void create2()
	{	Node p=null;
		
		System.out.println("Enter no of nodes");
		int n=sc.nextInt();
		System.out.println("Enter data");
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			
			if(head2==null)
			{
				 p=head2=new Node(d);
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
		Node temp=head1;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		System.out.println();
		Node temp1=head2;
		while(temp1!=null)
		{
			System.out.print(" "+temp1.data);
			temp1=temp1.next;
		}
	}
	
	public void intersection()
	{
		create1();
		create2();
		Node temp1=head1;
		Node temp2=head2;
		
		while(temp1!=null)
		{
			temp2=head2;
			while(temp2!=null)
			{
				if(temp1.data==temp2.data)
				System.out.print(" "+temp2.data);
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Que2 q2=new Que2();
		
		q2.intersection();
		q2.display();

	}

}

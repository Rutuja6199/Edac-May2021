import java.util.*;

public class Linklist {
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
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
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
	
	
	void insertB()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		Node temp=new Node(d);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	
	void insertEnd()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		Node temp=new Node(d);
		if(head==null)
		{
			head=temp;
		}
		Node p=head;
		while(p.next!=null)
		{
		p=p.next;
		}
		p.next=temp;
	}
	
	void insertMid()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		System.out.println("Enter key");
		int key=sc.nextInt();
		Node temp=new Node(d);
		Node p=head;
		while(p.data!=key )
		{
			p=p.next;
		}
		temp.next=p.next;
		p.next=temp;
	}
	
	void deleteB()
	{
		head=head.next;
	}
	
	void deleteEnd()
	{
		Node p=head;
		while(p.next.next!=null)
		{
			p=p.next;
		}
		p.next=null;
	}
	
	void deleteMid()
	{
		System.out.println("Enter key");
		int key=sc.nextInt();
		Node p1=head;
		Node p=head;
		if(head.data==key)
		{
			head=head.next;
		}
		else 
				{while(p.data!=key)
			{
				p1=p;
				p=p.next;
				
			}
			p1.next=p.next;
			
		}
		
	}
	
	void deleteMidByPos()
	{
		create();
		System.out.println("Enter pos");
		int pos=sc.nextInt();
		Node p1=head;
		Node p=head;
		
		
		if(pos==0)
		{
			deleteB();
		}
		else
			{
				for(int i=0;i<pos;i++)
			
				{
					p1=p;
					p=p.next;
				}
				p1.next=p.next;
			}
		
	}
	
	void reverse()
	{	Node p=head,q=head;
		head=head.next;
		q=head;
		p.next=null;
		while(head!=null)
		{
			head=head.next;
			q.next=p;
			p=q;
			q=head;
		}
		head=p;
	}
	
	
	public static void main(String[] args) {
	 Linklist l1=new Linklist();
	/* l1.head=new Node(10);
	 Node second=new Node(20);
	 l1.head.next=second;
	 Node third=new Node(30);
	 second.next=third;*/
	 
l1.create();
	//l1.insertB(); 
	//l1.insertEnd();
	//l1.insertMid();
	//l1.deleteMid();
	//l1.deleteMidByPos();
	l1.reverse();
	 l1.display();
	 
	 

	}

}

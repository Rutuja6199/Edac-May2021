import java.util.*;

import Linklist.Node;


public class DoubleLL {
	Scanner sc=new Scanner(System.in);
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data=d;
			next=prev=null;
		}
	}
	
	
	public void create()
	{Node temp=head;
		System.out.println("Enter no of nodes");
		int num=sc.nextInt();
		System.out.println("Enter data");
		for(int i=0;i<num;i++)
		{
			int d=sc.nextInt();
			Node n=new Node(d);
			
			if(head==null)
			{
				temp=head=n;
			}
			
			else
			{
				
				temp.next=n;
				n.prev=temp;
				temp=temp.next;
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
	
	
	public void insertB()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		Node n=new Node(d);
		if(head==null)
		{
			head=n;
		}
		else {
		n.next=head;
		head.prev=n;
		head=n;}
	}
	
	public void insertEnd()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		Node n=new Node(d);
		Node temp=head;
		if(head==null)
		{
			head=n;
		}
		else {
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
	}
	
	public void insertMid()
	{
		System.out.println("Enter Data");
		int d=sc.nextInt();
		System.out.println("Enter key");
		int key=sc.nextInt();
		Node n=new Node(d);
		Node temp=head;
		if(head==null)
		{
			head=n;
		}
		else {
			while(temp.data!=key)
			{
				temp=temp.next;
			}
			n.next=temp.next;
			n.prev=temp;
			if(temp.next!=null)
			n.next.prev=n;
			temp.next=n;
			
		}
	}
	
	
	
	void insertByPos()
	{
		create();
		System.out.println("Enter data");
		int d=sc.nextInt();
		System.out.println("Enter pos");
		int pos=sc.nextInt();
		Node temp=head;
		Node n=new Node(d);
		
		if(pos==0)
		{
			n.next=head;
			head.prev=n;
			head=n;
		}
		else
			{
				
				for(int i=1;i<pos;i++)
			
				{
					temp=temp.next;
				}
				n.next=temp.next;
				n.prev=temp;
				if(temp.next!=null)
				n.next.prev=n;
				temp.next=n;
			}
		
	}
	
	void deleteB()
	{
		if(head==null)
			System.out.println("List is null");
		else {
		head=head.next;
		head.prev=null;
		}
		}
	
	void deleteEnd()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.prev.next=null;
		temp.prev=null;
		}
	}
	
	
	void deleteByPos()
	{
		
		System.out.println("Enter pos");
		int pos=sc.nextInt();
		Node temp=head;
		
		
		if(pos==0)
		{
			head=head.next;
			head.prev=null;
		}
		else
			{
				
				for(int i=0;i<pos;i++)
			
				{
					temp=temp.next;
				}
				temp.prev.next=temp.next;
				if(temp.next!=null)
					temp.next.prev=temp.prev;
			}
		
	}
	
	
	void deleteMid()
	{
		System.out.println("Enter key");
		int key=sc.nextInt();
		Node temp=head;
		
		if(head.data==key)
		{
			head=head.next;
		}
		else 
			try{
				{while(temp.data!=key)
			{
				temp=temp.next;
				
			}
			temp.prev.next=temp.next;
			if(temp.next!=null)
				temp.next.prev=temp.prev;
				}
		}catch(Exception e)
		{
			System.out.println("Key not found");
		}
		
	}
	
	
	public static void main(String args[])
	{
		DoubleLL l1=new DoubleLL();
		
		l1.create();
	//	//l1.insertB();
		//l1.insertEnd();
		//l1.insertMid();
		//l1.insertByPos();
		//l1.deleteB();
	//	l1.deleteEnd();
		//l1.deleteMid();
		l1.deleteByPos();
		l1.display();
		
	}
}

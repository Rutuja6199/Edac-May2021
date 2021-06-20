import java.util.*;
public class Tree {
	Node root;
	
	Tree()
	{
		root=null;
	}
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	Node create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		int d=sc.nextInt();
		Node n=new Node(d);
		
		if(d==-1)
			{return null;}
		System.out.println("enter left child of "+n.data);
		n.left=create();
		System.out.println("enter right child of "+n.data);
		n.right=create();
		
		return n;
	}

	static void inorder(Node root)
	{
		if(root==null)
			return ;
		
		inorder(root.left);
		System.out.print(root.data+"-->");
		inorder(root.right);
		
	}
	
	static void preorder(Node root)
	{
		if(root==null)
			return ;
		System.out.print(root.data+"-->");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	static void postorder(Node root)
	{
		if(root==null)
			return ;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+"-->");
		
	}
	
	
	
	public static void main(String[] args) {
		Tree t1=new Tree();
		Node root=t1.create();
		t1.inorder(root);System.out.println();
		t1.preorder(root);System.out.println();
		t1.postorder(root);System.out.println();
	}

}

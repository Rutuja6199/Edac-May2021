import java.util.*;





class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int d)
	{
		data=d;
		left=null;
		right=null;
	}
	}
public class BST {
	Node root;
	BST()
	{
		root=null;
	}
	
	void create()
	{
		
		
	}

	Node insert(Node root,int d)
	{
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		if(d<=root.data)
		{
			if(root.left==null)
			{
				root.left=new Node(d);
				return root;
			}
			insert(root.left,d);
		}
		if(d>=root.data)
		{
			if(root.right==null)
			{
				root.right=new Node(d);
				return root;
			}
			insert(root.right,d);
		}
		return root;
	}
	
	Node search(Node root,int key)
	{	if(root==null)
	{
		System.out.println("Key not found");
		return null;
	}
		
		if(key==root.data)
		{
			System.out.println("key found");
			return root;
		}
		if(key<root.data)
		{
			search(root.left,key);
		}
		if(key>root.data)
		{
			search(root.right,key);
		}
		return root;
	}
	void inorder(Node root)
	{
		if(root==null)
			return ;
		
		inorder(root.left);
		System.out.print(root.data+"-->");
		inorder(root.right);
		
	}
	public static void main(String[] args) {
		
		BST b=new BST();
	//b.create();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of nodes");
	int num=sc.nextInt();
	Node root=null;
	System.out.println("Enter data");
	for(int i=0;i<num;i++)
	{
	int d=sc.nextInt();
	 root=b.insert(root,d);
	}
	b.inorder(root);
	System.out.println("enter key");
	int key=sc.nextInt();
	b.search(root, key);
		
	}

}

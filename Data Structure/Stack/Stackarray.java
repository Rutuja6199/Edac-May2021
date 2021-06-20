



public class Stackarray {
	int arr[];
	int cap;
	int top=-1;
	
	Stackarray(int size)
	{
		arr=new int [size];
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
	
	public void push(int data)
	{
		if(isfull())
		{
			System.out.println("Stack is full..can't push no");
		}
		arr[++top]=data;
	}
	
	public int pop()
	{
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		//System.out.println("pop element is :"+arr[top]);
		return arr[top--];
		
	}
	public static void main(String[] args) {
		Stackarray s=new Stackarray(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		for(int i: s.arr)
		{System.out.println(i);}
		
		s.pop();
		s.pop();
		s.pop();
		s.push(130);
		s.push(230);
		s.push(340);
		
		for(int i: s.arr)
		{System.out.println(i);}
		
		
	}

}

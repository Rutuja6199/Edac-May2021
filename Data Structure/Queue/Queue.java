
public class Queue {
	private int size;
	private int Q[];
	private int front,rear,n;
	
	public Queue(int s)
	{
		size=s;
		Q=new int[s];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull()
	{
		return (rear==size-1);
	}
	
	public boolean isEmpty()
	{
		return (rear==-1);
	}
	
	public void enqueue(int data)
	{
		if(isFull());
		Q[++rear]=data;
		n++;
	}
	
	public int dequeue()
	{
		if(isEmpty());
		n--;
		int t= Q[++front];
		return t;
	}
	
	public int count()
	{
		return n;
	}
	
	 void display()
	{
		for(int i:Q)
			System.out.println(i);
	}
	public static void main(String[] args) {
		Queue q1=new Queue(6);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		//q1.display();
		System.out.println(q1.count());
		System.out.println(q1.dequeue()+" is deleted");
	    System.out.println(q1.dequeue()+" is deleted");
	//	q1.display();
		
		
		

	}

}

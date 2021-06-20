
public class CircularQueue {
	private int size;
	private int Q[];
	private int front,rear,n;
	
	public CircularQueue(int s)
	{
		size=s;
		Q=new int[s];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull()
	{
		return ((rear+1)%size==front);
	}
	
	public boolean isEmpty()
	{
		return (rear==-1 && front==-1);
	}
	
	public void enqueue(int data)
	{
		if(isFull())
			System.out.println("Queue is full");
		else if(rear==-1 && front==-1)
		{
			rear=front=0;
			Q[rear]=data;
			n++;
		}
		else {
		rear=(rear+1)%size;
		Q[rear]=data;
		n++;}
	}
	
	public int dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is empty");
		else if(front==rear)
		{
			n--;
			int t= Q[front];
			
			front=rear=-1;
			return t;
			
		}
		else {
			int t= Q[front];
			
		n--;
		front=(front+1)%size;
		return t;}
		
		return 0;
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
		CircularQueue q1=new CircularQueue(6);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);
		
		q1.display();
		System.out.println(q1.count());
		System.out.println(q1.dequeue()+" is deleted");
	   System.out.println(q1.dequeue()+" is deleted");

		
	   q1.enqueue(1140);
		q1.enqueue(5640);
		q1.display();

	}

}

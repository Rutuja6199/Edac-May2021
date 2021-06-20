package EclipsePractice;


/*class A
{
	public static void write(){
		
		System.out.println(1);
		
		
	}
}*/

class B
{	public String t="a";
	public B()
	{
		System.out.println(2);
		
	}
	int i=10;
}

/*class C extends B
{
	public static void write()
	{
		System.out.println(3);
		
	}
	int i=20;
}*/

public class Snippet extends B {
	public Snippet() {System.out.println(5);}
	 void write()
	{	t="b";
		System.out.println(this.t+super.t);
		
	}
	public static void main(String args[])
	{
		new Snippet().write();
		//B c= new C();
		//System.out.println(c.i);
		////c.write();
	}

}

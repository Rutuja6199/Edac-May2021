/*Q1.Create two classes named Mammals and MarineAnimals.
Create another class named BlueWhale which inherits both the
above classes. Now, create a function in each of these classes
which prints "I am mammal", "I am a marine animal" and "I
belong to both the categories: Mammals as well as Marine
Animals" respectively. Now, create an object for each of the
above class and try calling
1 - function of Mammals by the object of Mammal
2 - function of MarineAnimal by the object of MarineAnimal
3 - function of BlueWhale by the object of BlueWhale
4 - function of each of its parent by the object of BlueWhale*/
package EclipsePractice;

interface Mammals
{
	public void mammals();


}

interface MarineAnimals
{
	public void marineanimals();
	
}

class Bluewhale implements Mammals, MarineAnimals
{
	public void mammals()
	{
		System.out.println("I am mammal");
	}
	public void marineanimals()
	{
		System.out.println("I am marine animal");
	}
	public void blue()
	{
		System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
	}
}


public class Inheritance {
	public static void main(String args[])
	{
		Mammals bl=new Bluewhale();
		bl.mammals();
		MarineAnimals bl2=new Bluewhale();
		bl2.marineanimals();
		Bluewhale bl3=new Bluewhale();
		bl3.blue();
	}
	
}

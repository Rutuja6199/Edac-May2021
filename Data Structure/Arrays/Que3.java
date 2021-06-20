/*int Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5*/
public class Que3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			int temp=a[a.length-1];
		
			for(int j=a.length-1;j>0;j--)
				a[j]=a[j-1];
			a[0]=temp;
			for(int k=0;k<a.length;k++)
				System.out.print(a[k]);
			System.out.println();
		}
	}

}

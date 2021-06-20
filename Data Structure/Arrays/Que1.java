/*1. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
Output: 30,25,40,32,31,35*/
public class Que1 {

	public static void main(String[] args) {
		int arr[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50,60};
		int ar1[]=new int[10];
		for(int i=3,j=0;i<=8;i++,j++)
		{
			System.out.println(ar1[j]=arr[i]);
		}
		
		

}
}
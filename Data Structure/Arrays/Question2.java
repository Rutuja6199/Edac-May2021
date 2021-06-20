
public class Question2 {

	public static void main(String[] args) {
		int a[]= {5,6,8,4,6,2,8,6,10};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
					if(a[i]<min)
					min=a[i];
					if(a[i]>max)
						max=a[i];
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}

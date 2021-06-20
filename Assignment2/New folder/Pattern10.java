class Pattern10
{
	public static void main(String args[])
	{	char alpha=64;
		for(int i=5;i>=1;i--)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(" "+(char)(alpha+j));
				
			}
			
			System.out.println();
		}
	}
}
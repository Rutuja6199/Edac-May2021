class Pattern11
{
	public static void main(String args[])
	{	
		for(int i=1; i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}
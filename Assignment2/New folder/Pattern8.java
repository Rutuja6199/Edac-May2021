class Pattern8
{
	public static void main(String args[])
	{	
		for(int i=5; i>=1;i--)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(" "+j);
				
			}
			
			System.out.println();
		}
	}
}
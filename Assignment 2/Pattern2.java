class Pattern2
{
	public static void main(String args[])
	{	char alpha=64;
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) (alpha+j));
			}
			System.out.println();
		}
	}
}
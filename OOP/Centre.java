package EclipsePractice;
import java.util.*;

public class Centre {
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		centredata c[]=new centredata[5];
		centredata c1=new centredata();
		for(int i=0;i<5;i++)
		{
			c[i].setdata(sc.nextLine());
			//centredata.setdata();
		}
	}

}


class centredata 
{
	int CentreId;
	String CentreName;
	String CentreLocation;
	String CentreAddress;
	String CentreCoordinator;
	
	 void setdata(centredata a[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the CentreID ");
	int CentreId = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the CentreName ");
	String CentreName = sc.nextLine();
	
	System.out.println("Enter the CentreLocation ");
	String CentreLocation = sc.nextLine();
	
	
	System.out.println("Enter the CentreAddress ");
	String CentreAddress = sc.nextLine();
	
	System.out.println("Enter the CentreCoordinator ");
	String CentreCoordinator = sc.nextLine();
	
	}
	
	void getdata()
	{
		System.out.println("Centre ID : "+CentreId);
		System.out.println("Centre CentreName : "+CentreName);
		System.out.println("Centre CentreLocation : "+CentreLocation);
		System.out.println("Centre CentreAddress : "+CentreAddress);
		System.out.println("Centre CentreCoordinator : "+CentreCoordinator);
	}
}
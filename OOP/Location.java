package EclipsePractice;

import java.util.Scanner;
public class Location {
	double CentreId;
	String CentreName;
	String CentreLocation;
	String CentreAddress;
	String CentreCoordinator;

     public Location(double CentreId, String CentreName,String CentreLocation,String CentreAddress,String CentreCoordinator) {
              this.CentreId = CentreId;
              this.CentreName = CentreName;
              this.CentreLocation = CentreLocation;
              this.CentreAddress = CentreAddress;
              this.CentreCoordinator = CentreCoordinator;
              
              
              
     }
     
     public void DisplayDetails() {
    
 		
    	 System.out.println(" CentreId " +CentreId);
    	 System.out.println(" CentreName " +CentreName);
    	 System.out.println(" CentreLocation " +CentreLocation);
    	 System.out.println(" CentreAddress " +CentreAddress);
    	 System.out.println(" CentreCoordinator " +CentreCoordinator);
    	 
    	 
     }

	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String arr[] = new String[] {"Bangalore" ,"Pune","Mumbai","Hyderabad","Chennai"};
		 int j = 0;
	 		while(j < arr.length) {
	 			System.out.println(arr[j]);
	 			j++;
	 		}
	 		
	 		System.out.println("Enter the CentreLocation ");
			String Location = sc.nextLine();
		
		System.out.println("Enter the CentreID ");
		double ID = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the CentreName ");
		String Name = sc.nextLine();
		
		
		System.out.println("Enter the CentreAddress ");
		String Address = sc.nextLine();
		
		System.out.println("Enter the CentreCoordinator ");
		String Coordinator = sc.nextLine();
		
		

		Location c = new Location(ID,Name,Location,Address,Coordinator );
		 c.DisplayDetails();
		 sc.close();
		
		
		
	}
	}
class IOClass{
 static String getString(String question){
 		System.out.println(question);
 		return System.console().readLine();
 }

 static double getDouble(String question){
 		System.out.println(question);
 		String answer = System.console().readLine();
 		return Double.parseDouble(answer);
 		//return Double.parseDouble(getString(question));
 	}

 	static boolean getBoolean(String question){
 		System.out.println(question);
 		String answer = System.console().readLine();
 		//return Boolean.parseBoolean(answer);
 		/*return answer.equals("Y"); //checks for true or false.*/
 		if(answer.equals("Y"))
 			return true;
 		else
 			return false;
 	}	//== does not work for Strings(Reference types)...
}
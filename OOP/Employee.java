package EclipsePractice;

import java.time.LocalDate;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Emp e[] = new Emp[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter name :");
			String name = sc.nextLine();
			System.out.println("Enter salary:");
			int sal = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter date:");
			
			String date = sc.nextLine();
			e[i] = new Emp(name, sal, date);
		}
		int c = 1;
		for (Emp ee : e) {
			System.out.println(
					"Employee " + c + " == name: " + ee.name + "Salary: " + ee.salary + "Date of joining: " + ee.dt);
			c++;
		}
	}

}

class Emp {
	String name;
	int salary;
	String dt;

	Emp(String name, int salary, String dt) {
		this.name = name;
		this.salary = salary;
		this.dt = dt;
	}
}
package Assign20;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	private  String employeeList;
	
	@Override
	public String toString() {
		return "EmployeeList [employeeList=" + employeeList + "]";
	}

	public EmployeeList(String employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeeList> list=new ArrayList<EmployeeList>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three employee name");
		for(int i=0;i<=3;i++) {
			list.add(new EmployeeList(sc.nextLine()));
		}
		System.out.println("Print Employee name in araay list");
		for(EmployeeList emp:list) {
			System.out.println(emp);
		}
		
	}

}

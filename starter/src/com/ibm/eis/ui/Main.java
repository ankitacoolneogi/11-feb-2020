package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.DaoClass;
import com.ibm.eis.servive.EmployeeImplementation;

public class Main {

	public static void main(String[] args) {
		int option =1 , choice=0;
		Scanner sc = new Scanner(System.in);
		Employee emp= new Employee();
		EmployeeImplementation imply = new EmployeeImplementation();
		DaoClass dao = new DaoClass();
		
		while(option == 1) {
			System.out.println("1..Enter employee..\n2..Find Insuarance Scheme..\n3..Display employee..");
			System.out.print("Enter your choice:: ");
			choice= sc.nextInt();
			switch(choice) {
			case 1:imply.get_employee(dao);
					   break;
			case 2: imply.find_scheme(emp);
					break;
			case 3: System.out.println("The employee records are:: " + imply.display_emp(dao));
					break;
			default: System.out.println("Entered wrong choice...");
					break;
			}
			
			
			System.out.println("Want to continue with processing...??  press 1 to continue..");
			option=sc.nextInt();
		}
		
	}
}

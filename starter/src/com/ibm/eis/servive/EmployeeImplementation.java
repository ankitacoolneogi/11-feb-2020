package com.ibm.eis.servive;

import java.util.List;
import java.util.Scanner;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.DaoClass;

public class EmployeeImplementation implements EmployeeServive {
	
	
	Employee emp = new Employee();
	DaoClass dao = new DaoClass();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void claim_insuarance(Employee emp) {
		
		
		if(emp.getSalary() >5000 && emp.getSalary() <20000 && emp.getDesignation()=="System Associate")
			emp.setIns_scheme('C');
		else if(emp.getSalary() >= 20000 && emp.getSalary() <40000 && emp.getDesignation() == "Programmer")
			emp.setIns_scheme('B');
		else if(emp.getSalary() >= 40000 && emp.getDesignation()=="Manager")
			emp.setIns_scheme('A');
		else
			emp.setIns_scheme('X');
		
	}

	@Override
	public void get_employee(DaoClass d) {
		Employee emplo ; 
		int more = 1;
		while(more==1)
		{
			emplo = new Employee();
			System.out.println("Enter name of employee::  ");
			emplo.setName(sc.nextLine());
			emplo.setName(sc.nextLine());
			System.out.println("Enter designation::\n\t\t1...Manager\n\t\t2...Programmer\n\t\t3...System Associate\n\t\t4...Clerk\n\t\t\tEnter choice :: ");
			more=sc.nextInt();
			switch(more) {
			case 1: emplo.setDesignation("Manager");
					break;
			case 2: emplo.setDesignation("Programmer");
					break;
			case 3: emplo.setDesignation("System Associate");
					break;
			case 4: emplo.setDesignation("Clerk");
					break;
			default: System.out.println("Wrong input...\nDesignation set to clerk...");
					emplo.setDesignation("Clerk");
					break;
			}
			System.out.println("Enter salary of employee :: ");
			validateSalary(emplo);
			System.out.println("Enter employee id: ");
			emplo.setId(sc.nextInt());
			d.storeIntoList(emplo);
			//System.out.println(emplo);
			System.out.println("Want to enter more employees??...press 1 to continue..");
			more=sc.nextInt();
			
		}
	}
	
	void validateSalary(Employee emp) {
	 
		boolean bool = true;
		while(bool) {
			emp.setSalary(sc.nextFloat());
		
		if(emp.getDesignation() =="Manager" && emp.getSalary()<40000) {
			System.out.print("Wrong Salary..\n please enter correct salary:: ");
		}
		else if(emp.getDesignation()=="System Associate" && (emp.getSalary()<5000 || emp.getSalary()>20000) ) {
			System.out.print("Wrong Salary..\n please enter correct salary:: ");
		}
		else if(emp.getDesignation()=="Programmer" && (emp.getSalary()<20000 || emp.getSalary()>=40000)) {
			System.out.print("Wrong Salary..\n please enter correct salary:: ");
		}
		else if(emp.getDesignation()=="Clerk" && emp.getSalary()>=5000) {
			System.out.print("Wrong Salary..\n please enter correct salary:: ");
			
		}
		else bool=false;
			
		}	
	}

	@Override
	public List <Employee> display_emp(DaoClass d) {
		return d.display_emp1();

	}
	
	public void find_scheme(Employee emp) {
		claim_insuarance(emp);
		System.out.println("The sceheme is:: " + emp.getIns_scheme());
	}

	
}

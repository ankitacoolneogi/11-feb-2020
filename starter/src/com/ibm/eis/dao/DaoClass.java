package com.ibm.eis.dao;

import java.util.ArrayList;
import java.util.List;
import com.ibm.eis.bean.Employee;


public class DaoClass {
	
	private static List<Employee> emp1= new ArrayList<>();
	
	public void storeIntoList(Employee emp) {
	
		emp1.add(emp);
		
	}
	
	public List<Employee>display_emp1(){
		return emp1;
		
		
	}
	
}

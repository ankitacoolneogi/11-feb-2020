package com.ibm.eis.servive;

import java.util.List;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.DaoClass;

public interface EmployeeServive {
	
	public void claim_insuarance(Employee emp);
	public void get_employee(DaoClass d);
	public List<Employee> display_emp(DaoClass d);
}

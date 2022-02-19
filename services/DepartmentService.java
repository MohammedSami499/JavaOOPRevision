package services;

import models.Employee;

public interface DepartmentService {

	public void addEmployee(Employee emp);
	
	public void removeEmployee(int idx);
}

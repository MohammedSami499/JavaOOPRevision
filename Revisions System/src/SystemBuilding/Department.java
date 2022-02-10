package SystemBuilding;

import java.util.ArrayList;

public class Department {

	private int dno;
	private String dname;
	ArrayList<Employee> empList;
	
	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
		empList = new ArrayList<Employee>();
	}
	
	public Department() {
		super();
	}

	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	
	public void removeEmployee(int idx) {
		empList.remove(idx);
	}
	
	public int printDataSize() {
		return empList.size();
	}
	
	public void displayAllEmployeesBasicDetails() {
		for(int i=0 ; i<empList.size() ; i++) {
			System.out.println(" Name : "+empList.get(i).getName() + ", Address : "+empList.get(i).getAddress() + ", SSN : "+empList.get(i).getSSN() + ", gender : "+empList.get(i).getGender());
		}
	}
	
	public void displayEmployeesAllData() {
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i) instanceof SalariedEmployee) {
				((SalariedEmployee)empList.get(i)).displayAllDetails();
			}
			if(empList.get(i) instanceof HourlyEmployee) {
				((HourlyEmployee)empList.get(i)).displayAllDetails();
			}
			if(empList.get(i) instanceof CommissionEmployee) {
				((CommissionEmployee)empList.get(i)).displayAllDetails();
			}
			if(empList.get(i) instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee)empList.get(i)).displayAllDetails();
			}
			
		}
	}
	
	
	
	
	
	
}

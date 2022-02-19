package models;

import java.util.ArrayList;


public class Department {

	private int dno;
	private String dname;
	ArrayList<models.Employee> empList;
	
	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
		empList = new ArrayList<models.Employee>();
	}
	
	
	
	public ArrayList<models.Employee> getEmpList() {
		return empList;
	}

	public void addEmpToList(models.Employee emp) {
		empList.add(emp);
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
	
	
}

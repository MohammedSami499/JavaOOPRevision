package models;

import models.Employee;
import models.Gender;

public class SalariedEmployee extends Employee  {

	private double salary;
	private double bonus;
	private double deduction;
	
	
	public SalariedEmployee(String name, int ssn, String address, Gender gender , double salary , double bonus, double deduction) {
		super(name, ssn, address, gender);
		this.salary = salary;
		this.bonus = bonus;
		this.deduction = deduction;
	}

	public SalariedEmployee() {
		super();
	}



	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}


}

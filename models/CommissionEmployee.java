package models;

import models.Employee;
import models.Gender;

public class CommissionEmployee extends Employee {

	private double gross_sale;
	private double commission_rate;
	

	public CommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CommissionEmployee(String name, int ssn, String address, Gender gender , double gross_sale , double commission_rate) {
		super(name, ssn, address, gender);
		this.commission_rate = commission_rate;
		this.gross_sale = gross_sale;
		
	}

	public double getGross_sale() {
		return gross_sale;
	}


	public double getCommission_rate() {
		return commission_rate;
	}


	public void setGross_sale(double gross_sale) {
		this.gross_sale = gross_sale;
	}

	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}
	
}

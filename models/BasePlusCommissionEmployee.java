package models;

import models.Gender;

public class BasePlusCommissionEmployee extends CommissionEmployee {

private double base;
	
	public BasePlusCommissionEmployee() {
		super();
	}

	public BasePlusCommissionEmployee(String name, int ssn, String address, Gender gender, double gross_sale,
			double commission_rate , double base) {
		super(name, ssn, address, gender, gross_sale, commission_rate);

		this.base = base;
		
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}
	
}

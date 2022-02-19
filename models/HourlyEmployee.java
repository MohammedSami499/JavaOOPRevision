package models;

import models.Employee;
import models.Gender;

public class HourlyEmployee extends Employee {

	private double hour_rate;
	private int number_of_hours;

	
	
	public HourlyEmployee(String name, int ssn, String address, Gender gender , double hour_rate , int number_of_hours) {
		super(name, ssn, address, gender);
		this.hour_rate = hour_rate;
		this.number_of_hours = number_of_hours;
	}

	public HourlyEmployee() {
		super();
	}


	public double getHour_rate() {
		return hour_rate;
	}

	public double getNumber_of_hours() {
		return number_of_hours;
	}

	public void setHour_rate(double hour_rate) {
		this.hour_rate = hour_rate;
	}



	public void setNumber_of_hours(int number_of_hours) {
		this.number_of_hours = number_of_hours;
	}

	
}

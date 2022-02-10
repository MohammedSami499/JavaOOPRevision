package SystemBuilding;

public class HourlyEmployee extends Employee implements Displayable {

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




	public void setHour_rate(double hour_rate) {
		this.hour_rate = hour_rate;
	}



	public void setNumber_of_hours(int number_of_hours) {
		this.number_of_hours = number_of_hours;
	}



	@Override
	public double earning() {
		
		return (hour_rate * number_of_hours);
	}



	@Override
	public void displayAllDetails() {
		super.toString();
		toString();
		
	}

	

	@Override
	public String toString() {
		return " + HourlyEmployee [hour_rate=" + hour_rate + ", number_of_hours=" + number_of_hours + "]";
	}



	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " +earning());
		
	}

	
}

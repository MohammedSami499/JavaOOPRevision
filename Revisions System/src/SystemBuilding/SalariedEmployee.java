package SystemBuilding;

public class SalariedEmployee extends Employee implements Displayable {

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



	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}


	@Override
	public double earning() {
		return ((salary + bonus) - deduction);
	}


	@Override
	public void displayAllDetails() {
		System.out.print(super.toString());
		System.out.println(toString());
	}


	
	

	@Override
	public String toString() {
		return " + SalariedEmployee [salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + "]";
	}

	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " +earning());
		
	}

}

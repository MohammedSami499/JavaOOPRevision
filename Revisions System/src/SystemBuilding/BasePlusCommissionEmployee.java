package SystemBuilding;

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
	
	@Override
	public double earning() {
		return (super.earning() * base);
	}
	
	@Override
	public void displayAllDetails() {
		super.displayAllDetails();;
		toString();
		
	}


	@Override
	public String toString() {
		return " + BasePlusCommissionEmployee [base=" + base + "]";
	}

	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " + earning());
	}
	
	
}

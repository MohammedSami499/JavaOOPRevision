package SystemBuilding;

public class CommissionEmployee extends Employee implements Displayable{

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



	public void setGross_sale(double gross_sale) {
		this.gross_sale = gross_sale;
	}



	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}



	@Override
	public double earning() {
		return (gross_sale * commission_rate);
	}



	@Override
	public void displayAllDetails() {
		super.toString();
		toString();
		
	}



	@Override
	public String toString() {
		return " + CommissionEmployee [gross_sale=" + gross_sale + ", commission_rate=" + commission_rate + "]";
	}



	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " +earning());
		
	}
	
	
}

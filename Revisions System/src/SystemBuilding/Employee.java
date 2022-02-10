package SystemBuilding;


enum Gender {MALE , FEMALE};

public abstract class Employee {
	
	private String name;
	private int ssn;
	private String address;
	private Gender gender;
	
	
	public Employee() {
	}
	
	
	public Employee(String name, int ssn, String address, Gender gender) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSSN() {
		return ssn;
	}
	public void setSSN(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public abstract double earning();


	@Override
	public String toString() {
		return "Employee data =>  name=" + name + ", ssn=" + ssn + ", address=" + address + ", gender=" + gender + " " ;
	}
	
	
	
}

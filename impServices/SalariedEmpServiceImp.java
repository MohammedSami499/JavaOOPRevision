package impServices;


import models.SalariedEmployee;
import services.DisplayCommonData;
import services.EmployeeService;
import services.SalariedEmpService;

public class SalariedEmpServiceImp  implements EmployeeService , DisplayCommonData   {

	SalariedEmployee salEmp;
	public SalariedEmpServiceImp(SalariedEmployee emp) {
		salEmp = emp;
	}
	
	@Override
	public double earning() {
		return ((salEmp.getSalary() + salEmp.getBonus()) - salEmp.getDeduction());
	}

	@Override
	public void displayAllDetails() {
		System.out.println(printPropereties());
		
	}

	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " +earning());
		
	}

	@Override
	public String printPropereties() {
		return " + SalariedEmployee [ name: "+ salEmp.getName() + ", Address: " +salEmp.getAddress()+ ", SSN: "+ salEmp.getSSN()+ ", Gender: "+salEmp.getGender()
				+ "	+ salary=" + salEmp.getSalary() + ", bonus=" + salEmp.getBonus() + ", deduction=" + salEmp.getDeduction() + "]";
		
	}

	



	
}

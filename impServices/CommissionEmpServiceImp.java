package impServices;

import models.CommissionEmployee;
import models.Employee;
import services.Displayable;
import services.EmployeeService;

public class CommissionEmpServiceImp implements EmployeeService, Displayable {

	CommissionEmployee comm;
	
	public CommissionEmpServiceImp(CommissionEmployee com) {
		comm = com;
	}
	
	@Override
	public double earning() {
		return comm.getCommission_rate() * comm.getGross_sale(); 
	}

	@Override
	public String printPropereties() {
		return " + CommissionEmployee  [  name: "+ comm.getName() + ", Address: " +comm.getAddress()+", SSN:"+ comm.getSSN()+ ", Gender: "+comm.getGender()+
				", gross_sale=" + comm.getGross_sale() + ", commission_rate=" + comm.getCommission_rate() + "]";
	}

	@Override
	public void displayAllDetails() {
		System.out.println(printPropereties());
		
	}

	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " + earning());
		
	}

}

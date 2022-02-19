package impServices;

import models.BasePlusCommissionEmployee;
import models.CommissionEmployee;
import services.Displayable;
import services.EmployeeService;

public class BasePlusCommEmpServiceImp implements EmployeeService , Displayable {

	
	BasePlusCommissionEmployee baseCom;
	
	public BasePlusCommEmpServiceImp(BasePlusCommissionEmployee com) {
		baseCom = com;
	}

	@Override
	public double earning() {
		return baseCom.getCommission_rate() * baseCom.getGross_sale() * baseCom.getBase();
	}

	@Override
	public String printPropereties() {
		return " + CommissionEmployee  [  name: "+ baseCom.getName() + ", Address: " +baseCom.getAddress()+", SSN: "+ baseCom.getSSN()+ ", Gender: "+baseCom.getGender()+
				", gross_sale: " +baseCom.getGross_sale() + ", commission_rate: " + baseCom.getCommission_rate() + ", base: "+ baseCom.getBase()+ " ]";
	}

	@Override
	public void displayEarning() {
		System.out.println(" Earnings = " + earning());
		
	}
	
	@Override
	public void displayAllDetails() {
		System.out.println(printPropereties());
		
	}
	
}

package impServices;

import models.HourlyEmployee;
import services.DisplayCommonData;
import services.EmployeeService;
import services.HourlyEmpService;
import services.SalariedEmpService;

public class HourlyEmpServiceImp  implements EmployeeService , DisplayCommonData {
	
	HourlyEmployee hourlyEmp ;
	
	public HourlyEmpServiceImp(HourlyEmployee hourEmp) {
		hourlyEmp = hourEmp;
	}
	
	

	@Override
	public String printPropereties() {
		return " HourlyEmployee [  name: "+ hourlyEmp.getName() + ", Address: " +hourlyEmp.getAddress()+", SSN:"+ hourlyEmp.getSSN()+ ", Gender: "+hourlyEmp.getGender()
		+ ", hour_rate=" + hourlyEmp.getHour_rate() + ", number_of_hours=" + hourlyEmp.getNumber_of_hours() + "]";

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
	public double earning() {
		return (hourlyEmp.getHour_rate() * hourlyEmp.getNumber_of_hours());
	}




}

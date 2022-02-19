package impServices;


import models.*;
import services.DepartmentService;

public class DepartmentServiceImp extends Department implements DepartmentService {

	
	Department dp ;
	
	public DepartmentServiceImp() {
		 dp = new  Department(1 , "Mixed Employee dept");
	}

	@Override
	public void addEmployee(models.Employee emp) {
		dp.addEmpToList(emp);
		
	}

	@Override
	public void removeEmployee(int idx) {
		dp.getEmpList().remove(idx);
		
	}

	@Override
	public int printDataSize() {
		return dp.getEmpList().size();
	}

	@Override
	public void displayAllEmployeesBasicDetails() {
		for(int i=0 ; i<dp.getEmpList().size() ; i++) {
			System.out.println(" Name : "+dp.getEmpList().get(i).getName() + ", Address : "+dp.getEmpList().get(i).getAddress() + ", SSN : "+dp.getEmpList().get(i).getSSN() + ", gender : "+dp.getEmpList().get(i).getGender());
		}
		
	}
	
	

	@Override
	public void displayEmployeesAllData() {
		for(int i=0; i<dp.getEmpList().size(); i++) {
			if(dp.getEmpList().get(i) instanceof models.SalariedEmployee) {
				
				SalariedEmpServiceImp salEmp = new SalariedEmpServiceImp ( (SalariedEmployee) dp.getEmpList().get(i));
				salEmp.printPropereties();
				
			}
			if(dp.getEmpList().get(i) instanceof HourlyEmployee) {
				
				HourlyEmpServiceImp houtEmp = new HourlyEmpServiceImp(((HourlyEmployee)dp.getEmpList().get(i)));
				houtEmp.printPropereties();
			}
			if(dp.getEmpList().get(i) instanceof CommissionEmployee) {
				
				CommissionEmpServiceImp com = new CommissionEmpServiceImp((CommissionEmployee)dp.getEmpList().get(i));
				com.printPropereties();
			}
			if(dp.getEmpList().get(i) instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommEmpServiceImp baseCom = new BasePlusCommEmpServiceImp((BasePlusCommissionEmployee)dp.getEmpList().get(i));
				baseCom.printPropereties();
			}
			
		}
		
	}
	


}

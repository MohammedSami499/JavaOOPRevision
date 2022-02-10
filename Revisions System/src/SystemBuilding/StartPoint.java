package SystemBuilding;

public class StartPoint {

	
	public static void main(String[] args) {
		
		Department dp = new Department(1 , "Mixed Employee dept");
		
		
		SalariedEmployee salEmp = new SalariedEmployee("Mohammed Sami", 1541, "Sadat city", Gender.MALE, 15000, 1500, 200);
		dp.addEmployee(salEmp);
		
		HourlyEmployee hourEmp = new HourlyEmployee("Mohamed Nagaty", 1548, "EL Bagour" , Gender.MALE , 1200, 45);
		dp.addEmployee(hourEmp);
		
		CommissionEmployee commEmp = new CommissionEmployee("Gameel" , 1547, "Ashmun", Gender.MALE, 1578, 15);
		dp.addEmployee(commEmp);
		
		BasePlusCommissionEmployee baseComEmp = new BasePlusCommissionEmployee("Nouer", 1224, "Menof", Gender.MALE, 1540, 14, 500);
		dp.addEmployee(baseComEmp);
		
		
		//System.out.println(dp.printDataSize());
		//dp.displayAllEmployeesBasicDetails();
		
		
	}
}

package model;

public class EmpBusinessLogic {

	public EmpBusinessLogic() {
		
	}
	
	public double calculateYearlySalary(Employee employee) {
		
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
		
	}
	
	public double calculateAppraisal(Employee employee) {
		
		double appraisal = 0;
		
		if (employee.getMonthlySalary() < 10000) {
			
			appraisal = 500;
			
		} else {
			
			appraisal =1000;
			
		}
		
		return appraisal;
		
	}
	
	public boolean isRetirementAge(Employee employee) {
		
		boolean retirementAge;
		
		if (employee.getAge() > 65) {
			
			retirementAge = true;
			
		} else {
			
			retirementAge = false;
			
		}
		
		return retirementAge;
		
	}

}

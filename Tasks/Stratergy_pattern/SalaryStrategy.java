package Stratergy_pattern;

public class SalaryStrategy implements PayrollStrategy {

	private String employeeId;
	private String employeeName;
	
	public SalaryStrategy(String employeeId, String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid to Employee - " + employeeName + " whose Employee Id is " + employeeId);
	}

}
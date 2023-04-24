package Stratergy_pattern;

public class EmployeePayroll {

	public static void main(String[] args) {
		EmpPayroll emp = new EmpPayroll();
		
		Item item1 = new Item("BasicPay",21000);
		Item item2 = new Item("HRA",8000);
		Item item3 = new Item("TA",10000);
		Item item4 = new Item("Bonus",2000);
		
		
		emp.addItem(item1);
		emp.addItem(item2);
		emp.addItem(item3);
		emp.addItem(item4);
		emp.pay(new SalaryStrategy("1000", "Test Employee One"));
		
		
	}

}

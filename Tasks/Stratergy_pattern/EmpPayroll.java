package Stratergy_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmpPayroll {

	//List of items
	List<Item> items;
	
	public EmpPayroll(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PayrollStrategy payment){
		int amount = calculateTotal();
		payment.pay(amount);
	}
}

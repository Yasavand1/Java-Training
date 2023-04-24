package Stratergy_pattern;

public class Item {

	private String salarydescription;
	private int allotedamount;
	
	public Item(String component, int sal){
		this.salarydescription=component;
		this.allotedamount=sal;
	}

	public int getPrice() {
		return allotedamount;
	}
	
}

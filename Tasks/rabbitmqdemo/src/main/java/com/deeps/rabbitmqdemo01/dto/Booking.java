package com.deeps.rabbitmqdemo01.dto;

public class Booking {
	String pickuplocation;
	String droplocation;
	int noofpeople;

	public Booking() {
		super();
	}

	public Booking(String pickuplocation, String droplocation, int noofpeople) {
		super();
		this.pickuplocation = pickuplocation;
		this.droplocation = droplocation;
		this.noofpeople = noofpeople;
	}

	public String getPickuplocation() {
		return pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public String getDroplocation() {
		return droplocation;
	}

	public void setDroplocation(String droplocation) {
		this.droplocation = droplocation;
	}

	public int getNoofpeople() {
		return noofpeople;
	}

	public void setNoofpeople(int noofpeople) {
		this.noofpeople = noofpeople;
	}

	public void setBookingId(String string) {

	}

	@Override
	public String toString() {
		return "Booking [pickuplocation=" + pickuplocation + ", droplocation=" + droplocation + ", noofpeople="
				+ noofpeople + "]";
	}
	
	

}

package com.deeps.rabbitmqdemo01.dto;

public class BookStatus {
	private Booking booking;
	private String status;
	private String message;
	
	public BookStatus() {
		super();
	}
	public BookStatus(Booking booking, String status, String message) {
		super();
		this.booking = booking;
		this.status = status;
		this.message = message;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "BookStatus [booking=" + booking + ", status=" + status + ", message=" + message + "]";
	}
	
	

}

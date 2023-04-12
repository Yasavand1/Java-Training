package com.extra;


import java.text.*;
import java.util.Locale;

public class NumberFormatExample {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Set Maximum FractionDigits(3)");
		nf.setMaximumFractionDigits(3);
		System.out.println(nf.format(123.4));
		System.out.println(nf.format(123.4567));
		System.out.println("Set Minimum FractionDigits(3)");
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(123.4));
		System.out.println(nf.format(123.4567));
		System.out.println("Set Maximum Integer Digits(3)");
		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(1.234));
		System.out.println(nf.format(123456.789));
		System.out.println("Set Minimum Integer Digits(3)");
		nf.setMinimumIntegerDigits(3);
		System.out.println(nf.format(1.234));
		System.out.println(nf.format(123456.789));
		
		
		double d=123456.789;
		Locale INDIA=new Locale("pa","IN");
		NumberFormat nfr=NumberFormat.getCurrencyInstance(INDIA);
		System.out.println("INDIA notation is :"+nfr.format(d));

		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK notation is :"+nf1.format(d));
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US notation is :"+nf2.format(d));
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("ITALY notation is :"+nf3.format(d));
	}
}

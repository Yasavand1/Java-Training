package com.extra;


import java.text.*;
import java.util.*;

public class DateFormatDemo {
	public static void main(String args[]) {
		DateFormat UK = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat US = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ITALY = DateFormat.getDateInstance(0, Locale.ITALY);
		System.out.println("UK style is :" + UK.format(new Date()));
		System.out.println("US style is :" + US.format(new Date()));
		System.out.println("ITALY style is :" + ITALY.format(new Date()));
		
		
		System.out.println("full form is :"+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("long form is :"+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("medium form is :"+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("short form is :"+DateFormat.getDateInstance(3).format(new Date()));
	}
}

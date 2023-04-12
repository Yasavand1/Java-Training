package com.dal.controller;

import java.io.IOException;

public interface EmployeeInterface {
	public void addEmployee() throws IOException;
	public void viewEmployee() ;
	public void serialize() throws IOException;
	public void deserialize() throws IOException;
	public void sortByEid();
	public void sortByEname();
}

package com.note.Web.based.note.taking.system.pojo;

public class Pojo {

	private String employeeName;
	private int employeeId;
	private int employeeAge;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public Pojo(String employeeName, int employeeId, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
	}
	
	
	
	
}

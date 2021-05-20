package com.libraryManagementSystem.LibraryManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	
	@Id
	int empid;
	String empname;
	int empage;
	int empsalary;
	String empemail;
	String empcontactnumber;
	String department;
	String shift;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmpcontactnumber() {
		return empcontactnumber;
	}
	public void setEmpcontactnumber(String empcontactnumber) {
		this.empcontactnumber = empcontactnumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
}

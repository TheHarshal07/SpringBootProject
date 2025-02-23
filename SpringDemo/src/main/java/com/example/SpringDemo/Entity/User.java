package com.example.SpringDemo.Entity;


import jakarta.persistence.Entity;



import jakarta.persistence.*;


@Entity
@Table(name = "users") 
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID", nullable=false)
	private Long empId;
	
	@Column(name="EMP_NAME", nullable=false)
	private String empName;
	
	@Column(name="EMP_MOB", nullable=false)
	private String empMobile;
	
	@Column(name="EMP_SAL", nullable=false)
	private double empSalary;
	
	
	public User() {}
	
	
	public User(Long empId, String empName, String empMobile, double empSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
		this.empSalary = empSalary;
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpMobile() {
		return empMobile;
	}


	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
}

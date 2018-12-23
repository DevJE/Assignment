package test.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = -2688902380218030007L;
	//Field
	private int eId;
	private String eName;
	private String dept;
	private int salary;
	private double bonusPoint;
	
	public Employee() {}

	public Employee(int eId, String eName, String dept, int salary, double bonusPoint) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dept = dept;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.eId + " " + this.eName + " " + this.dept + " " + this.salary + " " + this.bonusPoint;
	}

}

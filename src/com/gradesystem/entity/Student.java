package com.gradesystem.entity;

import com.gradesystem.entity.Controller;
public class Student {

	String name;
	int rollNo;
	int m1; int m2; int m3;
	double perc;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollNo, int m1, int m2, int m3, double perc) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.perc = perc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", perc="
				+ perc + "]";
	}

	
}

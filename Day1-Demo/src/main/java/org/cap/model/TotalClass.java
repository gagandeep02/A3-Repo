package org.cap.model;

public class TotalClass
{
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	int rollno;
	String firstName;
	public TotalClass(int rollno, String firstName) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
	}
	public TotalClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

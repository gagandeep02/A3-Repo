package org.cap.model;

public class BasicClass 
{
	String lastName;
	int idNo;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	
	public BasicClass(String lastName, int idNo) {
		super();
		this.lastName = lastName;
		this.idNo = idNo;
	}
	
	
}

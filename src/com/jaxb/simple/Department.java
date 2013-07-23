package com.jaxb.simple;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Department")
@XmlAccessorType(XmlAccessType.FIELD)
//Tells Jaxb to read xml elements,attributes from members and not from getters/setters
public class Department 
{
	// XmLElementWrapper generates a wrapper element around XML representation i.e <customerList> <customer/> .... </customerlist> 
	@XmlElementWrapper(name="customerList")
	 // XmlElement sets the name of the entities
	@XmlElement(name="cutomer")
	private ArrayList<CustomerClass> list = new ArrayList<CustomerClass>();
	@XmlElement(name="department-name")
	private String name;
	
	@XmlElementWrapper(name="wholesaler-list")
	@XmlElement(name="wholesaler")
	private ArrayList<Wholesaler> wList = new ArrayList<Wholesaler>();
	
	public ArrayList<Wholesaler> getwList() {
		return wList;
	}
	public void setwList(ArrayList<Wholesaler> wList) {
		this.wList = wList;
	}
	public ArrayList<CustomerClass> getList() {
		return list;
	}
	public void setList(ArrayList<CustomerClass> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString()
	{
		return "name - "+name+" list - "+list;
	}
	
	
	
	
}

package com.jaxb.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "name", "age"})
//Optional -If you want you can define the order in which the fields are written
@XmlAccessorType(XmlAccessType.FIELD)
//Tells Jaxb to read xml elements,attributes from member fields and not from getters/setters
public class CustomerClass 
{
	@XmlElement
	private String name;
	@XmlElement
	private int age;
	@XmlAttribute
	private int id;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String toString()
	{
		return "id:"+id+";name - "+name+", age - "+age;
	}
	
	
}

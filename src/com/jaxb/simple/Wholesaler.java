package com.jaxb.simple;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"name","panId","contactInfo"})
public class Wholesaler 
{
	@XmlElement
	private String name;
	@XmlElement
	private String panId;
	
	//XmlElements is used for choice elements of a xml schema i.e. one of the elements defined within the choice may occur
	@XmlElements(value={@XmlElement(name="address",type=Address.class), @XmlElement(name="phone-num",type=PhoneNumber.class),@XmlElement(name="note",type=String.class)})
	private Object contactInfo;
	@XmlAttribute
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	public Object getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(Object contactInfo) {
		this.contactInfo = contactInfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

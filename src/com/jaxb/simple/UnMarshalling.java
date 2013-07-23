package com.jaxb.simple;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException 
	{
		File file = new File("C:\\abc.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Department d = (Department)unmarshaller.unmarshal(file);
		System.out.println(d);
	}

}

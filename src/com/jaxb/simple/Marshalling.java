package com.jaxb.simple;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException 
	{
		
		File file = new File("C:\\abc.xml");
		ArrayList<CustomerClass> list = new ArrayList<CustomerClass>();
		ArrayList<Wholesaler> wlist = new ArrayList<Wholesaler>();
		
		
		for(int i=0; i<10; i++)
		{
			CustomerClass customer =  new CustomerClass();
			customer.setAge(i+20);
			customer.setId(i+10);
			customer.setName("A"+i);
			list.add(customer);		
		}
		
		for (int j=101;j<105;j++)
		{
			Wholesaler w = new Wholesaler();
			w.setId(j);
			w.setName("WW"+j);
			w.setPanId("PAN- "+j);
			
			if(j==101)
				w.setContactInfo("abc.example.com");
			else if(j%2 ==0)
			{
				Address a = new Address();
				a.setCity("Cty"+j);
				a.setStreet("Strt"+j);
				w.setContactInfo(a);
			}
			else
			{
				PhoneNumber p = new PhoneNumber();
				p.setNumber(new Random().nextInt()+ " - ");
				p.setType("type "+j);
				w.setContactInfo(p);
			}
			
			wlist.add(w);
		}
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
		Marshaller jaxbMarshaller =  jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Department d = new Department();
		d.setList(list);
		d.setName("DepartmentTest");
		d.setwList(wlist);
		jaxbMarshaller.marshal(d, file);
		//jaxbMarshaller.marshal(d, System.out);
		
		System.out.println("done..");
		
		
		
		
	}

}

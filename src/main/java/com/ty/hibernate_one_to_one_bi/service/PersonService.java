package com.ty.hibernate_one_to_one_bi.service;

import java.util.List;

import com.ty.hibernate_one_to_one_bi.dao.PersonDao;
import com.ty.hibernate_one_to_one_bi.dto.Adhaar;
import com.ty.hibernate_one_to_one_bi.dto.Person;

public class PersonService {
	PersonDao dao = new PersonDao();
//	Insert Method
	
	public void insertPersonAdhaar(Person person,Adhaar adhaar) {
		dao.insertPersonAdhaar(person, adhaar);
	}
//	Display Method
	
	public List<Person> displayPersons(){
		return dao.displayPersons();
	}
}

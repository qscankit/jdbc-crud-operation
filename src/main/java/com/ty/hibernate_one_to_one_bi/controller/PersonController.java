package com.ty.hibernate_one_to_one_bi.controller;

import com.ty.hibernate_one_to_one_bi.dto.Adhaar;
import com.ty.hibernate_one_to_one_bi.dto.Person;
import com.ty.hibernate_one_to_one_bi.service.PersonService;

public class PersonController {
	public static void main(String[] args) {
		
		Adhaar adhaar = new Adhaar();
		
		adhaar.setAdhaarNumber(123456777);
		adhaar.setPhoneNumber(0645422434);
		
		Person person = new Person();
		
		person.setName("Vishali");
		person.setGender("Female");
		person.setAddress("G-Block");
		person.setAdhaar(adhaar);
		
		PersonService personService = new PersonService();
		
		personService.insertPersonAdhaar(person, adhaar);
	}
}

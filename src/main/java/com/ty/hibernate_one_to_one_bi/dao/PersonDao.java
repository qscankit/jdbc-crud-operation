package com.ty.hibernate_one_to_one_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hibernate_one_to_one_bi.dto.Adhaar;
import com.ty.hibernate_one_to_one_bi.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ankit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	Insert Method
	
	public void insertPersonAdhaar(Person person,Adhaar adhaar) {
		entityTransaction.begin();
		entityManager.persist(person);
//		entityManager.persist(adhaar);
		entityTransaction.commit();
	}
	
//	Display Method
	
	public List<Person> displayPersons(){
		String select = "SELECT p FROM Person p";
		return entityManager.createQuery(select,Person.class).getResultList();
	}
}

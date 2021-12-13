package com.ibm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.junit.jupiter.api.Test;

import com.ibm.entity.Person;

public class TestPeople{
	
	@Test
	public void testSavePerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Person p1 =new Person();
		p1.setName("Riya");
		p1.setAge(22);
		
		
		mgr.persist(p1);
		txn.commit();
	
		mgr.close();
		emf.close();

	}
	
	@Test
	public void testGetPerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		Person p = mgr.find(Person.class, 2);
		System.out.println(p.getName() + "\t" + p.getAge());
		
		mgr.close();
		emf.close();
		}
	
}
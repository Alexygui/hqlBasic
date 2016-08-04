package com.aaa.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aaa.util.HibernateSessionFactory;

public class CustomerTest {
	private Session aSession = null;
	
	@Before
	public  void setUp() throws Exception {
		aSession = HibernateSessionFactory.getSession();
	}
	
	@After
	public void tearDown() throws Exception {
		HibernateSessionFactory.closeSession();
	}

	@Test
	public void test() {
		String hqlString = " from Customer ";
		
		Query aQuery = aSession.createQuery(hqlString);
		List<Customer> customers = aQuery.list();
		
		for(Customer aCustomer : customers) {
			System.out.println("name: " + aCustomer.getName());
		}
	}

}

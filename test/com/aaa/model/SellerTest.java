package com.aaa.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aaa.util.HibernateSessionFactory;

public class SellerTest {
	private Session session = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSession();
	}
	
	@After
	public void tearDown() throws Exception {
		session.close();
	}
	
	@Test
	public void testSeller() {
		String hqlString = "from Seller";

		Query query = session.createQuery(hqlString);

		List<Seller> sellers = query.list();
		for(Seller seller : sellers) {
			System.out.println(seller);
		}
	}

}

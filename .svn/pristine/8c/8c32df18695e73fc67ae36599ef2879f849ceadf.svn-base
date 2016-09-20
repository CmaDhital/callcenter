package com.cubic.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConnectionTest {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		try{
			emf=Persistence.createEntityManagerFactory("OracleUnit");
			em=emf.createEntityManager();
			System.out.println("Connected");
		}finally
		{
			if(em!=null)
				em.close();
			if(emf!=null)
				emf.close();
		}

	
	}

}

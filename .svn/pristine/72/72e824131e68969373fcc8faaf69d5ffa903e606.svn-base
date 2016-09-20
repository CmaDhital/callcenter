package com.cubic.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cubic.entity.CustomerEntity;

public class CustomerDaoImpl implements CustomerDao {

	public CustomerEntity createCustomer(CustomerEntity entity) {
		
			EntityManagerFactory emFactory = null;
			EntityManager em = null;
			EntityTransaction et = null;

			try {
				emFactory = Persistence.createEntityManagerFactory("OracleUnit");
				em = emFactory.createEntityManager();
				et = em.getTransaction();
				et.begin();

				em.persist(entity);
				et.commit();

			} catch (Exception e) {
				e.printStackTrace();
				et.setRollbackOnly();
			} finally {
				if (em != null) {
					em.close();
				}
				if (emFactory != null) {
					emFactory.close();
				}
			}
			return entity;
		
		
	}

	public CustomerEntity getProduct(final long pk) {
		
			EntityManagerFactory emFactory = null;
			EntityManager em = null;
			EntityTransaction et = null;
			CustomerEntity entity = new CustomerEntity();

			try {
				emFactory = Persistence.createEntityManagerFactory("OracleUnit");
				em = emFactory.createEntityManager();
				entity = em.find(CustomerEntity.class, pk);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (em != null) {
					em.close();
				}
				if (emFactory != null) {
					emFactory.close();
				}
			}
			return entity;
		}

	}

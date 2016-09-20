package com.cubic.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cubic.common.CustomerVO;
import com.cubic.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long>{
	
/*		
	
	@Query("select p from PersonEntity p where UPPER(p.firstName) like UPPER(?1) OR UPPER(p.lastName) like UPPER(?2)")
	List<CustomerEntity> searchCustomer(final String firstName, final String lastName);
	*/
	

}
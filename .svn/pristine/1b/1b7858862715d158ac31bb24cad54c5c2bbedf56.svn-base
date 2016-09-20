package com.cubic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cubic.common.CustomerVO;
import com.cubic.entity.CustomerEntity;
import com.cubic.mapper.CustomerMapper;
import com.cubic.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper mapper;
	
	@Autowired
	private CustomerRepository repo;

	public CustomerVO registerCustomer(CustomerVO vo) {
		
			if (vo == null || vo.getPk() == null) {
				throw new IllegalArgumentException("Invalid parameters to save product");
			}

			CustomerEntity entity = mapper.mapToCustomerEntity(vo);

			CustomerEntity result = repo.save(entity);		
			
			CustomerVO resultVO = mapper.mapToCustomerVO(result);
			
			return resultVO;
		}

		
	
		
	
		public List<CustomerVO> searchCustomer(String firstName, String lastName) {
			/*	String fName = StringUtils.isEmpty(firstName)?"":firstName;
			String lName = StringUtils.isEmpty(firstName)?"":lastName;
			fName += "%";
			lName += "%";
			List<CustomerEntity> entities = repo.searchCustomer(fName, lName);
			return mapper.mapToCustomerVO(entities);*/
			
			return new ArrayList<CustomerVO>();
		}
	}


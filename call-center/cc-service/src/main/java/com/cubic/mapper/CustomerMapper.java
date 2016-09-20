package com.cubic.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cubic.common.CustomerVO;
import com.cubic.entity.CustomerEntity;

@Component
public class CustomerMapper {
	
	public CustomerEntity mapToCustomerEntity(CustomerVO vo) {
		CustomerEntity result = null;
		if (vo != null) {
			result = new CustomerEntity();
			result.setFirstName(vo.getFirstName());
			result.setLastName(vo.getLastName());
			result.setPk(vo.getPk());
		}

		return result;
	}
	
	public CustomerVO mapToCustomerVO(CustomerEntity entity) {
		CustomerVO result = null;
		if (entity != null) {
			result = new CustomerVO();
			result.setFirstName(entity.getFirstName());
			result.setLastName(entity.getLastName());
			result.setPk(entity.getPk());
		}

		return result;
	}
	
	public List<CustomerVO> mapToCustomerVO(List<CustomerEntity> entities) {
		List<CustomerVO> results = new ArrayList<CustomerVO>();
		if (entities != null && !entities.isEmpty()) {
			
			for(CustomerEntity entity : entities){
				results.add(mapToCustomerVO(entity));
			}
			
		}
		
			

		return results;
	}
	
	
	public List<CustomerVO> mapObjectArrToCustomerVO(List<Object[]> entities) {
		List<CustomerVO> results = new ArrayList<CustomerVO>();
		
		for(Object[] obj : entities){
			Long pk = ((BigDecimal) obj[0]).longValue();
			results.add(new CustomerVO((pk), ((String) obj[1]), ((String) obj[2]), ((String) obj[3]), ((String) obj[4]), ((String) obj[5])));
		
		}
		return results;}
}

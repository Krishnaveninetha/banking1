package com.cg.oracle.banking.service;

import com.cg.oracle.banking.dao.CustomerUseDao;
import com.cg.oracle.banking.dao.CustomerUseDaoImpl;
import com.cj.oracle.banking.dto.CustomerDetails;

public class CustomerUseServiceImpl implements CustomerUseService {
	CustomerUseDao cud=new CustomerUseDaoImpl();
	CustomerDetails cd=new CustomerDetails();
	
	public CustomerDetails register(CustomerDetails cd) {
		 cd=cud.register(cd);
		 return cd;
		
		
	}

	public CustomerDetails login(CustomerDetails cd) {
		// TODO Auto-generated method stub
		
		cd=cud.login(cd);
		
		return cd;
	}
	
	
	
	

}

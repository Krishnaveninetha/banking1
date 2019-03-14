package com.cg.oracle.banking.dao;

import com.cj.oracle.banking.dto.CustomerDetails;

public interface CustomerUseDao {
	
CustomerDetails register(CustomerDetails cd);
CustomerDetails login(CustomerDetails cd);

}

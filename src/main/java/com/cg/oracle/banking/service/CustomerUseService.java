package com.cg.oracle.banking.service;

import com.cj.oracle.banking.dto.CustomerDetails;

public interface CustomerUseService {
	
	CustomerDetails register(CustomerDetails cd);
	CustomerDetails login(CustomerDetails cd);

}

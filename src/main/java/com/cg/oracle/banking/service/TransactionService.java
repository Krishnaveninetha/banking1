package com.cg.oracle.banking.service;

import com.cj.oracle.banking.dto.CustomerDetails;

public interface TransactionService {
	
	
	
				void withdraw(CustomerDetails cd);
				void deposit(CustomerDetails cd);
				CustomerDetails showBalance(CustomerDetails cd);
				long fundTransafer(CustomerDetails cd);
				
				

}

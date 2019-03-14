package com.cg.oracle.banking.ui;

import java.util.Random;
import java.util.Scanner;

import com.cg.oracle.banking.dao.TransactionDaoImpl;
import com.cg.oracle.banking.service.CustomerUseService;
import com.cg.oracle.banking.service.CustomerUseServiceImpl;
import com.cg.oracle.banking.service.TransactionService;
import com.cg.oracle.banking.service.TransactionServiceImpl;
import com.cj.oracle.banking.dto.CustomerDetails;

/**
 * Hello world!
 *
 */
public class App 
{	
static 	CustomerDetails cd=new CustomerDetails();
static CustomerUseService cus=new CustomerUseServiceImpl();
static TransactionService ts=new TransactionServiceImpl();

    public static void main( String[] args )
    {
    	  	int i=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter  your choice\n  1.CustomerUse\n 2.Transaction");
        int choice =s.nextInt();
      
        switch(choice)
        {
        case 1:
        		
        		
        		System.out.println("enter option: 1.register\n  2.login");
        		switch(s.nextInt())
        		{
        		case 1: System.out.println("enter details to register in bank");
        				System.out.println("enter first name: ");
        				cd.setFirstName(s.next());
        				System.out.println("enter last name: ");
        				cd.setLastName(s.next());
        				System.out.println("enter emailId: ");
        				cd.setEmailId(s.next());
        				System.out.println("enter password:");
        				cd.setPassword(s.next());
        				System.out.println("enter aadhaarnNo: ");
        				cd.setAadharNo(s.next());
        				System.out.println("enter pancardNo: ");
        				cd.setPancardNo(s.next());
//        				System.out.println("enter address: ");
//        				cd.setAddress(s.next());
        				System.out.println("enter mobileNo: ");
        				cd.setMobileNo(s.nextLong());
        				cd.setBalance(0);
        				CustomerDetails cd1=new CustomerDetails();
        				cd1=cus.register(cd);
        				if(cd1!=null) {
        				cd.setAccountNo(cd.getAccountNo());
        				System.out.println("Generated account no: "+cd.getAccountNo());
        				}
        				else 
        					System.out.println("error in registration");
        				break;
        				
        		case 2:
        			System.out.println("enter password and loginId ");
        			cd.setAccountNo(s.nextInt());
        			cd.setPassword(s.next());
        		cd=cus.login(cd);
        			if(cd!=null)
        			{
        				System.out.println("login successful");
        			}
        			else
        				System.out.println("error in login ");
        			break;
        			
        		}
        case 2: 
        			
        	    
        }
    }
}

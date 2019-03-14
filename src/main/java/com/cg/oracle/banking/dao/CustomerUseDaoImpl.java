package com.cg.oracle.banking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cj.oracle.banking.dto.CustomerDetails;

public class CustomerUseDaoImpl implements CustomerUseDao{
	CustomerDetails cd=new CustomerDetails();
	int q=0;
	public CustomerDetails register(CustomerDetails cd) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAPGDB1", "oracle123");
			PreparedStatement pst=con.prepareStatement("insert into customer_details1(account_no,first_name,last_name,email_id, password,pancard_no,aadhar_no,mobile_no,balance) values(new_seq.nextval,?,?,?,?,?,?,?,?)");
			
			
			pst.setString(1, cd.getFirstName());
			pst.setString(2, cd.getLastName());
			pst.setString(3, cd.getEmailId());
			pst.setString(4, cd.getPassword());
			pst.setString(5, cd.getPancardNo());
			pst.setString(6, cd.getAadharNo());
		//	pst.setString(7, cd.getAddress());
			pst.setLong(7, cd.getMobileNo());
			pst.setLong(8, cd.getBalance());
			
			q=pst.executeUpdate();
			
			 PreparedStatement pst1=con.prepareStatement("select * from customer_details1 where aadhar_no=?");
			 pst1.setString(1, cd.getAadharNo());
			 ResultSet rs=pst1.executeQuery();
			 if(rs.next())
			 {
				 cd.setAccountNo(rs.getInt(1));
			 }
			
			
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(q==0)
			return null;
		else
		return cd;
		
			
		
		
	}

	public CustomerDetails login(CustomerDetails cd) {
		// TODO Auto-generated method stub
		return cd;
	}
	
	
	

}

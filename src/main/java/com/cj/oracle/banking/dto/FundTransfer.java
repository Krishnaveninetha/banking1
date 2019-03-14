package com.cj.oracle.banking.dto;

public class FundTransfer {
	
	private long transactionId;
	private long fromAccountNo;
	private long toAccountNo;
	private long amountTransfered;
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public long getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(long toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public long getAmountTransfered() {
		return amountTransfered;
	}
	public void setAmountTransfered(long amountTransfered) {
		this.amountTransfered = amountTransfered;
	}
	

}

package com.bv.model;

public class CurrentAccount extends Account {

	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int acc_no, String holder_name, double balance) {
		super(acc_no, holder_name, balance);
		// TODO Auto-generated constructor stub
	}

	
	
	
}

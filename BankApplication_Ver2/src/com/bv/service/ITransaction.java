package com.bv.service;

import com.exception.InsufficientBalanceException;

//import com.exception.InsufficientBalance;

public interface ITransaction {

	public void withdraw(double amount) throws InsufficientBalanceException;
	public void deposite(double amount);
	
}

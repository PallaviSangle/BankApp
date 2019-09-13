package com.bv.serviceimpl;

import com.bv.model.SalaryAccount;
import com.bv.service.ITransaction;
//import com.exception.InsufficientBalance;
import com.exception.InsufficientBalanceException;

public class SalaryAccountService implements ITransaction {
	SalaryAccount salaryAccount;
	

	public SalaryAccountService(SalaryAccount salaryAccount) {
		super();
		this.salaryAccount = salaryAccount;
	}
	

	@Override
	public void withdraw(double amount) {
		System.out.println("Before withdraw:" + salaryAccount.getBalance());
		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		} else if (salaryAccount.getBalance() < amount) {
			//System.out.println("insufficient fund balance");
try {
	throw new InsufficientBalanceException("insufficient fund balance");
} catch (InsufficientBalanceException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
			
			
		} else {
			salaryAccount.setBalance(salaryAccount.getBalance() - amount);
			System.out.println(amount + "" + "Amount deducted");
			System.out.println("Total_balance:" + salaryAccount.getBalance());
		}

	}

	@Override
	public void deposite(double amount) {

		System.out.println("Before Depoite: " + salaryAccount.getBalance());
		salaryAccount.setBalance(salaryAccount.getBalance() + amount);
		System.out.println(amount + " Rs. Amount credited");
		System.out.println("Total balance after deposite " + salaryAccount.getBalance());

		
		
	}

}

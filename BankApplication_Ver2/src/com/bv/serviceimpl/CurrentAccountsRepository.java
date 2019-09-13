package com.bv.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.database.DatabaseClass;
import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;

public class CurrentAccountsRepository {

	private Map<Integer,CurrentAccount> currentAccounts=DatabaseClass.getCurrentAccount();
	
	public CurrentAccountsRepository()
	{
		currentAccounts.put(101,new CurrentAccount(101,"AAck",5000));
		currentAccounts.put(101,new CurrentAccount(102,"BHai",4000));
	}
	
	public List<CurrentAccount> getAllAccounts()
	{
		return new ArrayList<CurrentAccount>(currentAccounts.values());
	}
	
	
	public CurrentAccount getAccount(int acc_no)
	{
		return currentAccounts.get(acc_no);
	}
	
	public CurrentAccount addAccount(CurrentAccount currentAccount) {
		currentAccount.setAcc_no(currentAccount.getAcc_no()+0);
		currentAccounts.put(currentAccount.getAcc_no(),currentAccount);
		return currentAccount;
	}
	
	public Account updateAccount(CurrentAccount currentAccount)
	{
		if(currentAccount.getHolder_name().isEmpty())
		{
			return null;
		}
		currentAccounts.put(currentAccount.getAcc_no(), currentAccount);
		return currentAccount;
			
	}
	public Account removeAccount(int acc_no)
	{
		return currentAccounts.remove(acc_no);
	}
	
}

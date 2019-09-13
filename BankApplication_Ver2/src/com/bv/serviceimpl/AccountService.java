package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;
import com.bv.model.Account;


public class AccountService {

	SavingAccountService savingAccountService;
	CurrentAccountService currentAccountService;
	CurrentAccountsRepository currentAccountsRepository;
	SavingAccountsRepository savingAccountsRepository;
	
	Account account;
	
	public AccountService() {
		super();
		this.account = account;
		currentAccountsRepository = new CurrentAccountsRepository();
		savingAccountsRepository = new SavingAccountsRepository();
	
/*	if(account instanceof SavingAccount)
	{
		savingAccountService= new SavingAccountService(account);
	}
	else
	{
		currentAccountService = new CurrentAccountService(account);
	}
	
	*/
	}
	 
	
	//AccountService accountService;
    public void chooseAccounttype()
   {
	Scanner sc = null;
	int choice;
	boolean flag = true;
	while (flag) {
		System.out.println("Select below account type:");
		System.out.println("1.CurrentAccount"+"\n"+ "2.SavingAccount" +"\n"+"3.Exit");
		sc = new Scanner(System.in);
		choice = sc.nextInt();
		
	    switch(choice)
	    {
	    case 1:System.out.println("Enter the account number:");
	           currentAccountService=new CurrentAccountService(currentAccountsRepository.getAccount(sc.nextInt()));
	    	   currentAccountService.chooseOperation();
	            break;
	         
	    case 2:System.out.println("Enter the account number:");
	           savingAccountService=new SavingAccountService(savingAccountsRepository.getAccount(sc.nextInt()));
	    	   savingAccountService.chooseOperation();
	            break;
	            
	     default: System.out.println("Enter valid type");       
	             break;
	    }
	    
	
	}
}
}

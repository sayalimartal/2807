package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.CurrentAccount;
import com.moneymoney.framework.account.pojo.Customer;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance, odLimit);
	}

	@Override
	public String withdraw(double amount) {    //Overriding withdraw method for current account
		
		String result;
		if (((getAccountBalance() + getOdLimit()) - amount) >= 0) {
			this.setAccountBalance(getAccountBalance() - amount);
			int twoThousand=(int) (amount/2000);
			amount=amount%2000;
			int fiveHundred=(int) (amount/500);
			amount=amount%500;
			int hundred=(int) (amount/100);
			amount=amount%100;
			
			result= twoThousand+" two thousand notes "+"\n"+fiveHundred+" five hundred notes"+"\n"+hundred+" hundred notes";
		}
		else
			result="Withdrawal Failed";
		return result;	
	}
}

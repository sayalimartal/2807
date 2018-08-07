package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount {

	public MMSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
	}

	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
	}

	@Override
	public String withdraw(double amount) {
		String result;
		if (((getAccountBalance() - amount) >= 0) {
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

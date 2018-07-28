//Entry point to test application
public class EntryPoint {
	public static void main(String[] args) {
		
		BankFactory mmBankFactory=new MMBankFactory();
		
		//Open a new salaried savings account
		SavingAcc mmSavingAcc=mmBankFactory.getNewSavingAcc(100, "Sayali", 5000, true); 
		//Open a new current account
		CurrentAcc mmCurrentAcc=mmBankFactory.getNewCurrentAcc(101, "Siddhi", 3000, 10000);
		
		mmSavingAcc.withdraw(500);
		System.out.println(mmSavingAcc);
		mmSavingAcc.withdraw(5000);
		System.out.println(mmSavingAcc);
		
		mmCurrentAcc.withdraw(5000);
		System.out.println(mmCurrentAcc);
		mmCurrentAcc.deposit(5000);
		System.out.println(mmCurrentAcc);
		mmCurrentAcc.withdraw(20000);
		System.out.println(mmCurrentAcc);
		
		//Open a new non-salaried savings account
		SavingAcc mmSavingAcc2=mmBankFactory.getNewSavingAcc(102, "Sayali", 5000, false); 
		mmSavingAcc2.withdraw(4500);
		System.out.println(mmSavingAcc2);
	}
}

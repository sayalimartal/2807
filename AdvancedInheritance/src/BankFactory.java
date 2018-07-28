//Class with factory abstract methods
public abstract class BankFactory {
	//abstract methods to be implemented in child classes
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm,float accBal,boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm,float accBal,float creditLimit);
}

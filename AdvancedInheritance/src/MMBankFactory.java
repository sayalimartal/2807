//Class MMBankFactory with necessary factory methods implemented
public class MMBankFactory extends BankFactory {
	
	//Implementing getNewSavingAcc() of BankFactory class
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm,float accBal,boolean isSalaried) {
		MMSavingAcc savingAcc=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return savingAcc;
	}
	
	//Implementing getNewCurrentAcc() of BankFactory class
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm,float accBal,float creditLimit) {
		MMCurrentAcc currentAcc=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return currentAcc;
	}	
}

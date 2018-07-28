//Class MMSavingAcc representing bank specific Savings Account
public class MMSavingAcc extends SavingAcc {
	//Parameterized constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	@Override
	public void withdraw(float amount) {  //Overriding withdraw method 
		if(isSalaried()) {  //No minimum balance if salaried
			if((getAccBal()-amount)>=0)
				setAccBal(getAccBal()-amount);
			else
				System.out.println("Withdrawal failed");
		}
		else {
			if((getAccBal()-amount)>=getMinbal())
				setAccBal(getAccBal()-amount);
			else
				System.out.println("Withdrawal failed");	
		}
	}

	@Override
	public String toString() {
		return "MMSavingAcc ["+super.toString() + ", getAccNo()= " + getAccNo() + ", getAccNm()= " + getAccNm() + ", getAccBal()= " + getAccBal() + "]";
	}
}
//Class MMCurrentAcc representing bank specific Current Account
public class MMCurrentAcc extends CurrentAcc {
	//Parameterized constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	public void withdraw(float amount) {   //Overriding withdraw method 
		if(((getAccBal()+getCreditLimit())-amount)>=0)
			setAccBal(getAccBal()-amount);
		else
			System.out.println("Withdrawal failed");
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [" + super.toString() + ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ "]";
	}	
}

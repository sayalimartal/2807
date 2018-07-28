//Class CurrentAcc representing a Current Account
public abstract class CurrentAcc extends BankAcc {
	//Instance member
	private final float creditLimit;
	//Parameterized constructor		
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	
	abstract public void withdraw(float amount); //Abstract withdraw method

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	public float getCreditLimit() { //Access creditLimit
		return creditLimit;
	}
}

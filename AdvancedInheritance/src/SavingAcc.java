//Class SavingAcc representing a Savings Account
public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=1000;
	//Parameterized constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	//Getters for instance and class members
	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}
	
	public abstract void withdraw(float amount); //Abstract withdraw method

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}	
}

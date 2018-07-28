//Class BankAcc representing a bank account
public  abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	//Parameterized constructor 
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//Getters and setters for instance members
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public abstract void withdraw(float amount); //Abstract withdraw method
	
	public void deposit(float amount) {  //Deposit amount
		this.accBal+=amount;
	}

	@Override
	public String toString() {  //Display account details
		return "BankAcc [Account number=" + accNo+ ", Account holder name=" + accNm + ", Account balance=" + accBal + "]";
	}
}

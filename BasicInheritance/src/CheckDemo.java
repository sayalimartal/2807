//Use various access modifiers 
class Check {
	private int a=3; //declare variables with various access modifiers
	public int b=10;
	protected int c=5;
	int d=15;
	
	void disp() { //display private instance member
		System.out.println(getA());
	}
	
}
public class CheckDemo {

	public static void main(String[] args) {
		
		Check check=new Check(); //Create object of class Check
		
		
		check.disp();

	}

}

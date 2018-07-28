//Display complex numbers and sum of two complex numbers
public class ComplexTest {

	public static void main(String[] args) {
		Complex C1=new Complex();
		Complex C2=new Complex();
		Complex C3=new Complex();
		
		C1.set(12, 12);
		System.out.println("First complex number is "+C1.getReal()+"+"+C1.getImaginary()+"j");
		
		C2.set(25, 11);
		System.out.println("Second complex number is "+C2.getReal()+"+"+C2.getImaginary()+"j");
		
		C3=C1.sum(C1,C2);
		System.out.println("Sum of complex numbers is "+C3.getReal()+"+"+C3.getImaginary()+"j");
	}
}

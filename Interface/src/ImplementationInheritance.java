//Implementation Inheritance
interface A {
	void disp1(); //abstract method of interface A
}

interface B extends A {
	void disp2(); //abstract method of interface B
}

class C implements B{
	public void disp1() //Implementing disp1() of interface A
	{
		System.out.println("Interface A");
	}
	public void disp2() //Implementing disp2() of interface B
	{
		System.out.println("Interface B");
	}
}

public class ImplementationInheritance {

	public static void main(String[] args) {
		
		C c=new C(); //create object of Class C
		
		//Call members of interfaces A and B
		c.disp1(); 
		c.disp2();
	}
}

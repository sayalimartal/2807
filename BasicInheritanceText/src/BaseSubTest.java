class Base1 {
	Base1(int a) {
		System.out.println("Number is "+a);
	}
}

class Sub1 extends Base1 {
	Sub1() {
		super(100);
	}
	Sub1(int a) {
		super(a);
		System.out.println("Number is "+a);
	}
	Sub1(int a,int b) {
		super(a);
		System.out.println("Numbers are "+a+" and "+b);
	}
	
}
public class BaseSubTest {

	public static void main(String[] args) {
		
		System.out.println("Using no-args constructor");
		Sub1 sub1=new Sub1();
		
		System.out.println("Using constructor with one parameter");
		Sub1 sub2=new Sub1(10);
		
		System.out.println("Using constructor with two parameters");
		Sub1 sub3=new Sub1(50,100);
    
	}
}

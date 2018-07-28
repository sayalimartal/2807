class A {
	A(){
		System.out.println("In parent class");
	}
}
class B extends A {
	B() {
		System.out.println("In child class");
	}
}
public class SingleLevelInherit {
	public static void main(String[] args) {
		B b=new B();
	}
}

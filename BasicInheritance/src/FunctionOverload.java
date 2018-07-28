class Parent{
	void display(String name) {
		System.out.println("Hello "+name+". Welcome to parent class");
	}
}
class Child extends Parent{
	void display(int i) {
		System.out.println("Child class "+i);
	}
}
public class FunctionOverload {
	public static void main(String[] args) {
		Child child=new Child();
		child.display("Sayali");
		child.display(2);
	}
}

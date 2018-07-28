class ParentClass{
	void display() {
		System.out.println("Parent class");
	}
}
class ChildClass extends ParentClass {
	void display() {
		System.out.println("Child class");
	}
}
public class FunctionOverride {
	public static void main(String[] args) {
		ParentClass parent=new ParentClass();
		ChildClass child=new ChildClass();
		parent.display();
		child.display();
	}
}


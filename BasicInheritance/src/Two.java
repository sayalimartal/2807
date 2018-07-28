//Call methods of different classes using objects
class First {
	int first=40;
	First() {  //No-args Constructor
		System.out.println("Number is "+first);
	}
	public void display() {
		System.out.println("First");
	}
}

class Second {
	int second=50;
	Second() {  //No-args Constructor
		System.out.println("Number is "+second);
	}
	public void display() {
		System.out.println("Second");
	}
}

public class Two {

	public static void main(String[] args) {
		
		First first=new First(); //Create object of class First
		first.display(); //Call display method
		
		Second second=new Second(); //Create object of class Second
		second.display(); //Call display method
	}
}

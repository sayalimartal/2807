class P {
	P(){
		System.out.println("In class P");
	}
}
class Q extends P {
	Q() {
		System.out.println("In class Q");
	}
}
class R extends Q {
	R() {
		System.out.println("In class R");
	}
}
public class MultiLevelInherit {
	public static void main(String[] args) {
		R r=new R();
	}
}

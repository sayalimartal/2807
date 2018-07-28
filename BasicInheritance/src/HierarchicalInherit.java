class M {
	M(){
		System.out.println("In class M");
	}
}
class N extends M {
	N() {
		System.out.println("In class N");
	}
}
class O extends M {
	O() {
		System.out.println("In class O");
	}
}
public class HierarchicalInherit {
	public static void main(String[] args) {
		N n=new N();
		O o=new O();
	}
}

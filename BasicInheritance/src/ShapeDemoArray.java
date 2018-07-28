//Create objects of various classes that inherit Shape class and draw those shapes
public class ShapeDemoArray {
	public static void main(String[] args) {
		
		Shape[] shape=new Shape[3]; //Create an array of Shape class objects
		//Instantiate various objects
		shape[0] =new Circle();
		shape[1] =new Polygon();
		shape[2] =new Rectangle();
		
		for(int i=0;i<3;i++)
			shape[i].draw(); //Draw each shape
	}
}


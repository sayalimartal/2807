
public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle();
		
		rectangle.setLength(10.5f);
		rectangle.setBreadth(2.9f);
		
		float length=rectangle.getLength();
		System.out.println("Length of the rectangle is "+length); 
		
		float breadth=rectangle.getBreadth();
		System.out.println("Breadth of the rectangle is "+breadth);
		
		float area=rectangle.area();
		System.out.println("Area of the rectangle is "+area);
		
		float perimeter=rectangle.perimeter();
		System.out.println("Perimeter of the rectangle is "+perimeter);
	}
}

//Shape class with draw function to be overridden
abstract class Shape {
	abstract void draw();
}
//Circle class to draw a circle
class Circle extends Shape {
	void draw() {
		System.out.println("Draw a circle");
	}		
}
//Polygon class to draw a polygon
class Polygon extends Shape {
	void draw() {
		System.out.println("Draw a polygon");
	}		
}
//Rectangle class to draw a rectangle
class Rectangle extends Shape {
	void draw() {
		System.out.println("Draw a rectangle");
	}		
}


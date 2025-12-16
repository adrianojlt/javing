package pt.adrz.samples.oo;

public class Geometry {

	public final double PI = 3.142592653;
	
	public double area(Object shape) {

		if (shape instanceof Square s) {
            return s.side * s.side;
		}
		
		if (shape instanceof Rectangle rectangle) {
            return rectangle.height * rectangle.width;
		}

		if (shape instanceof Circle circle) {
            return PI * circle.radius * circle.radius;
		}
		
		return 0;
	}
}


class Point {
	public double x;
	public double y;
}

class Circle {
	public Point center;
	public double radius;
}

class Rectangle {
	public Point topLeft;
	public double height;
	public double width;
}

class Square {
	public Point topLeft;
	public double side;
}

interface Forma {
	public double area();
}

class Quadrado implements Forma {

	public Point topLeft;
	public double side;

	@Override
	public double area() {
		return side * side;
	}
}


package assignment2;

public class Circle {
	private double radius = 1.0;
	private String color = "red";

	Circle() {
		System.out.println("Default");
	}

	Circle(double r) {
		this();
		radius = r;
		System.out.println("Parameterized constructer 1");
	}

	/*
	 * Circle(String color) { this.color = color;
	 * System.out.println("Parameterized constructer 2"); }
	 */

	Circle(double r, String c) {
		this();
		radius = r;
		color = c;
		System.out.println("Parameterized constructer 2");
	}

	public void getRadius() {
		System.out.println("The radius of the circle is: " + radius);
	}

	public void getArea() {
		double area = 3.14 * (radius * radius);
		System.out.println("The area is: " + area);
		System.out.println("The color of the circle is: " + color);
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.getArea();
		c1.getRadius();

		Circle c2 = new Circle(2);
		c2.getArea();
		c2.getRadius();

		Circle c3 = new Circle(3, "blue");
		c3.getArea();
		c3.getRadius();
	}
}

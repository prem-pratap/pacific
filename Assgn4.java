package assignment2;

public class Assgn4 {

	void area(int num) {
		int a = num * num;
		System.out.println("Area of the square: " + a);
	}

	void area(int num1, int num2) {
		int a = num1 * num2;
		System.out.println("Area of the rectangle: " + a);
	}

	void sum(int n1, int n2) {
		int s = n1 + n2;
		System.out.println("The sum of given numbers(int): " + s);
	}

	void sum(double n1, double n2) {
		double s = n1 + n2;
		System.out.println("The sum of given numbers(double): " + s);
	}

	public static void main(String[] args) {
		Assgn4 a1 = new Assgn4();
		a1.area(5);
		a1.area(3, 4);
		a1.sum(5, 6);
		a1.sum(2.5, 5.4);
	}

}

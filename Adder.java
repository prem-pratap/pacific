package assignment2;

import java.util.Scanner;

public class Adder {

	void adder() {

		double sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		double input = s.nextDouble();
		int count = 0;
		while (input != 0) {
			sum = sum + input;
			input = s.nextDouble();
			count++;
		}
		s.close();
		if (count <= 1) {
			System.out.println("Invalid number of arguments");
		}
		System.out.println("The sum is: " + sum);
	}

	public static void main(String[] args) {

		int count = args.length;
		if (count <= 1) {
			System.out.println("Invalid number of arguments");
		}
		int i = 0, sum = 0;
		while (i < count) {
			sum = sum + Integer.parseInt(args[i]);
			i++;
		}
		System.out.println("The sum is: " + sum);
		// Adder ad = new Adder();
		// ad.adder();
	}

}

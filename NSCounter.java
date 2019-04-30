package assignment2;

public class NSCounter {
	int counter;

	NSCounter() {
		System.out.println("Default");
		counter++;
		System.out.println("Value of counter: " + counter);
	}

	NSCounter(int counter) {
		System.out.println("Parameterized");
		this.counter = counter++;
		System.out.println("Value of counter: " + counter);
	}

	void funct() {

	}

}

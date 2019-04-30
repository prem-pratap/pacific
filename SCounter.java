package assignment2;

public class SCounter {
	static int counter;

	SCounter() {
		System.out.println("Default");
		counter++;
		System.out.println("Value of counter: " + counter);
	}

	SCounter(int counter) {
		System.out.println("Parameterized");
		// this.counter=counter;
		SCounter.counter = counter++;
		System.out.println("Value of counter: " + counter);
	}
	
	static{
		System.out.println("Static block invoked in SCounter in SCounter class");
	}
	
	void funct() {

	}

}

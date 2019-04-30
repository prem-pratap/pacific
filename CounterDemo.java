package assignment2;

public class CounterDemo {

	static {
		System.out.println("Static block invoked in CounterDemo in CounterDemo class");
	}

	public static void main(String[] args) {
		SCounter s1 = new SCounter();
		SCounter s2 = new SCounter();
		SCounter s3 = new SCounter();
		s1.funct();
		s2.funct();
		s3.funct();

		NSCounter ns1 = new NSCounter();
		NSCounter ns2 = new NSCounter();
		NSCounter ns3 = new NSCounter();
		ns1.funct();
		ns2.funct();
		ns3.funct();

	}

}

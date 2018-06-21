package abstracts;

public class CarWindow extends windows {

	public void open() {
		System.out.println("Opening Car Window!");
	}

	public void close() {
		System.out.println("Closing Car Window");
	}
	
	public void myMethod() {
		System.out.println("this is method only in CarWindow.");
	}

}

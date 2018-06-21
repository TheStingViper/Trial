package abstracts;

public class Rectangle extends shape {

	
	public Rectangle(float a1, float a2) {
		super(a1, a2);
	}
	
	

	public float calArea() {
		float s3;
		s3=getS1()*getS2();
		return s3;
	}

	public void dispShape(String s) {
		System.out.println("Length of Rectangle : "+this.getS1());
		System.out.println("Breadth of Rectangle : "+this.getS2());		
		System.out.println("This is a Rectangle.");
	}

}

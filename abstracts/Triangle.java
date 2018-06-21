package abstracts;

public class Triangle extends shape {

	public Triangle(float a1, float a2) {
		super(a1, a2);
	}

	public float calArea() {
		float s3;
		s3=(float) ((0.5)*getS1()*getS2());
		return s3;
	}

	public void dispShape(String s) {
		System.out.println("Base of Triangle : "+this.getS1());
		System.out.println("Height of Triangle : "+this.getS2());		
		System.out.println("This is a Triangle.");
	}

}

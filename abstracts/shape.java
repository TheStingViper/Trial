package abstracts;

public abstract class shape {
	private
	float s1,s2;

	public float getS1() {
		return s1;
	}

	public void setS1(float s1) {
		this.s1 = s1;
	}

	public float getS2() {
		return s2;
	}

	public void setS2(float s2) {
		this.s2 = s2;
	}

	public shape(float a1, float a2) {
		super();
		this.s1 = a1;
		this.s2 = a2;
	}
	
	abstract public float calArea();
	abstract public void dispShape(String s);	
}

package interf;

public class Salary implements ConvertUnits {
	private double s;
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public void convert() {
		System.out.println("Salary in RS : "+s);
		System.out.println("Salary in $ : "+(s/68.18));
	}

}

package interf;

public class Product implements ConvertUnits {
	private double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public void convert() {

		System.out.println("Product Price in RS : "+r);
		System.out.println("Product Price in $ : "+(r/68.18));
	}

}

package Inhertitance;

public class FourWheeler extends Vehical{

	boolean ac;
	boolean gear;
	String varient;
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isGear() {
		return gear;
	}
	public void setGear(boolean gear) {
		this.gear = gear;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
	
	public void drive(){
		System.out.println("Four Wheeler Drive.");
	}
}

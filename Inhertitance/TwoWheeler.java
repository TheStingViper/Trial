package Inhertitance;

public class TwoWheeler extends Vehical{

	boolean gears;
	String brand;
	boolean dicky;
	public boolean getGears() {
		return gears;
	}
	public void setGears(boolean gears) {
		this.gears = gears;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isDicky() {
		return dicky;
	}
	public void setDicky(boolean dicky) {
		this.dicky = dicky;
	}
	
	public void drive(){
		System.out.println("Two Wheeler Drive.");
	}
	public String toString() {
		return "TwoWheeler [gears=" + gears + ", brand=" + brand + ", dicky="
				+ dicky + ", regno=" + regno + ", milage=" + milage
				+ ", color=" + color + ", name=" + name + "]";
	}
	
}

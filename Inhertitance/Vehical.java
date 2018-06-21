package Inhertitance;

public class Vehical {

	int regno;
	float milage;
	String color;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public float getMilage() {
		return milage;
	}
	public void setMilage(float milage) {
		this.milage = milage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void drive(){
		System.out.println("VEHICLE DRIVE");
	}
}

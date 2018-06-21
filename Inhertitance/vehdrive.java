package Inhertitance;

public class vehdrive {

	public static void main(String[] args) {

		TwoWheeler v1 = new TwoWheeler();
		v1.setBrand("Honda");
		v1.setColor("Matte Black");
		v1.setDicky(true);
		v1.setGears(false);
		v1.setMilage(60);
		v1.setRegno(123456);
		v1.setName("DEO");
		
		FourWheeler v2 = new FourWheeler();
		v2.setAc(true);
		v2.setColor("Black");
		v2.setGear(false);
		v2.setMilage(10);
		v2.setRegno(321654);
		v2.setVarient("Hatchback");
		v2.setName("Cayman");
		
		v1.drive();
		v2.drive();
		System.out.println(v1.toString());
	}

}

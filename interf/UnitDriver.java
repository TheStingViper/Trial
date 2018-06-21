package interf;

public class UnitDriver {

	public static void main(String[] args) {
		Product c=new Product();
		c.setR(50);
		c.convert();
		
		Salary s = new Salary();
		s.setS(45000);
		s.convert();
	}

}

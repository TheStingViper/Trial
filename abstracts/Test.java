package abstracts;

public class Test {

	public static void main(String[] args) {

		CarWindow c = new CarWindow();
		c.open();
		HouseWindows h = new HouseWindows();
		h.open();

		c.close();
		h.close();

		c.disp();

		windows w;
		w = c;
		w.open();
		//(WRONG) w.myMethod();
		((CarWindow) w).myMethod();
		w = h;
		w.open();

	}

}

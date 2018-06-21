
public class bkk {

	public static void main(String[] args) {

		book b=new book();
		b.disp();
		
		book bk=new book(1,"asd","asda",5000);
		bk.disp();
		
		bk.setall();
		
		System.out.println("Changed Values \n");
		bk.disp();
	}

}

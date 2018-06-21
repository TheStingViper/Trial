
public class TestHasA {
 public static void main(String[] args) {
	Student st=new Student(100,"neeraj",91.5,99.5,90.5);
	School sch=new School(1234,"DYP",st);
	
	System.out.println("Roll : "+st.getRollno());
	System.out.println("Name : "+st.getName());
	System.out.println("MARKS");
	System.out.println("M1 : "+st.getM1());
	System.out.println("M1 : "+st.getM2());
	System.out.println("M1 : "+st.getM3());
	
	System.out.println("\nSCHOOL\n");
	System.out.println("Regno : "+sch.getRegno());
	System.out.println("School Name : "+sch.getSch_name());
	System.out.println("Student "+sch.getSob());
		
}
}


public class InherTest {

	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setName("STING");
		e.setAge(21);
		e.setDept("Comp");
		e.setAdd("Pune");
		e.setEcode(10001);
		e.setSal(50000);
		
		System.out.println("CODE : "+e.getEcode()+"\nNAME : "+e.getName()+"\nDEPARTMENT : "+ e.getDept()+"\nADDRESS : "+e.getAdd()+"\nAGE : "+e.getAge());
	}

}


public class cob {

	public static void main(String[] args) {
	
		clob p = new clob();
		clob q = new clob();
		
		p.setname("NRG");
		p.setadd("Vallabhnagar");
		p.setage(21);
		
		System.out.println("NAME : "+p.n());
		System.out.println("ADD : "+p.a());
		System.out.println("AGE : "+p.g());
		
		q.setname("VRJ");
		q.setadd("ST Nagar");
		q.setage(25);
		
		System.out.println("NAME : "+q.n());
		System.out.println("ADD : "+q.a());
		System.out.println("AGE : "+q.g());

		p.checkage(q);
	}

}

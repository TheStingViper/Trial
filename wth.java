import java.util.Scanner;


public class wth {

	public static void main(String[] args) {
	
		weight w = new weight();
		weight e = new weight();
		weight f = new weight();
		Scanner sc = new Scanner(System.in);
		int k,g;
		
		System.out.println("Enter Weight 1 : ");
		System.out.println("kg : ");
		k=sc.nextInt();
		System.out.println("gm : ");
		g=sc.nextInt();
		w.setkg(k);
		w.setg(g);
		
		System.out.println("Enter Weight 2 : ");
		System.out.println("kg : ");
		k=sc.nextInt();
		System.out.println("gm : ");
		g=sc.nextInt();
		
		e.setkg(k);
		e.setg(g);
		
		f=w.total(e);
		System.out.println("Total weight = "+f.kr()+" kg and "+f.gr()+" gram(s)");
	}

}

package abstracts;

import java.util.Scanner;

public class Sdrive {

	public static void main(String[] args) {
		shape r;
		Scanner sc = new Scanner(System.in);
		float a,b;
		System.out.println("Enter Side1 : ");
		a = sc.nextFloat();
		System.out.println("Enter Side2 : ");
		b = sc.nextFloat();
		r = new Rectangle(a, b);
		
		r.dispShape(null);
		System.out.println("Area : "+r.calArea());
		
		r = new Triangle(a, b);
		r.dispShape(null);
		System.out.println("Area : "+r.calArea());
		
	}

}

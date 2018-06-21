import java.util.Scanner;


public class book {

	private
	int bcode;
	String title;
	String author;
	int price;
	double p;
	double dis;
	Scanner sc = new Scanner(System.in);
	
	//constructor
	book(){
		System.out.println("Default Constructor");
	}
	
	//Parameterized constructor
	book(int b,String t,String a,int p){
		bcode=b; title=t; author=a; price=p;
	}
	
	//setters
	void setb(int b){bcode = b;}
	void sett(String t){title = t;}
	void seta(String a){author = a;}
	void setp(int p){price = p;}
	
	int getb(){return bcode;}
	String gett(){return title;}
	String geta(){return author;}
	int getp(){return price;}
	
	void setall(){
		System.out.println("Enter Book Code : ");
		setb(sc.nextInt());
		System.out.println("Enter Title : ");
		sett(sc.next());
		System.out.println("Enter Author : ");
		seta(sc.next());
		System.out.println("Enter Price : ");
		setp(sc.nextInt());
	}
	
	void disp(){
		System.out.println("Book Code : "+getb());
		System.out.println("Title : "+gett());
		System.out.println("Author : "+geta());
		System.out.println("Price : "+getp());
		
	}
	
	void disprice(){
		System.out.println("Discount percent : ");
		dis=sc.nextDouble();
		p=price*(dis/100);
		price=price-(int) p;
		System.out.println("New Amount to be paid : "+price);
	}
	
}

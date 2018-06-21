import java.util.Scanner;


public class clob {
	//instance variables
	String name;
	String add;
	int age;
	
	
	//setters
	void setname(String nm){
		name=nm;
	}
	void setadd(String ad){
		add=ad;
	}
	void setage(int ag){
		age=ag;
	}
	
	//getters
	String n(){return name;}
	String a(){return add;}
	int g(){return age;}
	
	//business logic(Any method other than setters and getters)
	void checkage(clob q){
		if(age>q.age){
			System.out.println(name+" is Older.");
		}
		else
			System.out.println(q.name+" is Older");
	}
	
	void disp(){
		System.out.println("Name : "+name);
		System.out.println("Address : "+add);
		System.out.println("Age : "+age);
	}
	void setall(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		setname(sc.next());
		System.out.println("Enter add : ");
		setadd(sc.next());
		System.out.println("Enter age : ");
		setage(sc.nextInt());
		}
}

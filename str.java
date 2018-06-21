import java.util.Scanner;


public class str {
	public static void main(String[] args) {
		String arr[]=new String[5];
		Scanner sd=new Scanner(System.in);
		int i;
		
		for(i=0;i<5;i++){
			System.out.println("Enter String no"+i );
			arr[i]=sd.next();
		}
		
		for(i=0;i<5;i++){
			System.out.println("Entered String : "+arr[i]);
			System.out.println("Length of String : "+arr[i].length());
		}
	}

}

import java.util.Scanner;


public class bk {

	public static void main(String[] args) {

		book br[] = new book[5];
		int n,i;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<5;i++){
			br[i]=new book();
		}
		
		System.out.println("Enter no of books : ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++){
			br[i].setall();
			br[i].disprice();
			br[i].disp();
	}
	}

}

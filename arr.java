import java.util.Scanner;


public class arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[] = new String[5];
		int arr[][] = new int[5][4];
		int i,j;
		
		for(i=0;i<5;i++){
			System.out.println("Enter name of student "+i);
			ar[i] = sc.next();			
		}
		
		for(i=0;i<5;i++){
			System.out.println("Enter marks for "+ar[i]);
			System.out.println("Sub 1 : ");
			arr[i][0]=sc.nextInt();
			System.out.println("Sub 2 : ");
			arr[i][1]=sc.nextInt();
			System.out.println("Sub 3 : ");
			arr[i][2]=sc.nextInt();
		}
		
		for(i=0;i<5;i++){
			arr[i][3]=arr[i][0]+arr[i][1]+arr[i][2];
		}
		
		for(i=0;i<5;i++){
			System.out.print("\n"+ar[i]);
			for(j=0;j<4;j++){
				System.out.print("\t"+arr[i][j]);
			}
		}
	}

}

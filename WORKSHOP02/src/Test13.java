import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nn;
		
		while(true) {
			System.out.print("입력 : ");
			nn = scan.nextInt();
			
			if(nn > 9 && nn < 100)
				break;
		}
		
		System.out.println("입력값은 "+nn);
	}

}

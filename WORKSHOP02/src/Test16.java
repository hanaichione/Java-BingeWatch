import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("왼쪽 위가 직각인 삼각형");
		System.out.print("몇 단 삼각형입니까? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

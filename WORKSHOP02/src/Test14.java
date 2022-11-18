import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println("-----------곱셈표-----------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d ", i*j);
			}
			System.out.println();
		}
	}

}

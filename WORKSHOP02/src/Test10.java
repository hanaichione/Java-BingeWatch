import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 총합 구하기");
		
		int n;
		int sum = 0;
		
		do {
		System.out.print("n 값: ");
		n = scan.nextInt();
		} while(n <= 0);
		
		for (int i = 0; i < n; i++) {
			sum += i+1;
		}
		
		System.out.println("1부터 "+n+" 까지의 총합: "+sum);
	}

}

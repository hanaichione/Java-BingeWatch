import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		
		System.out.println("정수를 입력하세요.");
		int b = scan.nextInt();
		
		System.out.println("정수 "+a+" 과 정수 "+b+" 중에서 최대값:"+(a>b? a: b));
		
	}

}

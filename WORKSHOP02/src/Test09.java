import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a 값: ");
		int a = scan.nextInt();
		System.out.print("b 값: ");
		int b = scan.nextInt();
		System.out.print("c 값: ");
		int c = scan.nextInt();
		
		if(a>=b && a>=c) max = a;
		else if(c>=b && a<=c) max = c;
		else if(a<=b && b>=c) max = b;
		
		System.out.println("최대값: "+max);
	}

}

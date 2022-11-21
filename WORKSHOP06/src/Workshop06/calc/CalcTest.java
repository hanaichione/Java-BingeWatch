package Workshop06.calc;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();

		if(args.length < 0 && args.length > 3) {
			System.out.println("다시 입력하세요.");
			Scanner scan = new Scanner(System.in);
			String arg = scan.nextLine();
			args = arg.split(" ");
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char operator = args[1].charAt(0);
		
		if(operator == 'x') System.out.println(cal.multiplication(num1, num2));
		if(operator == '+') System.out.println(cal.plus(num1, num2));
		if(operator == '-') System.out.println(cal.minus(num1, num2));
		if(operator == '/') System.out.println(cal.divide(num1, num2));
	}

}

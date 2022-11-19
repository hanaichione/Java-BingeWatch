package calc;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("5에서 10까지의 정수를 입력하세요.");
		int num;
		
		while (true) {
			num = scan.nextInt();
			if(num >= 5 && num <= 10) break;
		}
		
		System.out.println(cal.calculate(num));
	}

}

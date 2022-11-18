import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = new int[100];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		int num = scan.nextInt();
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
			
			if(number[i]%5 == 0) {
				sum += number[i];
				if(100-number[i] >= num)
					System.out.print(number[i]+"+");
				else if(100-number[i] < num)
					System.out.println(number[i]+" = "+sum);
			}
		}
		
	}

}

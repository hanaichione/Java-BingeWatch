import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		
		System.out.println("이름은 "+name+", 나이는 "+age+" 입니다");
	}

}

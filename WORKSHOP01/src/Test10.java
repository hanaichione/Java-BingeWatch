import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String address = scan.nextLine();
		
		String dou = address.split(" ")[0];
		String si = address.split(" ")[1];
		String gu = address.split(" ")[2];
		
		System.out.println("도명: "+dou+"\n시명: "+si+"\n구명: "+gu);
	}

}

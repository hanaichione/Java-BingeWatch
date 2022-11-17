import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String address = scan.nextLine();
		
		int len = address.length();
		int word = address.split(" ").length;
		
		System.out.println("문자 갯수(공백포함): "+len+"\n단어 갯수: "+word);
	}

}

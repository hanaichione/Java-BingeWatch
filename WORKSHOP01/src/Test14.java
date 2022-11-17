
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesg = "100/200";
		
		int a = Integer.parseInt(mesg.substring(0, 3));
		int b = Integer.parseInt(mesg.substring(4));
		
		System.out.println("정수값 합계: "+(a+b));
		System.out.println("정수값 평균: "+(a+b)/2);
	}

}

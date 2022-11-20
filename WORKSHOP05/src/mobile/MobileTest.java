package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("  Mobile\tBatter\t\tOS");
		System.out.println("-----------------------------------------");
		System.out.println(ltab.toString());
		System.out.println(otab.toString());
		
		System.out.println("\n10분 충전");
		ltab.charge(10);
		otab.charge(10);
		System.out.println("  Mobile\tBatter\t\tOS");
		System.out.println("-----------------------------------------");
		System.out.println(ltab.toString());
		System.out.println(otab.toString());

		System.out.println("\n5분 통화");
		ltab.operate(5);
		otab.operate(5);
		System.out.println("  Mobile\tBatter\t\tOS");
		System.out.println("-----------------------------------------");
		System.out.println(ltab.toString());
		System.out.println(otab.toString());
	}

}

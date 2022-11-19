package account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.println(acc.toString());
		
		acc.withdraw(600000);
		
		acc.deposit(20000);
		
		System.out.println(acc.toString());
		
		System.out.println("이자 : "+acc.calculateIntereset());
	}

}

package Workshop06.acc;

public class Account {
	String account;
	double balance;
	double interestRate;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*(interestRate/100);
	}
	public void deposit(double money) throws AccountException {
		if(money <= 0) {
			throw new AccountException("입금 금액이 0보다 작습니다.");
		}
		
		balance += money;
	}
	public void withdraw(double money) throws AccountException {
		if(balance < money) {
			throw new AccountException("출금 금액이 잔액보다 큽니다.");
		}
		balance -= money;
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}
	
	
}

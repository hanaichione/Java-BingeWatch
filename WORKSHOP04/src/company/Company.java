package company;

public class Company {
	double salary;
	double income;
	double afterTaxIncome;
	double bonus;
	double afterTaxBonus;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		income = salary*12;
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getAfterTaxIncome() {
		afterTaxIncome = this.getIncome() * 0.9;
		return afterTaxIncome;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public double getBonus() {
		bonus = 4*(this.getSalary() * 0.2);
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		afterTaxBonus = this.getBonus() * 0.945;
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
}

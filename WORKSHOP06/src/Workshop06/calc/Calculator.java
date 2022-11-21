package Workshop06.calc;

public class Calculator {
	public double plus(int a, int b) {
		return a+b;
	}
	public double minus(int a, int b) {
		return a-b;
	}
	public double multiplication(int a, int b) {
		return a*b;
	}
	public double divide(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error 발생 : "+e);
		}
		return a/b;
	}
}

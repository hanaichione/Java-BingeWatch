
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inx = 15;
		if(inx > 10 && inx < 20) System.out.println("true");
		
		char ch1 = ' ';
		if(ch1 != ' ' || ch1 != '\t') System.out.println("true");
		
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X') System.out.println("true");
		
		char ch3 = '0';
		if((int)ch3 >= 0 && (int)ch3 <= 9) System.out.println("true");
		
		char ch4 = 'a';
		if(ch4 >= 65 && ch4 <= 122) System.out.println("true");
		
		int year = 400;
		if(year%400 == 0 || (year%4 == 0 && year%100==0)) System.out.println("true");
		
		boolean powerOn = false;
		if(powerOn == false) System.out.println("true");
	}

}

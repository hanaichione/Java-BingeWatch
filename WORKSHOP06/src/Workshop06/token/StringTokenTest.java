package Workshop06.token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4, 2, 3, 6, 7";
		StringTokenizer token = new StringTokenizer(str, ", ");
		int sum = 0;
		while (token.hasMoreTokens()) {
			sum += Integer.parseInt(token.nextToken());
		}
		System.out.println(sum);
	}

}

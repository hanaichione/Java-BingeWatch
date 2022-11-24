package workshop07;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Javaprogramming";
		char chars[] = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < chars.length; i++) {
			set.add(chars[i]);
		}
		System.out.println(set);
	}

}

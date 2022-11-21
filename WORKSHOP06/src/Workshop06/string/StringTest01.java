package Workshop06.string;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am second to none";
		char chararr[] = str.toCharArray();
		int charCount = 0;
		int wordCount = 0;
		StringTokenizer token = new StringTokenizer(str, " ");
		
		for (int i = 0; i < chararr.length; i++) {
			if(chararr[i] == ' ') continue;
			System.out.print(chararr[i] + " ");
			charCount++;
		}
		System.out.println("문자개수 : " + charCount);
		
		while (token.hasMoreElements()) {
			wordCount++;
			System.out.print(token.nextToken() + " ");
		}
		System.out.println("단어개수 : " + wordCount);
		
	}

}

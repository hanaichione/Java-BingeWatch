import java.util.ArrayList;

public class Test04 {

	public static void main(String[] args) {
		// TODO 배열 생성
		int [] dice1 = new int[6];
		// int dice1 = new int[6];
		int [] dice2 = new int[6];
		// int dice2 = new int[6];
		
		for (int i = 0; i < dice1.length; i++) {
			dice1[i] = i+1;
			dice2[i] = i+1;
		}
		
		/*
		 * int[] dice1 = {1, 2, 3, 4, 5, 6}; 
		 * int[] dice2 = {1, 2, 3, 4, 5, 6};
		 */
		
		for (int i = 0; i < dice1.length; i++) {
			for (int j = 0; j < dice2.length; j++) {
				if(dice1[i]+dice2[j]==6) System.out.println(dice1[i]+"+"+dice2[j]+"="+(dice1[i]+dice2[j]));
			}
		}
	}

}

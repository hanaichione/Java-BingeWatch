
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dice = {1, 2, 3, 4, 5, 6};
		int multi = 0;
		
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice.length; j++) {
				for (int j2 = 0; j2 < dice.length; j2++) {
					if((dice[i]*dice[j]*dice[j2])%3 == 0)
						multi = dice[i]*dice[j]*dice[j2];
						System.out.println(dice[i]+"*"+dice[j]+"*"+dice[j2]+" = "+multi);
				}
			}
		}
	}

}

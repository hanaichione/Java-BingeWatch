
public class ArrayTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,6,8,2,9,7,14,1};
		int tmp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

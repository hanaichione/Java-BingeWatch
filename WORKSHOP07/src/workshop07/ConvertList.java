package workshop07;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertList {

	public ArrayList<Integer> convertList(int array[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
}

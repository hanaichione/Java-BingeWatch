package workshop07;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 4, 2, 5, 3, 6, 7, 5, 7, 9};
		
		ConvertList cList = new ConvertList();
		ArrayList<Integer> list = cList.convertList(array);
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println("listIterator 이용");
		ListIterator<Integer> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}

}

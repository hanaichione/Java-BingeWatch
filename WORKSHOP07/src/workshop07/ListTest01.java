package workshop07;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		MakeList lst = new MakeList();
		lst.makeArrayList(n);
		
		ArrayList<Integer> list = null;
		
		list = lst.getList();
		
		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n평균 : "+lst.getAverage());
	}

}
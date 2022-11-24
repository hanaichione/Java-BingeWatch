package workshop07;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst1 = new ArrayList<>(10);
		ArrayList<Integer> lst2 = new ArrayList<>(10);
		
		System.out.println("첫번째 ArrayList\t두번째 ArrayList\t결과");
		for (int i = 0; i < 10; i++) {
			int n = 0;
			
			lst1.add((int)(Math.random()*10));
			lst2.add((int)(Math.random()*10));
			
			try {
				n = lst1.get(i)/lst2.get(i);
				System.out.println(lst1.get(i)+" ------------------- "+lst2.get(i)+"\t\t"+n);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(lst1.get(i)+" ------------------- "+lst2.get(i)+"\t\t분모가0입니다.");
			}
			
		}
		
	}

}

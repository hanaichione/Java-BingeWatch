package workshop07;

import java.util.ArrayList;
import java.math.*;

public class MakeList {
	ArrayList<Integer> list;	

	public MakeList() {
		list = new ArrayList<Integer>();
	}

	public void makeArrayList(int size) {
		for (int i = 0; i < size; i++) {
			list.add((int)((Math.random()*10)+10));
		}
	}
	
	public double getAverage() {
		double sum = 0.0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum/list.size();
	}
	
	public ArrayList getList() {
		return list;
	}
}

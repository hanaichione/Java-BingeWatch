package workshop07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("Dog");			// idx 0
		animals.add("Cat");			// idx 1
		animals.add("Pig");			// idx 2
		animals.add(2, "Mouse");	// Pig가 idx 3으로
		animals.add("Bird");		// idx 4
		
		animals.set(2,  "Elephant");// Elephant가 idx 4로
		
		System.out.println(animals);// [Dog, Cat, Elephant, Pig, Bird]
		
		for (String animal : animals) {
			System.out.print(animal + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < animals.size(); i++) {
			System.out.print(animals.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");			
		}
		System.out.println();
		
		ListIterator<String> listIterator = animals.listIterator(animals.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
		
		System.out.println(animals.contains("Dog"));
		System.out.println(animals.contains("Cow"));
		System.out.println(animals.indexOf("Dog"));
		System.out.println(animals.indexOf("Cow"));
		
		animals.remove(0);
		System.out.println(animals);// [Cat, Elephant, Pig, Bird]
		
		animals.remove("Cat");
		System.out.println(animals);// [Elephant, Pig, Bird]
		
		animals.clear();
		System.out.println(animals);// []
	}

}

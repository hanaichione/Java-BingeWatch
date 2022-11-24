package workshop07.mobile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("둥이", 14);
		map.put("똘이", 10);
		map.put("홍시", 8);
		map.put("마루", 3);
		
		System.out.println(map);
		System.out.println(map.get("둥이"));
		
		for (String name : map.keySet()) {
			System.out.println("이름 : "+name+", 나이 : "+map.get(name));
		}
		
		System.out.println();
		
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println("이름 : "+key+", 나이 : "+map.get(key));
		}
		
		map.remove("홍시");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}

}

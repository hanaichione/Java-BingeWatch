package cafe;

public class CafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe cafe = new Cafe();
		
		Coffee ame = new Coffee("Americano", 4000);
		Coffee latte = new Coffee("Caffelatte", 5000);
		Coffee macchi = new Coffee("Macchiato", 6000);
		
		cafe.setCoffee(ame);
		cafe.setCoffee(latte);
		cafe.setCoffee(macchi);
		
		for (int i = 0; i < cafe.index; i++) {
				System.out.println(cafe.coffeList[i].toString());
			}
		
		System.out.println("Coffee 가격의 합 : "+cafe.totalPrice());
	}

}

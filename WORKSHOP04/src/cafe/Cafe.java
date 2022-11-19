package cafe;

public class Cafe {
	Coffee[] coffeList = new Coffee[10];
	int index=0;
	
	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
		Coffee[] coffeList = new Coffee[10];
		int index=0;
	}
	
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += coffeList[i].getPrice();
		}
		return total;
	}
	
	public void setCoffee(Coffee coffee) {
		if(index<10) {
			coffeList[index] = coffee;
			this.index++;
		}else {
			System.out.println("더 이상 저장할 수 없습니다.");
		}
		
	}
	
	public Coffee[] getCoffeeList() {
		return coffeList;
	}
	
}

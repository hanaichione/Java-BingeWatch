package cafe;

public class Coffee {
	
	String name;
	int price;
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return name+"    "+price;
	}
}

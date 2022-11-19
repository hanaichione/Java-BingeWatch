package book;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return bookPrice*(100-bookDiscountRate)/100;
	}

	public String tobeString() {
		return this.bookName +" " + this.bookPrice + "원   " + this.bookDiscountRate + "%   " + this.getDiscountBookPrice() + "원";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
}

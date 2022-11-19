package book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("SQL Plus", 50000, 5.0);
		Book book2 = new Book("Java 2.0", 40000, 3.0);
		Book book3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름           가격              할인율            할인후금액");
		System.out.println("----------------------------------------");
		System.out.println(book1.tobeString());
		System.out.println(book2.tobeString());
		System.out.println(book3.tobeString());
	}

}

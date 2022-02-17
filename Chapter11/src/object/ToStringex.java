package object;


class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
			return title +", " + author;
	}
	
	
}

public class ToStringex {
	
	public static void main(String[] args) {
		Book book = new Book("µŒ¿’¿⁄πŸ", "¿∫√—¥‘");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
		
	}

}

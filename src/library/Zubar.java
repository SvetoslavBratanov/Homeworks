package library;

public class Zubar extends Thread{
	
	String name;
	Book book;
	public Zubar(String name, Book book) {
		super();
		this.name = name;
		this.book = book;
	}

	@Override
	public void run() {
		book.tearPage();
	}
}

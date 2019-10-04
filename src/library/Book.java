package library;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	
	String name;
	AtomicInteger pages = new AtomicInteger(1000);
	
	
	void tearPage() {
		
		pages.getAndDecrement();
		System.out.println(pages);
	}
	
	AtomicInteger getPages() {
		return pages;
	}

}

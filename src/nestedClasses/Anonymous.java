package nestedClasses;

public class Anonymous {
	public static void main(String[] args) {

		Page firstPage = new Page("Intro", "Once upon a time...");
		Book book = new Book();
		book.addNewPage(firstPage);
		book.addNewPage(new Page() {
			private boolean isReaded;

			public boolean isReaded() {
				return isReaded;
			}

			public void setReaded(boolean isReaded) {
				this.isReaded = isReaded;
			}
		});
	}
}


public class Book {
//add variables for every header
	public String bookID;
	public String isbn;
	public String author;
	public String title;
	
	
	public String getBookID() {
		return bookID;
	}


	public void setBookID(String bookID) {
		this.bookID = bookID;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String toString() {
		
		return bookID + "  " + isbn + "  " + author + "  " + title;
	}
	
	/*Book(//takes in the attributes and creates objects//source - setters and getters){
	
}
*/
}



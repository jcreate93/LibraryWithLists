import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
//add variables for every header
	public String bookID;
	public String isbn;
	public String author;
	public String title;
	public String originalPublicationYear;
	List<Book> arrayBooks = new ArrayList<Book>();
	
	
	public String getOriginalPublicationYear() {
		return originalPublicationYear;
	}


	public void setOriginalPublicationYear(String originalPublicationYear) {
		this.originalPublicationYear = originalPublicationYear;
	}


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
		
		return bookID + "  " + isbn + "  " + author + "  " + originalPublicationYear + "  " + title + "\n";
	}
	
	
	
	
	/*Book(//takes in the attributes and creates objects//source - setters and getters){
	
}
*/
}



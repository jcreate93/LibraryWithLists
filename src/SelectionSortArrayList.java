import java.util.ArrayList;
import java.util.List;

public class SelectionSortArrayList {
	static List<Book> arrayBooks = new ArrayList<Book>();

	public static void sortByAuthor(List<Book> arrayBooks) {
		for (int i = 0; i < arrayBooks.size() - 1; i++) {
			String min = arrayBooks.get(i).getAuthor();
			int posMin = i;
			for (int j = i + 1; j < arrayBooks.size(); j++) {
				if (arrayBooks.get(j).getAuthor().compareTo(min) < 0) {
					min = arrayBooks.get(j).getAuthor();
					posMin = j;
				}
			}
			if (i != posMin) {
				Book temp = arrayBooks.get(i);
				arrayBooks.set(i, arrayBooks.get(posMin));
				arrayBooks.set(posMin, temp); // Swaps the elements at indexes i and j.
			}
		}
		System.out.println(arrayBooks);
	}

	public static void sortByPublicationYear(List<Book> arrayBooks) {
		for (int i = 0; i < arrayBooks.size() - 1; i++) {
			String min = arrayBooks.get(i).getOriginalPublicationYear();
			int posMin = i;
			for (int j = i + 1; j < arrayBooks.size(); j++) {
				if (arrayBooks.get(j).getOriginalPublicationYear().compareTo(min) < 0) {
					min = arrayBooks.get(j).getOriginalPublicationYear();
					posMin = j;
				}
			}
			if (i != posMin) {
				Book temp = arrayBooks.get(i);
				arrayBooks.set(i, arrayBooks.get(posMin));
				arrayBooks.set(posMin, temp); // Swaps the elements at indexes i and j.
			}
		}
		System.out.println(arrayBooks);
	}
	
	public static void sortByBookID(List<Book> arrayBooks) {
		for (int i = 0; i < arrayBooks.size() - 1; i++) {
			String min = arrayBooks.get(i).getBookID();
			int posMin = i;
			for (int j = i + 1; j < arrayBooks.size(); j++) {
				if (arrayBooks.get(j).getBookID().compareTo(min) < 0) {
					min = arrayBooks.get(j).getBookID();
					posMin = j;
				}
			}
			if (i != posMin) {
				Book temp = arrayBooks.get(i);
				arrayBooks.set(i, arrayBooks.get(posMin));
				arrayBooks.set(posMin, temp); // Swaps the elements at indexes i and j.
			}
		}
		System.out.println(arrayBooks);
	}

	public static int BinarySearch(List<Book> arrayBooks, String bookID) {

		// Returns index of bookID if it is present in arrayBooks,
		// else return -1

		int left = 0, right = arrayBooks.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if bookID is present at mid
			if (arrayBooks.get(mid).getBookID().equals(bookID))
				return mid;

			// If bookID greater, ignore left half
			if (arrayBooks.get(mid).getBookID().compareTo(bookID) < 0)
				left = mid + 1;

			// If bookID is smaller, ignore right half
			else
				right = mid - 1;
		}
	
		// if we reach here, then element was
		// not present
		return -1;
	}

	public static void sortByBookID1(List<Book> books) {
		// TODO Auto-generated method stub
		
	}
	
}
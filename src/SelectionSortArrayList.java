import java.util.ArrayList;
import java.util.List;

public class SelectionSortArrayList {
	static List<Book> arrayBooks = new ArrayList<Book>();

	public static void sortByAuthor(List<Book> arrayBooks) {
		for (int i = 0; i < arrayBooks.size()-1; i++) {
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
				arrayBooks.set(posMin, temp);                        // Swaps the elements at indexes i and j.
			}
		}
		System.out.println(arrayBooks);
	}
	
	public static void sortByPublicationYear(List<Book> arrayBooks) {
		for (int i = 0; i < arrayBooks.size()-1; i++) {
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
				arrayBooks.set(posMin, temp);                        // Swaps the elements at indexes i and j.
			}
		}
		System.out.println(arrayBooks);
	}
}
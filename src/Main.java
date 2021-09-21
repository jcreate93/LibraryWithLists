import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
		

public class Main {

	public static void main(String[] args) {
		 
		List<Book> books = readBooksFromCSV("C:\\Users\\Owner\\git\\LibraryWithLists\\shortBook.csv");  //("src\\shortBook.csv");
		GraphicsFrame gframe = new GraphicsFrame(books);  
		
        // let's print all the person read from CSV file
       /* for (Book b : books) {
            System.out.println(b);
        }*/
    }
	
    private static List<Book> readBooksFromCSV(String csvFile) {
        List<Book> arrayBooks = new ArrayList<Book>();
        //List<Book> listBooks = new LinkedList<Book>();  //in graphicsframe 
        Path pathToFile = Paths.get(csvFile);
        
        // create an instance of BufferedReader
        try (BufferedReader buffr = new BufferedReader(new FileReader(csvFile))) {

            // read the first line from the text file
            String line = buffr.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] columns = line.split(",");

                Book fullBook = new Book();
              
             
fullBook.bookID = columns[0];
fullBook.isbn = columns[5];
fullBook.author = columns[7];
fullBook.title = columns[10];

		System.out.println(fullBook);
                // adding book into ArrayList
                arrayBooks.add(fullBook);

                // read next line before looping
                // if end of file reached, line would be null
                line = buffr.readLine();
            }
           

        } catch (IOException e) {
            e.printStackTrace();
        }
//System.out.println(arrayBooks);
        return arrayBooks;
    }

	
	}



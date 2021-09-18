
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
		
public class Book {

	public static void main(String[] args) throws IOException {
	
		GraphicsFrame gframe = new GraphicsFrame();    
		
				File csvFile = new File("D:\\eclipseWorkspaces\\SENG102Java\\Library\\books.csv");
				BufferedReader br = new BufferedReader(new FileReader(csvFile));
				ArrayList<String> listOfLines = new ArrayList<>();
				
				String line = br.readLine();
				
				try {
					while(line != null) {                   //reads each row
						listOfLines.add(line);
					      line = br.readLine();
						//String[] count = line.split(",");                     //splits each column by commas
						System.out.println(line);
					}
				}
				finally {//something
					
				}
				
				
	}

}

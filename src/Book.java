import java.io.IOException;
		import java.io.FileReader;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.BufferedReader;
		
public class Book {

	public static void main(String[] args) throws IOException {
	
				File csvFile = new File("C:\\Users\\limit\\git\\LibraryDesktopAppLists\\books.csv");
				BufferedReader br = new BufferedReader(new FileReader(csvFile));
				
				String line = "";
				
				try {
					while((line = br.readLine()) != null) {                   //reads each row
						String[] count = line.split(",");                     //splits each column by commas
						System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3]);
					}
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				finally {//something
					
				}
				
				
	}

}

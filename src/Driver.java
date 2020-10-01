import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		
		int numLines = 0;
		//counts the number of lines in the file so I can create the right size array
		while(input.hasNext()) 
		{
			numLines++;
			input.nextLine();
		}
		BibleBook[] books = new BibleBook[numLines];
		input.close();
		
		//re-open the file to put it back at the beginning
		input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		int pos = 0;
		while(input.hasNext())
		{
			books[pos] = new BibleBook(input.nextLine());
			books[pos].display();
			pos++;
		}
		input.close();
		
		
	}
}

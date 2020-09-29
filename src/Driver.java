import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		BibleBook bb1 = new BibleBook("Matthew", 26, "This is an account of Jesus’ life, death, and resurrection, focusing on Jesus’ role as the true king of the Jews.");
		BibleBook bb2 = new BibleBook("Acts", 28, "Jesus returns to the Father, the Holy Spirit comes to the church, and the gospel of Jesus spreads throughout the world.");
		BibleBook bb3 = new BibleBook("Romans", 15, "Paul summarizes how the gospel of Jesus works in a letter to the churches at Rome, where he plans to visit.");
		
		Animal[] ar = new Animal[4];
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		while(input.hasNext())
		{
			Animal a = new Animal(input.nextLine());
			a.display();
		}
		input.close();
		
		
	}
}

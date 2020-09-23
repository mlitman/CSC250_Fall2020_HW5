
public class Driver 
{
	public static void main(String[] args) 
	{
		BibleBook bb1 = new BibleBook("Matthew", 26, "This is an account of Jesus’ life, death, and resurrection, focusing on Jesus’ role as the true king of the Jews.");
		BibleBook bb2 = new BibleBook("Acts", 28, "Jesus returns to the Father, the Holy Spirit comes to the church, and the gospel of Jesus spreads throughout the world.");
		BibleBook bb3 = new BibleBook("Romans", 15, "Paul summarizes how the gospel of Jesus works in a letter to the churches at Rome, where he plans to visit.");

		bb1.display();
		bb2.display();
		bb3.display();
	}

}

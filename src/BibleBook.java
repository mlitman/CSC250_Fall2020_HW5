
public class BibleBook extends Object
{
	private String name;
	private int number_of_chapters;
	private String summary;
	
	public BibleBook(String name, int number_of_chapters, String summary)
	{
		this.name = name;
		this.number_of_chapters = number_of_chapters;
		this.summary = summary;
	}
	
	int addNums(int a, int b)
	{
		return a + b;
	}
	
	static int addNums2(int a, int b)
	{
		return a + b;
	}
	
	public int getNumber_of_chapters() 
	{
		return number_of_chapters;
	}

	public String getSummary() 
	{
		return summary;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		if(newName.length() >= 5)
		{
			this.name = newName;
		}
	}
	
	public void display()
	{
		System.out.println("Book Name: " + this.name + 
				"(" + this.number_of_chapters + " chapters) - " + this.summary);
	}
}

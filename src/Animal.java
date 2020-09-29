
public class Animal 
{
	private String name;
	private int numberOfLegs;
	private double weight;
	
	public Animal(String name, int numberOfLegs, double weight)
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.weight = weight;
	}
	
	public Animal(String commaDelimited)
	{
		String[] parts = commaDelimited.split(",");
		this.name = parts[0];
		this.numberOfLegs = Integer.parseInt(parts[1]);
		this.weight = Double.parseDouble(parts[2]);
	}
	
	public void display()
	{
		System.out.printf("Name: %s Age: %d Weight: %f \n", this.name, this.numberOfLegs, this.weight);
	}
	
	public String getName()
	{
		return this.name;
	}

	public int getNumberOfLegs() 
	{
		return numberOfLegs;
	}

	public double getWeight() 
	{
		return weight;
	}
	
}


// RandomNumber.java

public class RandomNumber 
{
	private int number = 0;
	
	private int generateRandomNumber(int lowerBound, int upperBound)
	{
		return lowerBound + (int)(Math.random() * upperBound);
	}
	
	public int getRandomNumber()
	{
		int low = 0;
		int high = 10;
		number = generateRandomNumber(low, high);
		return number;
	}
	
	public int getRandomNumber(int lowerBound, int upperBound)
	{
		number = generateRandomNumber(lowerBound, upperBound);
		return number;
	}
}

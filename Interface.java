// Interface.java

import java.util.Objects;
import java.util.Scanner;

public class Interface 
{
	Scanner input = new Scanner( System.in );
	
	public void run()
	{
		boolean running = true;
		
		do
		{
			RandomNumber newRandomNumber = new RandomNumber();
			
			int randomNumber = newRandomNumber.getRandomNumber();
			
			System.out.println("A random number was generated. Is it odd or even? ");
			System.out.print("Enter '0' for even or '1' for odd: ");
			int userInput = input.nextInt();
			
			getResult(randomNumber, userInput);
			
			running = again();
			
		}while(running);
		
	}
	
	private boolean isEven( int number)
	{
		if(number % 2 == 0) { return true;}
		else return false;
	}
	
	private void getResult( int computerNumber, int userNumber)
	{
		boolean isEven = isEven(computerNumber);
		
		if(userNumber == 0 && isEven || userNumber == 1 && !isEven)
		{
			System.out.println("You are correct!");
		}
		
		else
			System.out.println("You are wrong!");
	}
	
	private boolean again()
	{
		System.out.print("Do you want to try again with a new number? ");
		String userInput;
		
		while(true)
		{
			userInput = input.nextLine();
			if(Objects.equals(userInput.toLowerCase(), "yes") || Objects.equals(userInput.toLowerCase(), "no"))
				break;
			else System.out.print("Please enter 'yes' or 'no': ");
		}
		
		if(Objects.equals(userInput.toLowerCase(), "yes")) {return true;}
		else return false;
	}
}

import java.util.Scanner;

public class JavaLesson2 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Your favorite number: ");
		
		if (userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered);
			
			int numberEnteredTimes2 = numberEntered * 2;
			System.out.println(numberEntered + " * 2 = " + numberEnteredTimes2);
			
			int numberEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2);
			
			int numberEnteredModulus2 = numberEntered % 2;
			System.out.println(numberEntered + " Mod 2 = " + numberEnteredModulus2);
			
			double numSqrt = Math.sqrt(5.23);
			int numCeiling = (int)Math.ceil(5.23); //6
			int numFloor = (int)Math.floor(5.23); //5
			int numRound = (int)Math.round(5.63); //5
			int randomNumber = (int)(Math.random() *10);
			
			System.out.println("Random number is: " + randomNumber);

		} else {
			System.out.println("Enter an integer next time");
		}
	}
	
}
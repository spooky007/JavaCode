import java.util.Random;

public class JavaLessonThree {
	
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 50);
		Random rnd = new Random();
		int num = rnd.nextInt(41) + 30;
		
		int valueOne = 1;
		int valueTwo = 2;
		char theGrade = 'C';
		
		/*
		 * Relational Operators:
		 * Java has 6 relational operators
		 * > : Greater than
		 * < : Less than
		 * == : Equal To
		 * >= : Greater than or Equal To
		 * <= : less than or Equal To
		 */
		
		if (randomNumber < 25) {
			System.out.println("The random number is <25: ");
		} else if (randomNumber > 40) {
			System.out.println("The random number is greater than 40");
		} else if (randomNumber == 18) {
			System.out.println("The random number is equal to 18");
		} else if (randomNumber != 40) {
			System.out.println("The random number is not equal to 40");
		}
		
		System.out.println("The random number is: " + randomNumber);
		System.out.println("Random number between 30 and 70 is " + num);
		
		/*
		 * Logical operators:
		 * Java has 6 logical operators:
		 * ! : Converts the boolean value to its right to its opposite
		 * & : returns true if both boolean value on the right and left side
		 * && : returns true if both boolean value on the right and left side are true
		 * | : returns true if either boolean value on the right or left side is true
		 * || : returns true if either boolean value on the right or left side is true
		 * ^: returns true if there is 1 true and 1 false boolean value
		 */
		
		int biggestValue = (valueOne > valueTwo)? valueOne : valueTwo;
		System.out.println(biggestValue);
		
		switch(theGrade) {
		case 'A':
			System.out.println("Congratulations You have an A");
			break;
		case 'B':
			System.out.println("Congratulations You have an B");
		case 'C':
		case 'D':
			System.out.println("Congratulations You passed");
		default:
			System.out.println("You didn't take the test!");

		}

	}
}
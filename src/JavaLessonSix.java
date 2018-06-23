
/*
 * Exception handling tutorials
 * link(http://www.newthinktank.com/2012/01/java-video-tutorial-6/)
 */

import java.util.*;
import java.io.*;

public class JavaLessonSix {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			getAFile("./somestuff.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An IO Error Occurred");
		}

		// System.out.println("How old are you?");
		// int age = CheckValidAge();
		// if (age != 0 ) {
		// System.out.println("You are " + age + " years old!");
		// }
	}

	public static void getAFile(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}

	public static void getFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry can't find that file");
		}
		// catching two exceptions at once
		// catch (ClassNotFoundException | IOException e) {
		//
		// }
		catch (Exception e) {
			System.out.println("Some error occurred");
		} finally {
			// finally is used for closing Files or database connection
			System.out.println();

		}
	}

	// public static int CheckValidAge() {
	//
	// try {
	// return userInput.nextInt();
	// } catch (InputMismatchException e) {
	// userInput.next();
	// System.out.print("That isn't a whole number");
	// return 0;
	// }
	// }

	// public static void dividedByZero(int a) {
	//
	// try {
	// System.out.println(a/0);
	//
	// } catch (ArithmeticException e) {
	//
	// System.out.println("You can't do that!");
	// System.out.println(e.getMessage());
	// System.out.println(e.toString());
	//
	// e.printStackTrace();
	// }
	// }
}
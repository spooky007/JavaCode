import java.util.Scanner;

public class JavaLessonFour {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		String contYorN = "Y";
		
		int h = 1;
		
		while(contYorN.equalsIgnoreCase("y")) {
			System.out.println(h);
			System.out.println("Continue y or n?");
			contYorN = userInput.nextLine();
			h++;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" * ");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == 1 || i == 4 || j == 1 || j == 4) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		// Homework: print the following pattern
		//  1 2 3 4
		//  2 3 4 1
		//  3 4 1 2
		//  4 1 2 3
		
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j < i + 4; j++) {
				System.out.print((j % 4) + 1);
			}
			System.out.println();
		}
		
		int m, n;
		
		for (m = 1, n = 2; m <= 9; m += 2, n += 2) {
			System.out.println(m + "\n" + n);
		}
		
//		int i = 1;
//		double myPi = 4.0;
//		double j = 3.0;
//		
//		// calculating PI 
//		// 4 - 4/3 + 4/5 - 4/7
//		
//		while(j < 8001) {
//			myPi = myPi - (4/j) + (4/(j+2));
//			j+= 4;
//			System.out.println(myPi);
//		}
//		
//		System.out.println("Value of PI: " + Math.PI + "\n");
//		
//		while (i <=20) {
//			
//			if(i == 3) {
//				i+=2;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//			if((i%2) == 0) {
//				i++;
//			}
//			
//			if(i > 10) {
//				break;
//			}
//		}
	}
}
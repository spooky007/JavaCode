import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaLesson32 {
	
	public static void main(String[] args) {
		Customer[] customers = getCustomers();
		PrintWriter custOutput = createFile("/Users/Eric/eclipse-workspace/JavaCode/src/customers.txt");
		
		for(Customer person : customers) {
			createCustomer(person, custOutput);
		}
		custOutput.close();
		getFileInfo();
		
	} // End of main Function
	
	private static class Customer {
		private String firstName;
		private String lastName;
		private int age;
		
		public Customer(String firstName, String lastName, int age) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}
	} // End of customer class
	
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John", "Smith", 21);
		customers[1] = new Customer("Sally", "Smith", 23);
		customers[2] = new Customer("Paul", "Smith", 25);
		customers[3] = new Customer("Tom", "Smith", 28);
		customers[4] = new Customer("Mark", "Smith", 30);
		
		return customers;
	} // End of getCustomers() function
	
	private static PrintWriter createFile(String fileName) {
		
		try {
			File listOfNames = new File(fileName);
			PrintWriter infoToWrite = new PrintWriter(
					new BufferedWriter(
							new FileWriter(listOfNames)));
			return infoToWrite; 
		} catch (IOException e) {
			System.out.println("An I/O error occurred!");
			System.exit(0);
		}
	
		return null;
	} // End of createFile function
	
	private static void createCustomer(Customer customer, PrintWriter custOutput) {
		String custInfo = customer.firstName + " " + customer.lastName + " ";
		custInfo += Integer.toString(customer.age);
		System.out.println(custInfo);
		
		custOutput.println(custInfo);
	}
	
	private static void getFileInfo() {
		System.out.println("Info written to File\n");
		try {
			File listOfNames = new File("/Users/Eric/eclipse-workspace/JavaCode/src/customers.txt");

			BufferedReader reader = new BufferedReader(
					new FileReader(listOfNames)
					);
			String custInfo = reader.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error!");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("File not found error!");
			System.exit(0);
		}
	}
}

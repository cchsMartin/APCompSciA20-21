import java.util.Scanner;

/**
 * 
 */

/**
 *Author: Melanie Rosado
 *Date: Sep 24, 2020
 *Description: A program that assigns a new Shark Mail address to students 
 * based on the information they input.
 */
public class EmailAddress {

	
	public static void main(String[] args) {
		System.out.println("This survey will assign you a new Shark Mail address based on the information you input.");
		System.out.println("Please press [Enter] after each entry.");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("What is your first name?");
		String firstName = keyboard.nextLine();
		
		System.out.println("What is your middle name?");
		String middleName = keyboard.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = keyboard.nextLine();
		
		System.out.println("What is your birthday (mm-dd-yyyy)");
		String birthday = keyboard.nextLine();
		
		String partOne = lastName.toLowerCase();
		String partTwo = firstName.substring(0, 1).toUpperCase();
		String partThree = middleName.substring(0, 1).toUpperCase();
		
		String tempPassword = birthday.substring(0, 2) + birthday.substring(3, 5) + birthday.substring(6, 10);
		
		System.out.println(" ");
		System.out.println("Email: " + partOne + partTwo + partThree + "@sharkmail.com");
		System.out.println("Temp Password: " + tempPassword);
		System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
	}

}

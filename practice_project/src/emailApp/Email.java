package emailApp;
import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String altEmail;
	private int defaultPasswordLength = 10;
	
	// constructor takes in first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " "+ this.lastName);
		
		// method to ask for department
		this.department = setDepartment();
		System.out.println("Deparment: " + this.department);
		
		// method that returns a random password
		this.password = randPassword(defaultPasswordLength);
		System.out.println("Generated Password: " + this.password);
		
	}
	// ask for department and return a department
	private String setDepartment() {
		System.out.print("Enter the department: \n 1 for Sales \n 2 for Accounting \n 0 for None");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1 ) {return "sales";}
		else if (depChoice == 2) {return "accounting";}
		else { return "";}
		
	}
	// generate password
	// takes param of length
	private String randPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0 ; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	// set mailbox capacity
	
	// set alt email
	
	// change password
}

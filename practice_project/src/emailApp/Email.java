package emailApp;
import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String altEmail;
	
	// constructor takes in first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " "+ this.lastName);
		
		// method to ask for department
		this.department = setDepartment();
		System.out.println("Deparment: " + this.department);
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
	
	// set mailbox capacity
	
	// set alt email
	
	// change password
}

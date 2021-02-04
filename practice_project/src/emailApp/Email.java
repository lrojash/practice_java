package emailApp;
import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String altEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix  = "coolcompany.com";

	// constructor takes in first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Email Created: " + this.firstName + " "+ this.lastName);
		
		// method to ask for department
		this.department = setDepartment();
//		System.out.println("Deparment: " + this.department);
		
		// method that returns a random password
		this.password = randPassword(defaultPasswordLength);
		System.out.println("Generated Password: " + this.password);
		
		// combine element to create email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//		System.out.println("Your email: " + email);
	}
	// ask for department and return a department
	private String setDepartment() {
		System.out.print("Enter the department: \n 1 for Sales \n 2 for Accounting \n 0 for None \n");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1 ) {return "sales";}
		else if (depChoice == 2) {return "accounting";}
		else { return "";}
		
	}
	// generate password
	// takes param of length
	private String randPassword(int length) {
		// sets the possible characters that can be used for the password
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		// creates an array of characters with the length of the password 
		char[] password = new char[length];
		for (int i = 0 ; i < length; i++) {
			// will get a random number between 0 and the length of the password set of characters
			// getting casted to integer
			int rand = (int) (Math.random() * passwordSet.length());
			// getting the character at the index 'rand' and inserting into password array
			password[i] = passwordSet.charAt(rand);
		}
		// returns the array of characters in a string
		return new String(password);	
	}
	// set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// set alt email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	// change password
	public void changePassword(String password) {
		this.password = password;
	}
	// get methods
	public int getMailboxCapacity() {return mailboxCapacity; };
	public String getAltEmail() {return altEmail;};
	public String getPassword() {return password;};
	
	// method to show all info 
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + lastName + 
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
}

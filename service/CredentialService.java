package service;

public class CredentialService {
	
	GeneratePassword passGen = new GeneratePassword();

	public void generatePassword() {
		System.out.print("Your password is ---->");
		System.out.print(passGen.generatePassword());
	}
	
	public void generateEmailAddress(String firstName, String lastName, String dept) {
		String email = firstName + lastName + "@" + dept + ".abc" + ".com";
		System.out.println("Your email is ----> " + email);
	}
	
	public void showCredentials(String firstName, String lastName, String dept) {
		System.out.println("Dear " + firstName + ", your generated credentials are as follows:");
		generateEmailAddress(firstName, lastName, dept);
		generatePassword();
	}
}

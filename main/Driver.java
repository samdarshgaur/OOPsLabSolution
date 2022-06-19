package main;

import java.util.Scanner;

import model.Employee;
import service.CredentialService;

public class Driver {
	public static void main(String[] args) {
		
		Employee emp = new Employee("Samdarsh", "Gaur");
		CredentialService credService = new CredentialService();
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		System.out.println("___________________________________");
		System.out.println("Please enter the number in front of the department you belong");
			
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("___________________________________");
			
	    option = sc.nextInt();
			
	    switch(option) {
		case 1:
		    credService.showCredentials(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(),"tech");
			break;
		case 2:
			credService.showCredentials(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			break;
		case 3:
			credService.showCredentials(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			break;
		case 4:
			credService.showCredentials(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			break;
		default:
			System.out.println("Enter a valid option");
		}
		
		sc.close();
	}

}

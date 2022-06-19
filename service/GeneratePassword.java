package service;

import java.util.Random;

public class GeneratePassword {
	public char[] generatePassword() {
	   String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	   String specialCharacters = "!@#$";
	   String numbers = "1234567890";
	   String combinedChars = numbers + capitalCaseLetters + specialCharacters + lowerCaseLetters;
	   Random random = new Random();
	   char[] password = new char[8];

	   password[0] = numbers.charAt(random.nextInt(numbers.length()));
	   password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	   password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	   password[3] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	   
	   for(int i = 4; i < 8 ; i++) {
	      password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	   }
	   
	   return password;
	}
}

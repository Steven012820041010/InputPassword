package com.sz.forLoop;

import java.util.Scanner;

public class HomeworkOfInputPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.format("Please input your password, you can input \"STOP\" to stop it.\n");
		boolean isContinue = true;
		while(isContinue) {
			boolean length = false;
			boolean uppercase = false;
			boolean lowercase = false;
			boolean specialCharacter = false;
			boolean digitCharacter = false;
			String input = sc.nextLine();
			if ("STOP".equals(input)) {
				isContinue = false;
			}else {

				if (input.length() >= 6 && input.length() <= 20) {
					length = true;
				}

				for (int i=0; i<input.length(); i++) {
					char letter = input.charAt(i);
					if (letter>= 'A' && letter<= 'Z') {
						uppercase = true;
					}
					if (letter>= 'a' && letter<= 'z') {
						lowercase = true;
					}
					if (letter>='0' && letter<='9' ) {
						digitCharacter = true;
					}
					if (letter == '!' || letter == '#'|| letter == '@'|| letter == '$' ) {
						specialCharacter = true;
					}
				}
				if (uppercase == false) {
					System.out.println("Your password is invalid because you don't have a Uppercase letter in your password");
				}
				if (lowercase == false) {
					System.out.println("Your password is invalid because you don't have a Lowercase letter in your password");
				}
				if (specialCharacter == false) {
					System.out.println("Your password is invalid because you don't have a Special Character in your password");
				}
				if (digitCharacter == false) {
					System.out.println("Your password is invalid because you don't have a Digit Character in your password");
				}
				if (length == false) {
					System.out.println("Your password is invalid because the length of your password should be between 6 and 20");
				}

				if (uppercase && lowercase  && specialCharacter && digitCharacter  && length) {
					System.out.println("Your password is valid");
				}
			}
		}

	}

}

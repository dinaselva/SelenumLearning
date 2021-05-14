package week1.day2.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String str, rev = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		str = sc.nextLine();
		
		int length = str.length() -1;

		for (int i = length; i >=0; i--) {

			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {

			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
		
		sc.close();
	}

}

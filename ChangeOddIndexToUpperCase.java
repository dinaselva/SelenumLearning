package week1.day2.assignments;

import java.util.Scanner;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String str = "changeme";
		 
		for(int i=0; i < str.length(); i++) {
			 
			if(i%2==0) {
	            System.out.print(Character.toLowerCase(str.charAt(i)));
	        }
	        else
	        {
	            System.out.print(Character.toUpperCase(str.charAt(i)));
	        }
		}
	}
}

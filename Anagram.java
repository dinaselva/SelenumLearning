package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";

		String text2 = "potts";

		int txt1 = text1.length();

		int txt2 = text2.length();

		if (txt1 == txt2) {

			char[] c1 = text1.toCharArray();
			char[] c2 = text2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {
				System.out.println("Values are equal");
			} else {
				System.out.println("Values are not equal");

			}
		}

	}

}

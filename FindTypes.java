package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {

		String str = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] ch = str.toCharArray();

		System.out.println(ch);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(ch[i])) {
				letter = letter + 1;

			} else if (Character.isSpaceChar(ch[i])) {
				space = space + 1;

			} else if (ch[i] > '0' && ch[i] < '9') {
				num = num + 1;
			} else {

				specialChar = specialChar + 1;
			}
		}
		System.out.println("Letters: " + letter);
		System.out.println("Spaces: " + space);
		System.out.println("Numbers: " + num);
		System.out.println("SpecialCharacter: " + specialChar);

	}

}

package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "Welcome to Chennai";

		int count = 0;

		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'e') {
			count = count + 1;
			}
		}
		System.out.println("Occurance of e is" + " " +count);
}
}
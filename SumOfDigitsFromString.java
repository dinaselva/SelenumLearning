package week1.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String str = "Tes12Le79af65567";
        int sum = 0;
        
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("Sum of Digits -" + " " + sum);
	}
}
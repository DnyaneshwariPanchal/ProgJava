package Java.Programming;

public class isPalindrome {

	static void stringIsPalindrom(String input) {

		String reverseString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			reverseString += ch;
		}
		System.out.println(input + " reverse string " + reverseString);

		if (reverseString.equals(input)) {
			System.out.println(reverseString + " String is palindrom");
		} else {
			System.out.println(reverseString + " String is not palindrom");
		}

	}

	static void isPalindromeNumber(int num) {
		int remainder;
		int reverserNumber = 0;
		int temp = num;
		while (temp > 0) {
			remainder = temp % 10; // 57 5 7 5
			reverserNumber = reverserNumber * 10 + remainder;// 570+5+
			temp = temp / 10; // 57
		}
//		System.out.println(reverserNumber);
		if (num == reverserNumber) {
			System.out.println("Provided Number is Palindrom");
			System.out.println(num + " and " + reverserNumber);
		} else {
			System.out.println("Provided Number is not Palindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringIsPalindrom("saras");
		stringIsPalindrom("Rudra");

		isPalindromeNumber(575);
		isPalindromeNumber(299);
	}

}

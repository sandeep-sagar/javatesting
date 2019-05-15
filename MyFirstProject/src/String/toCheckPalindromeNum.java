package String;

public class toCheckPalindromeNum {
	public static int reverseOfNumber(int num) {
		int realValue = num;
		int reverse = 0;
		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num = num / 10;
		}
		return reverse;
	}

	public static void palindromeOrNot(int palindromeNum) {
		//int palindrome= 4559;
		int reversePalindrome = reverseOfNumber(palindromeNum);
		System.out.println(reversePalindrome);
			if (reversePalindrome == palindromeNum ) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not Palindrome");
		}
	}

	public static void main(String[] args) {
	//	int number = 348;
		toCheckPalindromeNum palindrome = new toCheckPalindromeNum();
		//palindrome.reverseOfNumber(number);
		palindrome.palindromeOrNot(8965698);

	}

}

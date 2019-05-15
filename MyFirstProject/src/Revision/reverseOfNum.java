package Revision;

public class reverseOfNum {
public static int reverseNumber(int number2) {
	//int number = 485;
	int reverse = 0 ;
	while(number2 > 0) {
		reverse = (reverse * 10) + (number2%10);
		number2 = number2/10;
	}
//reverse++;
	//System.out.print(reverse);
	return reverse;
}
public static void reverseNum() {
	//reverseNumber(12345);
	int reverseNo2 = reverseNumber(12345);
	System.out.println(reverseNo2);
	int reverseNo3 = reverseNumber(1212454);
	System.out.println(reverseNo3);
}
	public static void main(String[] args) {
		int number = 56;
		reverseOfNum rev = new reverseOfNum();
		//rev.reverseNumber(number);
		rev.reverseNum();
	}

}

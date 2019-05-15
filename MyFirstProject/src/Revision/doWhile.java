package Revision;

public class doWhile {
	public static void whileFun() {
		int a = 5;
		int b = 5;
		while (a < 5) {
			//++a;
			System.out.println(a);
			a++;
		}
		do {
			System.out.println(b);
			b++;
		} while (b < 5);
	}

	public static void main(String[] args) {
		doWhile dow = new doWhile();
		dow.whileFun();
	}

}

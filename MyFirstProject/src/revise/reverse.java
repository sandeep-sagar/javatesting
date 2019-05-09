package revise;

public class reverse {
	public static void revTri() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 6; j++) {
				int end = 6;
				int start = end - i;
				if (j <= start && j >= i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void revAltTri() {
		for (int i = 0; i <= 3; i++) {
			int flag = 0;
			for (int j = 0; j <= 6; j++) {
				if (j <= 6 - i && j >= i) {
					if (flag == 0) {
						System.out.print("*");
						flag = 1;
					} else {
						System.out.print("-");
						flag = 0;
					}
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void diagSq() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || j == 0 || i == 4 || j == 4 || i == j) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void revDiag() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || j == 0 || i == 4 || j == 4 || j == 4 - i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void swap() {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("original val of a: " + a);
		System.out.println("original val of b: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Changed value of a: " + a);
		System.out.println("Changed value of b: " + b);
	}

	public static void arithSwap() {
		int a = 10;
		int b = 20;
		System.out.println("original val of a: " + a);
		System.out.println("original val of b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Changed value of a: " + a);
		System.out.println("Changed value of b: " + b);
	}

	public static void operSwap() {
		int a = 10;
		int b = 20;
		System.out.println("original val of a before div and mul: " + a);
		System.out.println("original val of b before div and mul: " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Changed value of a afer div and mul: " + a);
		System.out.println("Changed value of b afer div and mul: " + b);
	}

	public static void main(String[] args) {
		reverse rev = new reverse();
		rev.revTri();
		System.out.println();
		rev.revAltTri();
		System.out.println();
		rev.diagSq();
		System.out.println();
		rev.revDiag();
		System.out.println();
		rev.swap();
		System.out.println();
		rev.arithSwap();
		System.out.println();
		rev.operSwap();
	}
}

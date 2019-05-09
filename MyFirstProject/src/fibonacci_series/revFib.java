package fibonacci_series;

public class revFib {
	public static void fib() {
		int arrsize = 10;
		int fibonacci[] = new int[arrsize];
		for (int i = 0; i < arrsize; i++) {
			if (i == 0) {
				fibonacci[i] = 0;
			} else if (i == 1) {
				fibonacci[i] = 1;
			} else {
				int highestIn = i - 1;
				int secHighestIn = i - 2;
				int newVal = fibonacci[highestIn] + fibonacci[secHighestIn];
				fibonacci[i] = newVal;
			}
			System.out.print(fibonacci[i] + ",");
		}
	}

	public static void main(String[] args) {
		revFib rfib = new revFib();
		rfib.fib();
	}

}

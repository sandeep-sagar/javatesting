package Revision;

public class reviseOfPimeNo {
	public static void primeNo() {
		int prime = 25;
		boolean isPrime = false;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				isPrime = true;
			}
		}
		if (isPrime == true) {
			System.out.print("the given num is not prime");
		} else {
			System.out.print("the given num is prime");
		}
	}

	public static void firstTenPrime() {
		int size = 10;
		int arr[] = new int[size];
		int prime = 1;
		int count = 0;
		while (count < size) {
			boolean primeNum = true;
			if (prime == 1 || prime == 2) {
				arr[count] = prime;
				count++;
			} else {
				for (int i = 2; i < prime; i++) {
					if (prime % i == 0) {
						primeNum = false;
					}
				}
				if (primeNum == false) {
				} else {
					arr[count] = prime;
					count++;
				}
			}
			prime++;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		reviseOfPimeNo rev = new reviseOfPimeNo();
		rev.primeNo();
		System.out.println();
		rev.firstTenPrime();
	}

}

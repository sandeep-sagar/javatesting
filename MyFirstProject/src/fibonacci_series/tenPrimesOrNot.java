package fibonacci_series;

public class tenPrimesOrNot {
	public static boolean primeOrNot(int prime) {
		boolean isprime = false;
		if (prime == 1 || prime == 2) {
		} else {
			for (int i = 2; i < prime; i++) {
				if (prime % i == 0) {
					isprime = true;
				}
			}
		}
		return isprime;
	}

	public static void tenprimes(int size) {
		int count = 0;
		int prime = 1;
		// int size = 10 ;
		int arr[] = new int[size];
		tenPrimesOrNot ten = new tenPrimesOrNot();
		while (count < size) {
			boolean isprime = ten.primeOrNot(prime);
			// this.primeOrNot();
			/*
			 * boolean isprime= false; if(prime == 1 || prime ==2) { arr[count] = prime;
			 * count++; } else { for(int i = 2; i < prime; i++) { if(prime % i == 0) {
			 * isprime= true; } }
			 */
			if (isprime == false) {
				arr[count] = prime;
				count++;
			}
			prime++;
		}
			for (int i = 0; i < size; i++)
				System.out.print(arr[i] + ",");
	}

	public static void main(String[] args) {
		int size = 20;
		tenPrimesOrNot primes = new tenPrimesOrNot();
		primes.tenprimes(size);
		System.out.println();
		primes.tenprimes(15);

	}

}

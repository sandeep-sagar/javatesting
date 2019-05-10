package fibonacci_series;

public class numPrimeOrNot {
	public static void isPrimeOrNot() {
		int prime = 11;
		boolean isPrime = false;
		for(int i = 2; i < prime; i++ ) {
			if(prime % i == 0)
			{
				isPrime=true;
			}
		} if (isPrime == true) {
			System.out.print("The no. is not prime");
		} else {
			System.out.print("The no.is prime");
		}
	}

	public static void main(String[] args) {
		numPrimeOrNot primeOrNot = new numPrimeOrNot();
		primeOrNot.isPrimeOrNot();
	}

}

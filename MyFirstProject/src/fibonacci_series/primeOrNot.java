package fibonacci_series;

public class primeOrNot {
	public static void prime() {
		int isPrimeNo = 13;
		boolean isPrime = true;
		for(int i = 2; i < isPrimeNo; i++) {
			if (isPrimeNo % i == 0) {
				isPrime = false;
			}
		} 
		if (isPrime == false) {
			System.out.print("the given number is not a prime");
		} else {
			System.out.print("the given number is a prime");
		}
	}
	public static void main(String[] args) {
		primeOrNot pOr = new primeOrNot();
		pOr.prime();
	}

}

package fibonacci_series;

public class firstFivePrime {
	public static void fivePrime() {
		int count = 0;
		int prime = 1;
		int size=15;
		int arr[]= new int[size];
		
		while (count < size) {
			boolean isPrime = false;
			if (prime == 1 || prime == 2) {
				arr[count] = prime;
				count++;
				//arr[count] = prime;
			} else {
				for (int i = 2; i < prime; i++) {
					if (prime % i == 0) {
						isPrime = true;
					}
				}
				if (isPrime == true) {
					} else {
					arr[count] = prime;
					count++;
				}
			}
			prime++;
		}
		//System.out.print( arr[count-1]);
		for(int i= 0; i <size ; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		firstFivePrime prime =  new firstFivePrime();
		prime.fivePrime();

	}

}

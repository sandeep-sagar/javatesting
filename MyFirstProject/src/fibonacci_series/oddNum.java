package fibonacci_series;

public class oddNum {
	public static int num;

	public static void oddNumber() {
		// int num= 6;
		if (num % 2 != 0) {
			System.out.print("The given number is odd");
		} else {
			System.out.print("the given number is even");
		}
	}

	public static void oddFuct() {
		int size = 10;
		int oddFunction = 1;
		int count = 0;
		int arr[] = new int[size];
		while (count < size) {
			if (oddFunction % 2 != 0) {
				arr[count] = oddFunction;
				count++;
			}
			oddFunction++;
		}
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + ",");
	}

	public static void getEvenNumber() {
		int evenSize = 10;
		int evenNum = 1;
		int count = 0;
		int arr[] = new int[evenSize];
		while (count < evenSize) {
			if (evenNum % 2 == 0) {
				arr[count] = evenNum;
				count++;
			}
			evenNum++;
		}
		for (int i = 0; i < evenSize; i++)
			System.out.print(arr[i] + ",");
	}

	public static void getPrimeNumber() {
		int primeSize = 10;
		int primeNum = 1;
		int count = 0;
		int arr[] = new int[primeSize];
		while (count < primeSize) {
			boolean isPrime = true;
			if (primeNum == 1 || primeNum == 2) {
				arr[count] = primeNum;
				count++;
			} else {
				for (int i = 2; i < primeNum; i++)
					if (primeNum % i == 0) {
						isPrime = false;
					}
				if (isPrime == false) {
				} else {
					arr[count] = primeNum;
					count++;
				}
			}
			primeNum++;
		}
		for (int i = 0; i < primeSize; i++)
			System.out.print(arr[i] + ",");
	}

	public static void getNumber(String numberType) {
		// numberType = "odd";
		switch (numberType) {
		case "odd":
			System.out.println("odd");
			oddFuct();
			break;
		case "even":
			System.out.println("even");
			getEvenNumber();
			break;
		case "Prime":
			System.out.println("Prime");
			getPrimeNumber();
			break;
		}
	}

	public static void main(String[] args) {
		num = 3;
		oddNum oddN = new oddNum();
		oddN.oddNumber();
		System.out.println();
		oddN.getNumber("odd");
		System.out.println();
		oddN.getNumber("even");
		System.out.println();
		oddN.getNumber("Prime");
	}
}

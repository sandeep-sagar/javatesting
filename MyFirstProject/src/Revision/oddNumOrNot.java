package Revision;

public class oddNumOrNot {
	public static void oddOrNt() {
		int number = 9;
		if (number % 2 == 0) {
			System.out.print("The Number is even");
		} else {
			System.out.print("The number is odd");
		}
	}

	public static void getOddNumber() {
		int oddNo = 1;
		int oddNoSize = 15;
		int count = 0;
		int arr[] = new int[oddNoSize];
		while (count < oddNoSize) {
			if (oddNo % 2 != 0) {
				arr[count] = oddNo;
				count++;
			}
			oddNo++;
		}
		for (int i = 0; i < oddNoSize; i++)
			System.out.print(arr[i] + ",");
	}

	public static void getPrimeNumber() {
		int primeNum = 1;
		int primeSize = 10;
		int count = 0;
		int arr[] = new int[primeSize];
		while (count < primeSize) {
			boolean isprime = false;
			if (primeNum == 1 || primeNum == 2) {
				arr[count] = primeNum;
				count++;
			} else {
				for (int i = 2; i < primeNum; i++)
					if (primeNum % i == 0) {
						isprime = true;
					} 
					if(isprime== true){
					} else {
						arr[count] = primeNum;
						count++;
					}
			}
			primeNum++;
		}
		for (int i = 0; i < primeSize; i++)
			System.out.print(arr[i]+",");
	}

	public static void getNumber(String typeOfNumber) {
		switch (typeOfNumber) {
		case "odd":
			getOddNumber();
			break;
			/*
			 * case "Even": getEvenNumber();
			 */
		case "Prime":
			getPrimeNumber();
			break;
		}
	}

	public static void main(String[] args) {
		oddNumOrNot oddNum = new oddNumOrNot();
		oddNum.oddOrNt();
		System.out.println();
		oddNum.getNumber("odd");
		System.out.println();
		oddNum.getNumber("Prime");

	}

}

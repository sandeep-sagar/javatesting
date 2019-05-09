package fibonacci_series;

public class fibonaci_series {
	public static void fibonaci() {
		int size = 20;
		int fibseries[] = new int[size];
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				fibseries[i] = 0;
			} else if(i == 1) {
				fibseries [i] =1;
			} else {
				int highestIndex = i - 1;
				int secondHighest = i -2;
				int newNum = fibseries[highestIndex]+fibseries[secondHighest];
				fibseries[i]=newNum;
			}
			System.out.print(fibseries[i]+"," );
		}
	}
	public static void main(String[] args) {
		fibonaci_series fib= new fibonaci_series();
		fib.fibonaci();
	}

}

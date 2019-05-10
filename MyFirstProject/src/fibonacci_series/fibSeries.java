package fibonacci_series;

public class fibSeries {
	public static void fib_series() {
		int arraySize = 15;
		int fib[] = new int[arraySize];
		for(int i = 0; i < arraySize ; i++) {
			if(i == 0) {
				fib[i] = 0;
			} else if(i == 1) {
				fib[i] = 1;
				
			} else {
				int highestIndex = i-1;
				int secHighIndex = i-2;
				int newNum = fib[highestIndex] + fib[secHighIndex];
				fib[i] = newNum;
			}
			System.out.print( fib[i] +",");
		}
	}
	public static void main(String[] args) {
		fibSeries fib =  new fibSeries();
		fib.fib_series();
	}
}

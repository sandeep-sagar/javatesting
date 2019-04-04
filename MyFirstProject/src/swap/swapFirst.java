package swap;

public class swapFirst {
	public static void swapWitArithmatic(int a, int b) {
		System.out.println("\n*****Arithmatic opertaor*****");
		System.out.println("originalvalue of a:"+a +"\nOriginal value of b:" +b);
		a = a + b;
		b = a- b;
		a = a - b;
		System.out.println("Changed value of a:"+a + "\nChanged value of b:" +b);
		
	}
	public static void swapWithTemp(int a, int b) {
		int temp;
		System.out.println("\n================ Swap with temp var ===============");
		System.out.println("originalvalue of a:"+a +"\nOriginal value of b:" +b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("Changed value of a:"+a + "\nChanged value of b:" +b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swapFirst swap = new swapFirst(); 
		swap.swapWithTemp(a,b);
		swap.swapWitArithmatic(a,b);
	}
}
package swap;

public class swapFirst {
	public static void swapWithTemp() {
		
		int a = 10;
		int b = 20;
		int temp;
		//temp = a;
		System.out.println("originalvalue of a:"+a +"\n Original value of b:" +b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("Changed value of a:"+a + "\n Changed value of b:" +b);
	}
	
	public static void main(String[] args) {
		swapFirst swap = new swapFirst(); 
		swap.swapWithTemp();
	}
}
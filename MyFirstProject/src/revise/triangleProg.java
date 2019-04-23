package revise;

public class triangleProg {
	public static void triangle() {
		for(int i = 0 ; i<= 3 ; i++) {
			for(int j = 0 ; j<= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangleProg tg= new triangleProg();
		triangleProg.triangle();
	}
}

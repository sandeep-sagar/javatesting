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
	public static void tri() {
		for(int i = 0 ; i<= 3 ; i++) {
			for(int j = 0 ; j<= 3 ; j++) {
				if( i== 3 || j == 0 || j <= i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangleProg tg= new triangleProg();
		triangleProg.triangle();
		System.out.println();
		triangleProg tri = new triangleProg();
		triangleProg.tri();
	}
}

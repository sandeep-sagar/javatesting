package revise;

public class revTriangle {
	public static void tris() {
		for(int i = 0 ; i <= 3 ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				int flag = 0;
				if( j == 0 || i == 0 ) {
					if(flag == 0) {
						System.out.print("*");
						flag=1;
					} else {
						System.out.print("-");
						flag = 0;
					} 
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void rightTriangle() {
		for(int i = 0; i <= 3; i++ ) {
			int flag=0;
			for(int j = 0; j <= 6; j++){
				if(j>= 3-i && j <= 3+i ) {
					if(flag == 0) {
						System.out.print("*");
						flag = 1;
					} else {
						System.out.print("-");
						flag = 0;
					}
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	public static void rhombus() {
		for(int i = 0; i <= 3; i++ ) {
			int flag=0;
			for(int j = 0; j <= 6; j++){
				if( j<= 6-i && j >= i ) {
					if(flag == 0 ) {
						System.out.print("*");
						flag = 1;
					} else {
						System.out.print("-");
						flag = 0;
					}
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		revTriangle rv = new revTriangle();
		for(int i=0 ; i <= 4 ; i++) {
			for(int j = 0 ; j <= 4 ; j++) {
				if(i == 4 || j == 0 || i == j ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				} 
			} 
			System.out.println();
		}
		
		System.out.println();
		rv.tris();
		
		System.out.println();
		rv.rightTriangle();
		
		System.out.println();
		rv.rhombus();
	}
}

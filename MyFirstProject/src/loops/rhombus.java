package loops;

public class rhombus {
	public static void main(String[] args) {
		for(int i=0; i<=6; i++) {
			for(int j=0; j<=6;j++) {
				if( j==3-i || j==3+i || j==i-3 || j==6-(i-3)) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}

}

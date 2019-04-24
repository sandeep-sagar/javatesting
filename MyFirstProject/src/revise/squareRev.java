package revise;

public class squareRev {
	public static void square() {
		for(int i = 0; i <= 4; i++) {
			int flag = 0;
			for(int j = 0; j <= 4; j++) {
				if(i == 0 ||i == 4 || j== 0|| j ==4)
				{
					flag = 1;					
				}
				if(flag == 1) {
					System.out.print("*");
					flag = 0;
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void doubleSquare() {
		for(int i = 0; i <= 6; i++) {
			int flag = 0;
			for(int j = 0; j <= 6; j++) {
				if(flag == 0) {
					System.out.print("*");
					flag = 1;
				} else {
						System.out.print("-");
						flag = 0;
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		squareRev squarerev = new squareRev();
		squarerev.square();
		System.out.println();
		squarerev.doubleSquare();
	}

}

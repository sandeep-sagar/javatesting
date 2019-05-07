package revise;

public class allTriangle {
	public static void Trias() {
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++ ) {
				if(j == 0  || j == i || i == 4 || j == i-1 || j== i-2) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void triang() {
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				if(j == 0 || i == 4 || j == i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void gapTria() {
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				if(j == 4 || i == 4 || j == 4-i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void square() {
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				if (i == 0 || j == 0 || i == 4 || j == 4) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void fullTraing() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 6 ;j++) {
				int middle = 3;
				int start= middle - i;
				int end = middle +  i;
				if (j >= start && j <= end) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void semitrian() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 6 ;j++) {
				if (j >= 3-i && j <= 3+i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void altTriang() {
		for(int i = 0; i <= 3; i++) {
			int flag = 0;
			for(int j = 0; j <= 6; j++) {
				if(j >= 3-i && j <= 3+i) {
					if(flag == 0) {
						System.out.print("*");
						flag = 1;
					} else {
						System.out.print("-");
						flag = 0;
					}
				}else {
						System.out.print("-");
					}
				}
			System.out.println();
		}
	}
	public static void revTriang() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 6; j++) {
				if(j == i || j == 6-i || i==0) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				}
			System.out.println();
		}
	}
	public static void revAltTriang() {
		for(int i = 0; i <= 3; i++) {
			int flag = 0;
			for(int j = 0; j <= 6; j++) {
				if(j == i || j == 6-i || i==0) {
					if(flag == 0) {
						System.out.print("*");
						flag = 1;
					}else {
						System.out.print("-");
						flag = 0;
					}
				}else {
					System.out.print("-");
				}
		}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		allTriangle At = new allTriangle();
		At.Trias();
		System.out.println();
		At.triang();
		System.out.println();
		At.gapTria();
		System.out.println();
		At.square();
		System.out.println();
		At.fullTraing();
		System.out.println();
		At.semitrian();
		System.out.println();
		At.altTriang();
		System.out.println();
		At.revTriang();
		System.out.println();
		At.revAltTriang();
	}
}

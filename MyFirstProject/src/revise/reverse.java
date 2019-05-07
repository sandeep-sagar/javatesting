package revise;

public class reverse {
public static void revTri() {
	for(int i = 0; i <= 3; i++) {
		for(int j = 0; j <= 6; j++) {
			int end = 6;
			int start = end - i;
			if(j <= start && j >= i) {
				System.out.print("*");
			}else {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
	public static void revAltTri() {
		for(int i = 0; i <=3; i++) {
			int flag = 0;
			for(int j = 0; j <= 6;j++) {
				if(j <= 6-i && j >= i) {
					if(flag== 0) {
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
		reverse rev = new reverse();
		rev.revTri();
		System.out.println();
		rev.revAltTri();		
	}

}

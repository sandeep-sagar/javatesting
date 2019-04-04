package loops;

public class numeric {

	public static void main(String[] args) {
		int a=1;
		for(int i=0; i<=6; i++) {
			int flag = 0;
			for(int j=0; j<=6; j++) {
				if(flag == 0) {
					System.out.print(a);
					a++;
					flag = 1;
				} else {
					System.out.print("-");
					flag = 0;
				}
			}
			System.out.println();
		}
	}
}

	
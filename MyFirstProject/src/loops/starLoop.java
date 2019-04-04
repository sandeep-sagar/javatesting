package loops;

public class starLoop {

	
	public static void main(String[] args) {
		int a= 15;
		for(int i=0; i<=4; i++) {
			int flag = 0;
			//System.out.println("i = " + i  + " ");
			for(int j=0; j<=8; j++) {
				//System.out.println ("j = " + j  + " ");
				if(j>=4-i && j<=4+i) {
					if (flag == 0) {
						System.out.print(a);
						flag = 1;
						a--;
					} else {
						System.out.print("-");
						flag = 0;
					}
					
				} else {
					System.out.print("-");
				}
			}
			System.out.print("\n");
		}
	}
}

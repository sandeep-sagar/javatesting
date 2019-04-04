package loops;

public class rhombusNumeric {
	public static void main(String[] args) {
		//int a[]= {1,2,3,4,5,6,7};
		int a= 1, b= 12;
		//int b[]= {0,12,11,10,9,8};
	
		
		for(int i=0; i<=6; i++) {
			for(int j=0; j<=6;j++) {
				if( j==3-i ||j==i-3) {
					//|| j==3+i || j==i-3 || j==6-(i-3)) {
					System.out.print(a);
					a++;
				} /*else if() {
					System.out.print(b);
					b++;
				} */
				else if(j==3+i || j==6-(i-3)) {
					System.out.print(b);
					b--;
				} /*else if(j==3+i) {
					System.out.print(d);
					d--;
				}*/
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}

}

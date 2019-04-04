package loops;

public class doubleLoop {

	public static void main(String[] args) {
			for(int i=0; i<=8; i++){
				int flag=0;
				for(int j=0; j<=8 ;j++) {
					int a=i-4;
					if(i>=4 && j>= a && j <= 8-a) {
						//System.out.println(" i = " + i + "; j = " + j);
						if(flag==0) {
							System.out.print("*");
							flag=1;
						} else {
							System.out.print("-");
							flag=0;
						}
					} else if(i<=4 && j>=4-i && j<=4+i ) {
						if(flag==0) {
							System.out.print("*");
							flag=1;
						} else {
							System.out.print("-");
							flag=0;
						}
					} else {
						System.out.print("-");	
			    }
			 }
				System.out.println("");
		  }
      }
}
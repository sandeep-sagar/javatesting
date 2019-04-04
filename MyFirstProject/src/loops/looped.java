package loops;

public class looped {
	public static void main(String[] args) {
		
		
		for(int i= 0 ; i<=4; i++) {
			for(int j= 0 ; j<=4-i; j++) 
			{
				if(i==0 || j==0 ||j==4-i)
				System.out.print("*");
			else
			System.out.print("-");	
			}
			System.out.println("");	
		}
	}
}


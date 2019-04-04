package loops;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop loop = new loop();
		loop.ifLoopFunction();
		loop.switchFunction();
		loop.forFunction();
	}

	private void forFunction() {
		// TODO Auto-generated method stub
		int i = 1;
		for ( i = 1; i <= 10; i++) {
			System.out.println("\nValue = " + i);
			++i;
			System.out.println("Value = " + i);
		}
	}

	private void ifLoopFunction() {
		// TODO Auto-generated method stub
		int iVar = 10;
		int iVar2 = 10;
		if ( iVar == iVar2) {
			System.out.println(" Both Variable are equal");
		} else {
			System.out.println(" Both Variable are Diff");
		}
	}
	
	private void switchFunction() {
		int number=60;  
		int variable = 3;
	    //Switch expression  
	    switch(number) {  
		    //Case statements  
		    case 10: 
		    	System.out.println("10"); 
		    	switch (variable) {
			    	case 1 :
		    		case 2 :
		    		case 3 :
		    			System.out.println("1-3");
		    		break;
			    	case 4 :
		    			System.out.println("4");
		    		break;
		    		
		    	}
		    break;  
		    case 20: 
		    	System.out.println("20");  
		    break;  
		    case 30: 
		    	System.out.println("30");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not in 10, 20 or 30"); 
	    }
	}
}

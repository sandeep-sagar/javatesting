package Inheritance;

public class onlineBanking extends banking {

	public static void main(String[] args) {
		onlineBanking on = new onlineBanking();
		on.fixedDeposit("shweta@yahoo.com");
		
		on.savingAccount(52658698);
		on.deposit(50000);
		
		on.deposit(50000,20000);
		
	}

	
	public void deposit(int jvar) {
		System.out.println("Enter the amount u want to depsit:"+jvar);
	}
		
		
		public void deposit(int jvar,long t) {
			System.out.println("Enter the amount u want to depsit:"+jvar +" secondvar="  + t);
		
	}
}

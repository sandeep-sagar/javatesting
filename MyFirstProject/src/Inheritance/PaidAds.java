package Inheritance;

public class PaidAds extends FreeAds {

	public static void main(String[] args) {
		PaidAds p = new PaidAds();
		p.AddDescrption("New offer");
		p.AddDescrption(10,20);
		p.AddContactNumber("8050479605");
		p.AddEmailID("shweta@gmail.com");
		p.Manager("Shweta");
		p.PageName("Homepage");
		
		

	}
	
	private void PageName(String Name) {
		this.AddDescrption("New offer");
		super.AddDescrption("New offer");
		System.out.println("PageName:"+Name);
		
	}

	public void Manager(String Mgr) {
		System.out.println("Manager:"+Mgr);
		
	}
	
	//This is example of overloading
	public void AddDescrption (int iVariable) {
		System.out.println("This child is Int Method = " + iVariable);
	}
	
	public void AddDescrption (int iVariable, int iVariableSecond) {
		System.out.println("This child is Int Method = " + iVariable + " iVariableSecond = " + iVariableSecond);
	}
	
	//This is example of overriding
	 public void AddDescrption(String Description) {
		System.out.println("This is Child Method : Yor Description:"+Description);
	}
}

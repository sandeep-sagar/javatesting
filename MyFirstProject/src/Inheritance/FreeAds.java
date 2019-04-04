package Inheritance;

public class FreeAds {
	
	
	protected void AddDescrption(String Description) {
		System.out.println("This is Parent Method : Yor Description:"+Description);
		this.AddContactNumber("1000");
	}
	
	public void AddContactNumber(String Number) {
		System.out.println("ContactNumber:"+Number);
	}
	public void AddEmailID(String EmailD) {
		System.out.println("Email ID:"+EmailD);
		
	}

}

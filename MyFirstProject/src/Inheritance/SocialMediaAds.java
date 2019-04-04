package Inheritance;

public class SocialMediaAds implements myFirstInterface {

	public void myFunctionn() {
		System.out.println("My Function");
	}
	public void myAbstractFunction() {
		System.out.println("My Abstract Function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMediaAds oSocialMedia = new SocialMediaAds();
		oSocialMedia.myFunctionn();
		oSocialMedia.myAbstractFunction();
		System.out.println("ContactNumber:");
	}
	public void AddContactNumber(String Number) {
		System.out.println("ContactNumber:"+Number);
	}
}

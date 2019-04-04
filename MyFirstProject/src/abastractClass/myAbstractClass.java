package abastractClass;

public abstract class myAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Abstract Class");
		
	}
	public abstract void myFunction () ;
	public void myNonAbstractFunction() {
		System.out.println("My Non Abstract Function");
	}
	public static void myStaticFunction() {
		System.out.println("In My Static Function of Interface");
	}
	public void myDefaultFunction() {
		System.out.println("In My Default Function of AbstractClass");
	}
	/*
	public default void myDefaultfunction() {
		
	}
	*/
}

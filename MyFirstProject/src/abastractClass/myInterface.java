package abastractClass;

public interface myInterface {
	int variableIterface = 20;
	static int sVariableIterface = 10;
	final int fVariableIterface = 30;
	public void myFunctionInterface();
	public abstract void myAbstractFunction();
	public static void myStaticFunctionInterface() {
		System.out.println("In My myStaticFunctionInterface of Interface");
	}
	public default void myDefaultFunctionInterface() {
		System.out.println("In My myDefaultFunctionInterface of Interface");
	}
}

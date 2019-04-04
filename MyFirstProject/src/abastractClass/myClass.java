package abastractClass;

public class myClass extends myAbstractClass implements myInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass mClass = new myClass();
		mClass.myFunction();
		mClass.myNonAbstractFunction();
		mClass.myAbstractFunction();
		mClass.myFunctionInterface();
		//mClass.myStaticFunctionInterface();
		
	}
	
	

	@Override
	public void myFunction() {
		
		// TODO Auto-generated method stub
		System.out.println("My Function = " + fVariableIterface);
	}

	@Override
	public void myAbstractFunction() {
		// TODO Auto-generated method stub
		System.out.println("My myAbstractFunction Function = " + variableIterface);
	}

	@Override
	public void myFunctionInterface() {
		// TODO Auto-generated method stub
		System.out.println("My myFunctionInterface Function");
		
	}
	
}

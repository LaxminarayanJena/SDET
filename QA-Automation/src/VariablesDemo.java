
public class VariablesDemo {

/*
 * a)Local variable-created at beginning of method execution and destroyed at end of method
 * execution
 * 
 * visible only in the method or block where it is destroyed
 * 
 * b)instance/member variable-created when an object is created and destroyed when the object is garbage collected
 * visible to all the methods in the class and created per each object of class
 * 
 * 
 * 
 * c)class/static variable-created when program starts(loaded by jvm) and destroyed when the program quits
 * visible to all the methods in the class and created per class
 * 
 * 
 * 
 * 
 * 
 */
	//int a =20;// instance variable
	static int a=10; //static variable
	private void method1()
	{
		int a=10; //local variable
		
		//System.out.println("value of a in method1-"+a);
		//System.out.println("value of this.a in method1-"+this.a);
		this.a=30;
	}
	private void method2()
	{
		
		System.out.println("value of a in method2-"+a);
	}
	
	public static void main(String[] args) {
		VariablesDemo demo1= new VariablesDemo();
		demo1.method1();
		demo1.method2();
		
		VariablesDemo demo2= new VariablesDemo();
		demo2.method2();
				
	}
	

}

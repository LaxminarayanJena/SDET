
public class PassByValue {

	
	/*
	 * java is always pass by value which means it copies the arguments(but not pass the original variables)
	 * There are 2 types of variables u can pass to the methods,primitives and reference variables(both are pass by value)
	 * 
	 * 
	 * stack and the heap are two primary memory areas used by JVM
	 * STACK- methods and local variables stored n stack
	 * heap-object and instance variable are stored in heap
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		long id=111;//id is a primitive variable
		Report rep= new Report();//rep is a reference variable
		
		incrementId(id);//passing primitive value
		System.out.println("after caliing incrementid:"+id);
		
		
		updateTitle1(rep);//passing reference variable
		System.out.println("after caliing updatetile1:"+rep.title);
		
		
	}
		static void incrementId(long id)
		{
			id =id+1;
		}
		
		static void updateTitle1(Report rep)
		{
			//rep= new Report();  //op-original
			rep.title="copy";
			
		}
		
		
		
	}




public class CompileTimeAndRunTime {

	public static void main(String[] args) {
		
		//Email em =  null;
		//java.lang.NullPointerException
		Email em = new Email();
		em.generateAndSend();
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(args[0]);
		//firstarg in args 
		
		//-Xmx1m
		int size=10;
		while(true)
		{
			int i[]= new int[size];
			System.out.println(i.length);
			size=size*10;
		}
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

	}

}

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	
	/*ArrayList is an implementation of java.util.list.interface
	 * arraylist is backed by an array
	 * it grows dynamically when we add more elements
	 * provides various methods to work with elements
	 * array is fixed size and can be multidimensional-2d 3d
	
	 */

	public static void main(String[] args) {
	/*	ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");    
	      //Invoking arraylist object   
	      System.out.println(list);  
	      
	      */
		
		String[] allcodes= {"001","002","003","004","005","006"};
		String[] assignedcodes= {"004","005"};
		
		List<String> list1= new ArrayList<String>(Arrays.asList(allcodes));
		List<String> list2= new ArrayList<String>(Arrays.asList(assignedcodes));
		list1.removeAll(list2);
		
		
		System.out.println(list1);
		
		
		//String[] unassignedCodes= getUnsassignedCodes(allcodes, assignedcodes);
		//System.out.println(Arrays.toString(unassignedCodes));
		

	}
	
	/*
	static String[] getUnsassignedCodes(String[] allcodes,String[] assignedcodes)
	{
		List<String> list1= new ArrayList<String>(Arrays.asList(allcodes));
		List<String> list2= new ArrayList<String>(Arrays.asList(assignedcodes));
		list1.removeAll(list2);
		return list1.toArray(new String[list1.size()]);
		
		
	}
	
	*/

}

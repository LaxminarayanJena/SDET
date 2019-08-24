package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	//position of duplicate character
	//total no of duplicate character

	public static void main(String[] args) {
		String s="hello world lokl";
		char[] chararray=s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		//hashset is implementation of set interface
		
		int ctr=0;
		for(int i=0; i<chararray.length;i++)
		{
			if(!set.add(chararray[i]))
			{
				System.out.println("index of duplicate char-" + chararray[i]+" " +i);
				ctr++;
			}


		}
		
		System.out.println("total no of duplicate characters"+ ctr);
		

	}

}

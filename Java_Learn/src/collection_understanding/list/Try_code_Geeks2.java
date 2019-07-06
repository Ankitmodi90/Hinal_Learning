package collection_understanding.list;

import java.util.ArrayList;
import java.util.List;

public class Try_code_Geeks2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		 list.add("Geeks"); 
	        list.add("Practice"); 
	        list.add("Contribute"); 
	        list.add("IDE"); 
	        list.add("Courses"); 
	        
	        System.out.println(list);
		
		String[]  str = new String[3];
		
		str[0] = "abc";
		str[1] = "abc";
		str[2] = "abc";
		str[0].toCharArray();
		
		for (String string : str) {
			System.out.println(string);
		}
		
		
		
		List[]  str1 = new List[3];
		
		str1[0] = list;
		str1[1] = list;
		str1[2] = list;
		
				for (List listelement : str1) {
					System.out.println(listelement);
				}
				
		int [] l= new int[] {1,2,3,4};
	}
}

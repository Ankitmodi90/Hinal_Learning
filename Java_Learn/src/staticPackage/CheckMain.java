package staticPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckMain {

	public static void main(String[] args) {
		
		// create an ArrayList Object list 
        List<Integer> list = new ArrayList<>(); 
  
        // add element in ArrayList object list 
        list.add(44); 
        list.add(11); 
        list.add(22); 
        list.add(33); 
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Collections.min(list));
        
        List <Integer> sl= new ArrayList<>(list);
        System.out.println(sl);
        
        Collections.sort(sl);
        
        System.out.println(sl);
        
        
        
		
	}
}

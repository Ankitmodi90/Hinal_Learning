package collection_understanding.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Check_1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i =0 ; i<10;i++)
		{
			list.add(i);
		}

//		list.add(5, 100);
//		list.set(5, 100);

		list.add(10, 1000);
//		list.add(1000);
		
//		list.remove(3);

//		System.out.println(list);
		
		for (int i= 0 ;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		/*List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(list);
		list1.addAll(5, list);
		System.out.println(list1);*/
		
		
		


	}

}

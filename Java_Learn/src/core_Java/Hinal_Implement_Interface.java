package core_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Hinal_Implement_Interface extends ArrayList<Integer>{
	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		for(int i =100 ; i<=110 ; i++)
		{
			l1.add(i);
		}
		System.out.println("list l1 = " +l1);

		ArrayList<Integer> l2= new ArrayList<>();
		for(int i =105 ; i<=110 ; i++)
		{
			l2.add(i);
		}
		System.out.println("list l2 = " +l2);


/*		Hinal_Implement_Interface l3 = new Hinal_Implement_Interface();

		for(int i =100 ; i<=110 ; i++)
		{
			l3.add(i);
		}
		System.out.println("list l3 = " +l3);*/
		System.out.println(l2.remove(new Integer(105)));
//		l2.add(7, 12);
//		System.out.println(l2);
//		l2.remo

//Object [] a= l1.toArray();
//for(Object i1: a)
//{
//	System.out.println(i1);
//}
//l1.addAll(0,l1);
//System.out.println(l1);
	}
}


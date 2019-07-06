package core_Java;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Check_Json {
	
	private static DecimalFormat df2 = new DecimalFormat("#.#");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "75";
//		String b = "2";
//		
//		Double calculated = Double.parseDouble(a) / Double.parseDouble(b);
//		System.out.println(df2.format(calculated));
////		System.out.println((calculated));
		
//	Double a =(double) 230;
//	Double b = (double) 3;
//	
//	Double c = a/b;
//	int d = (int) Math.round(c);
//	System.out.println(d);
//	System.out.println(c);
//	System.out.println(df2.format(c));
	
		Double sum = 0.00;
		String a = "5+25";
		System.out.println(a);
//		a = a.replace('+', ',');
//		System.out.println(a);
		Character b ='+';
		String array[] = a.split("\\+");
		
		for(int i =0;i <array.length;i++)
		{
			sum+=Double.parseDouble(array[i]);
		}
		
		System.out.println(sum);
			
		

	}

}

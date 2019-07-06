package core_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Try_1 {
	
	public static void main(String[] args) {/*
		
		Random random = new Random();
		
		System.out.println(random.nextInt(50));
		
		List<String> list = new ArrayList<>();
		
		String a = "5";
		String b = "2";
		
		String str = "5.23";

		list.add(str);
		list.add("5,5.00".replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1").replaceAll(",", ""));
		list.add("10");
		
		System.out.println(list);
		
		Integer amount = Integer.valueOf(a)*Integer.valueOf(b);
		System.out.println(amount);
		
		System.out.println(list.contains(Integer.toString(Integer.valueOf(a)*Integer.valueOf(b)))
				);
		
		String a = "3,000.00";
		String b = "500.00";
		String c = "125.00";
		String d = "25.00";
		String e = "350.00";
		String f = "200.56";
		String g = "50.56";
		String h = "150.00";
		
//		b = b.replaceAll(",", "");
//		b = b.replaceAll("$.00", "");
		b = b.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
		System.out.println(b);
		
		list.add(a.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(b.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(c.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(d.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(e.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(f.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(g.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		list.add(h.replaceAll(",", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
		
		System.out.println(list);
		
		String calculatedConversionRate = "0.86378";
		Double sumAmount = (double) 1880;
		System.out.println(sumAmount / Double.parseDouble(calculatedConversionRate));
		
		int totalAmountEuroInt= (int) Math.round(sumAmount / Double.parseDouble(calculatedConversionRate));
		System.out.println(totalAmountEuroInt);
		
		int a = 10;
		int b = 20;
		
//		a += b;
		b = (a+b)-(a=b);
//		a -= b;
		System.out.println("a: " + a +" b : " + b);
		
		
	*/
	
	/*	int a = 6;
		if(!(a!=-1))
		{
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}*/
		
		int a =-1;
		boolean flag = false;
		
		for (int i =2 ; i<a;i++)
		{
			if(a%i==0)
			{
				flag = true;
			}
		}
		
		if(!flag)
			System.out.println(a +" is a prime");
		else
			System.out.println(a +" is not a prime");
		
	}

}

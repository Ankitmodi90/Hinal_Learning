package core_Java;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Try {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		String date1 = "-7";
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfDate  = new SimpleDateFormat("M/d/yy");
		setTimeZone(sdfDate, "UTC");
		cal.add(Calendar.DATE, Integer.parseInt(date1));
		System.out.println(sdfDate.format(cal.getTime()));
		
		System.out.println(LocalDateTime.now());*/
//		LocalDateTime.now().

	
		
		/*
		String st = "55.50 USD";
		String result = st.split(" ")[0];
		
			System.out.println(result);
			
			String a = "abc";
			String b = "abc";
			
			if(a!=null && !a.equalsIgnoreCase(b))
			{
				System.out.println("def");
			}
			else {
				System.out.println("abc");
			}*/
		
		String amountItem1= "200.56";
		String amountItem2 = "500";
		String amountItem3 = "3000" ;
		String taxPercentage= "6.25";
		/*	Double a = 32.857;
		Double b = 32.86;
		Double c = 32.84;
		
//		System.out.println(df2.format(a));
//		System.out.println(df2.format(b));
//		System.out.println(df2.format(c));
		
		String a1 = df2.format(a);
		
		System.out.println(a1);
		
		Double value1 = Double.parseDouble(a1);
		
		value1 = value1-0.1;
		
//		System.out.println(value1);
		
		Double equallyDividedValueAdd = Double.parseDouble(df2.format(a))+0.1;
		Double equallyDividedValueSub = Double.parseDouble(df2.format(a))-0.1;
		
		System.out.println(df2.format(equallyDividedValueAdd));
		System.out.println(df2.format(equallyDividedValueSub));
		
		Double employee = 34.32;
		if(df2.format(a).equalsIgnoreCase(df2.format(employee )) || df2.format(equallyDividedValueAdd).equalsIgnoreCase(df2.format(employee)) || df2.format(equallyDividedValueSub).equalsIgnoreCase(df2.format(employee)))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
*/
		Double sumValue = Double.parseDouble(amountItem1) * 1.5 + Double.parseDouble(amountItem2) + Double.parseDouble(amountItem3);
		
		Double calculateAmountTax = (sumValue *  Double.parseDouble(taxPercentage))/(Double.parseDouble(taxPercentage) + 100);
		System.out.println(sumValue);
		System.out.println(df2.format(calculateAmountTax));
		
		Double val = sumValue * 1.33544;
		System.out.println(df2.format(val));
		int a = (int) Math.round(val);
		System.out.println(a);
		
		String aString = String.valueOf(a-1);
		System.out.println(aString);
		
		String str ="3,600";
		
		str = str.replaceAll(",", "");
		System.out.println(str);
		
		
		if (str.replaceAll(",$", "").contains("3600")) {
			System.out.println("True");
		}
	}

	private static SimpleDateFormat setTimeZone(SimpleDateFormat sdf, String timeZone) {
		// TODO Auto-generated method stub

		System.out.println(("Setting time zone of parsed simple date format object to "+timeZone));
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf;
	
	}

}

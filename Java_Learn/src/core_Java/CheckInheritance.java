package core_Java;

import java.text.DecimalFormat;

public class CheckInheritance {

	public static void main(String[] args) {
		String taxPercentage = "6.25";
		String taxAmount = "29.41";
		String amount = "500";
		DecimalFormat df = new DecimalFormat("###.##");
		Float amountFloat = Float.parseFloat(amount);
		Float taxPercentageFloat = Float.parseFloat(taxPercentage);
		
		System.out.println(amountFloat);
		System.out.println(taxPercentageFloat);
		
		Double calculateAmountTax = (Double.parseDouble(amount)*  Double.parseDouble(taxPercentage))/106.25;
		calculateAmountTax  = Double.valueOf(df.format(calculateAmountTax));
//		info(Float.toString(calculateAmountTax));
		System.out.println(calculateAmountTax);
		System.out.println(Double.toString(calculateAmountTax));
		
		
	}
}

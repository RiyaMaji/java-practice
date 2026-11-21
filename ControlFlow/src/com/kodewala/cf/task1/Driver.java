package com.kodewala.cf.task1;
/**
 * Develop a mmt discount module
 * 1.If fare is 5K and below , no discount applied.
 * 2.If fare is betwn 5K to 10K then 10% of total fare as a discount
 * 3.If fare is more than 10K then 15% disc.
 * 4.Maximum discount per cs is 1250 only.
 * Follow naming convention
 * write proper class,method
 * code should be readable with proper java comments
 */
public class Driver {

	public static void main(String[] args) {
		DiscountModule dm = new DiscountModule();
		
		double finalPrice = dm.discountStatus(-20);
		System.out.println("Final Price is : " + finalPrice);
	}

}

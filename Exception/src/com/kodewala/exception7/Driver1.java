package com.kodewala.exception7;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver1.main()..start");
		try {
			int amount = 100/0;
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		/*finally {
			String number = "vdyhgd";
			System.out.println(Integer.parseInt(number));
			System.out.println("Executing finally..");
		}*/
		finally {
		      try {
				String name = null;
				System.out.println(name.length());
		      }catch(Exception e) {
		    	  System.err.println("Name cannot be null");
		      }
		      System.out.println("Executing finally..");
		}
		System.out.println("Driver1.main().end");
	}

}

package com.kodewala.exception7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws Exception {
		String fileName = "text.xls";

		//FileOutputStream fis = null;
		try (FileOutputStream fis = new FileOutputStream(new File(fileName))){
			//fis = new FileOutputStream(new File(fileName)); //creating connection with file system
			//100 lines biz logic
			String name = null;
			name.charAt(0);
			}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();

		}
		
		/*finally {
			System.out.println("Closing the connection");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Closing the connection...closed");
		}*/
		
	}

}

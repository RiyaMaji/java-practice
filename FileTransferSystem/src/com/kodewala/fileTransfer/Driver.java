package com.kodewala.fileTransfer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {
	public static void transferFile(Object obj, boolean isAdmin) throws Exception {
		if(!(obj instanceof TransferPermission))
			System.err.println("Permission Denied!!");
		else if(obj instanceof AdminFile && !isAdmin)
			System.err.println("Only Admin can transfer this file!!!");
		else {
			
			FileOutputStream fos = new FileOutputStream("Perm.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			System.out.println("File Tranferred succesfully!!");
		}
			
	}
	public static void main(String[] args) throws Exception {
		PublicFile publicFile =
                new PublicFile("Report.pdf");

        PrivateFile privateFile =
                new PrivateFile("Salary.pdf", "Confidential Data");

        AdminFile adminFile =
                new AdminFile("AdminData.pdf");
        
        
     // Public File
        System.out.println("Public File:");
        transferFile(publicFile, false);
        System.out.println("--------");
     // Private File
        System.out.println("Private File:");
        transferFile(privateFile, false);
        System.out.println("--------");
        // Admin File - Normal User
        System.out.println("Admin File - Normal User:");
        transferFile(adminFile, false);
        System.out.println("--------");
        // Admin File - Admin User
        System.out.println("Admin File - Admin User:");
        transferFile(adminFile, true);
        
	}

}

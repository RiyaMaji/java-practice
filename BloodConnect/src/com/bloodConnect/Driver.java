package com.bloodConnect;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		Address address1 = new Address("Delhi-NCR", "Delhi");
		Employee emp1 = new Employee(5, "Atulya", address1, "rtyns");
		
		//shallow cloning
		Employee emp2 = (Employee) emp1.clone();
		//Updating cloned object's address
		emp2.getAddress().setCity("Pune");
		
		System.out.println("Original Employee after shallow cloning:");
		emp1.display();
		System.out.println("----------------");
		System.out.println("Cloned Employee:");
        emp2.display();
        
        //deep cloning 
        Employee emp3 = emp1.deepClone();
        //updating deep cloned objects address
        emp3.getAddress().setCity("Mumbai");
        System.out.println("---------------------");
        System.out.println("After deep cloning..");
        System.out.println("Original Employee");
        emp1.display();
        System.out.println("---------------------");
        System.out.println("Deep cloned Employee");
        emp3.display();
        
        //serialization
		FileOutputStream fos = new FileOutputStream("Employeed.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
        oos.close();
        System.out.println("Object Serialized...");
	}

}

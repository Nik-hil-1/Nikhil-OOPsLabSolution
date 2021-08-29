package com.gl.itsupportadmin.main;

import java.util.*;
import com.gl.itsupportadmin.pojo.*;
import com.gl.itsupportadmin.service.*;

public class Driver {
	
    public static void main(String[] args) {
	    String department="";
	    Employee employee = new Employee("Nikhil", "Kumar");
	    System.out.println("Please enter the department from the following:");
	    System.out.println("1. Technical"+"\n2. Admin"+"\n3. Human Resource"+"\n4. Legal"+"\n\n Press 0 to exit\n");
	  
	    Scanner sc = new Scanner(System.in);
	    int opt = sc.nextInt();
	    sc.close();
	    Service service = new Service();
	    switch(opt) {
		  
	        case 0:
	    	    System.out.println("Terminated Successfully");
        	    System.exit(0);
	    	    break;
		    	
	        case 1:
	    	    department = "Technical";
	    	    break;
		    	
	        case 2:
	    	    department = "Admin";
	    	    break;
		    	
	        case 3:
	    	    department = "HR";
	    	    break;
		    	
	        case 4:
	    	    department = "Legal";
	    	    break;
		    	
	        default:
	    	    if(opt > 4)
	    	        System.out.println("Please enter valid option");
	    	        System.exit(0);
	    	     break;
		  }
	  
	      service.showCredentials(employee, department);
	  
    }
}

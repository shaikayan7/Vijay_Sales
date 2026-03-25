package com.logicalStatment;

import java.util.Scanner;

public class VijaySales {

	public static void main(String[] args) {
		
	
	System.out.println("Welcome to Vijay Sales");
	Scanner sc=new Scanner(System.in);
	
	String yn=" ";
	

	int total=0;
	int price=0;
	do {
		System.out.println("Enter catagory");
		String catg=sc.next();
		
		switch(catg) 
		{
		/*first catagory*/
		   
		  case"laptop"->{
			System.out.println("Enter Item");
		    String item=sc.next();
		    
		    
		    switch(item) {
		    case "dell"->{
		    	price=25000;
		    	System.out.println("thank you for purshaing the dell");
		    	System.out.println("Price :"+price);
		    	total=total+price;
		     }
		    case "lenovo"->{
		    	price=45000;
		    	System.out.println("thank you for purshaing the lenovo");
		    	System.out.println("Price :"+price);
		    	total=total+price;
		     }
		    case "asus"->{
		    	price=35000;
		    	System.out.println("thank you for purshaing the asus");
		    	System.out.println("Price :"+price);
		    	total=total+price;
		     }
		    case "hp"->{
		    	price=65000;
		    	System.out.println("thank you for purshaing the asus");
		    	System.out.println("Price :"+price);
		    	total=total+price;
		     }
		     default->System.out.println("invalid value");
		    }
		  
           
		  }
		  /*second catagory*/
		  case "tv"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "lg"->{
			    	price=20000;
			    	System.out.println("thank you for purshaing the lg");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "sony"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the sony");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "google"->{
			    	price=55000;
			    	System.out.println("thank you for purshaing the google tv");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "reconnect"->{
			    	price=35000;
			    	System.out.println("thank you for purshaing the asus");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }
		  
		  /* third catagory*/
		  case "Ac"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "lg"->{
			    	price=20000;
			    	System.out.println("thank you for purshaing the lg");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "sony"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the sony");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "google"->{
			    	price=55000;
			    	System.out.println("thank you for purshaing the google tv");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }
		  /*Fourth catagory*/
		  case "washing-machine"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "lg"->{
			    	price=8000;
			    	System.out.println("thank you for purshaing the lg");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "whirlpool"->{
			    	price=15000;
			    	System.out.println("thank you for purshaing the whielpool");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "samsung"->{
			    	price=7000;
			    	System.out.println("thank you for purshaing the Samsung");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "voltus"->{
			    	price=7500;
			    	System.out.println("thank you for purshaing the Voltus");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "croma"->{
			    	price=10000;
			    	System.out.println("thank you for purshaing the croma");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }
		  /*fivth catagory*/
		  case "refrigerator"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "lg"->{
			    	price=20000;
			    	System.out.println("thank you for purshaing the lg");
			    	total=total+price;
			     }
			    case "sony"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the sony");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "voltus"->{
			    	price=55000;
			    	System.out.println("thank you for purshaing the voltus");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "5star"->{
			    	price=5000;
			    	System.out.println("thank you for purshaing the 5star");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "whirlpool"->{
			    	price=14000;
			    	System.out.println("thank you for purshaing the whirlpool");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }
		  /*sixth catagory*/
		  case "Airpods"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "oppo"->{
			    	price=15000;
			    	System.out.println("thank you for purshaing the oppo");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "apple"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the apple");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "boat"->{
			    	price=3000;
			    	System.out.println("thank you for purshaing the boat");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			    }
			    
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }
		  /*seventh catagory*/
		  case "mobile"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "samsung"->{
			    	price=70000;
			    	System.out.println("thank you for purshaing the Samsung");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "iphone"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the iphone");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "pixel"->{
			    	price=55000;
			    	System.out.println("thank you for purshaing the Pixel");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "oppo"->{
			    	price=37000;
			    	System.out.println("thank you for purshaing the oppo");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			    }
			     
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }	  
		  
		  /*eigth catagory*/
		  case "speaker"->{
			  System.out.println("Enter Item");
			    String item=sc.next();
			    
			    switch(item) {
			    case "samsung"->{
			    	price=50000;
			    	System.out.println("thank you for purshaing the Samsung");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "lg"->{
			    	price=45000;
			    	System.out.println("thank you for purshaing the LG");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "sony"->{
			    	price=55000;
			    	System.out.println("thank you for purshaing the Sony");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			     }
			    case "boat"->{
			    	price=37000;
			    	System.out.println("thank you for purshaing the boat Speaker");
			    	System.out.println("Price :"+price);
			    	total=total+price;
			    }
			     
			      default->System.out.println("invalid value");
			    
			    }
			  
	         }	  
		  
		  
		  default -> System.out.println("ENtered Category is invalid");
		}
		System.out.println("Total price:"+total);
		System.out.println("Do you want to procedd click Y or n ..?: ");
		yn = sc.next();

	  }while (yn.equalsIgnoreCase("y"));
	sc.close();
	System.out.println("Thank You!! Vist Again");

	}

}

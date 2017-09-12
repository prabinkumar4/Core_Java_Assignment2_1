package assignment2;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;    // variable declaration
		
		Scanner sc= new Scanner(System.in);          // Scanner class initiation
		
		
		System.out.print("Enter the integer value of a: " );  // print "Enter the integer vale of a:"
		
	    a=sc.nextInt();                               //accepts value of variable a from user
	    
	    System.out.print("Enter the integer value of b: " );   // print "Enter the integer vale of b:"
	    
	    b=sc.nextInt();                                //accepts value of variable b from user
		
		
       System.out.print("Enter the integer value of c: " );   // print "Enter the integer vale of c:"
	    
	    c=sc.nextInt();                                //accepts value of variable b from user	
	    
	    
	    if(a>b && a>c) {
	    	System.out.print(a+ " is larger than " + b + " and " + c );   // print the value of a when it is greater among a,b and c.
	    }
	   
	    if(b>a && b>c) {
		    System.out.print(b+ " is larger than " + a + " and " +c );   // print the value of a when it is greater among a,b and c.
		   
	   }
	    
		if(c>a && c>a) {
		    System.out.print(c+ " is larger than " + a + " and " +b );   // print the value of a when it is greater among a,b and c.
		    		
	    	sc.close();
	    	
	    	
	   }
		
	}

}

package day13;

public class Program04 {

	   public static void main (String[] args)
	   {		
	       int prime =1;
	       int num =1;
	       System.out.println("Prime numbers from 1 to 100 are :");
	       
	       for (prime = 1; prime <= 100; prime++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =prime; num>=1; num--)
			  {
		         if(prime%num==0)
			     {
		        	 counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     System.out.print(prime + " ");
			  }	
	      }	
	   }
	}   
			

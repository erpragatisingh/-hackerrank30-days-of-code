package day.four;

import java.util.Scanner;

public class ConditionalStatements {

	public ConditionalStatements() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
//	      If  is odd, print Weird
//	      If  is even and in the inclusive range of 2 to 5, print Not Weird
//	      If  is even and in the inclusive range of 6 to 20, print Weird
//	      If  is even and greater than 20, print Not Weird
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else if(n%2==0 && (n>=2 && n<=5)){
	         // Complete the code 
	    	  ans="Not Weird";
	      }
	      else if(n%2==0 && (n>=6 && n<=20)){
		         // Complete the code 
		    	  ans="Weird";
		      }

	      else if(n%2==0 && n>20){
		         // Complete the code 
		    	  ans="Not Weird";
		      }
	      else if(n%2==0){
		         // Complete the code 
		    	  ans="n is odd";
		      }

	      System.out.println(ans);

	}

}

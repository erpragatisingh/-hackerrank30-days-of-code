package day.two;

import java.util.Scanner;

public class DataTypes {

	public DataTypes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        
        /* Read and save an integer, double, and String to your variables.*/
           int result=i+scan.nextInt();
           double doubleResult=d+scan.nextDouble();
             String stringResult=s+scan.next();
	         stringResult+=scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
             System.out.println(result);
        /* Print the sum of the double variables on a new line. */
		  System.out.println(doubleResult);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
             System.out.println(stringResult);
             scan.close();

	}

}

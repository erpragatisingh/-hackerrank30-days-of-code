package day.one;

import java.util.Scanner;

public class HelloWorld {

	public HelloWorld() {
	}

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
	      String inputString = scan.nextLine(); // read a line of input and save it to a variable
	      scan.close(); // close the scanner
	      
	      // Your first line of output goes here
	         System.out.println("Hello, World.");
	         System.out.println(inputString);
	      
	      // Write the second line of output
	}

}

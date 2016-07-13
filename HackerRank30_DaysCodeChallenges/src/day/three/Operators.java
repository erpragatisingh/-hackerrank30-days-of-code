package day.three;

import java.util.Scanner;

public class Operators {

	public Operators() {
	}

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	        double tip=(mealCost*tipPercent)/100;
	        double tax=(mealCost*taxPercent)/100;
	        // Write your calculation code here.
	        double sumofcost=mealCost+tip+tax;
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(sumofcost/*numberToRoundHere*/);
	        System.out.println("The total meal cost is " + totalCost +" dollars");
	        // Print your result  The total meal cost is 15 dollars.
	}

}

package day.five;

import java.util.Scanner;

public class ClassvsInstance {
	 private int age;

	public ClassvsInstance() {
	}
	public ClassvsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if(initialAge < 0){ // initial age is invalid
	        System.out.println("Age is not valid, setting age to 0.");
	        this.age = 0;
	    }
	    else{ // set age to valid initial age
	        this.age = initialAge;
	    }
	}
	


public void amIOld(){
		// Set correct statement to print
    String result = "";
    if(age >= 18){
        result = "You are old.";
    }
    else if(age >=13){
        result = "You are a teenager.";
    }
    else{
        result = "You are young.";
    }
    System.out.println(result);
}

public void yearPasses() {
		// Increment this person's age.
    this.age++;
}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassvsInstance p = new ClassvsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
	

}

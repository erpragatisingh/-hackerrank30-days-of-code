package day.thirty;

import java.util.Scanner;
//Here is a breakdown of the problem:

//We are given 2 numbers,  N (the size of our set) and K (a constraint on the number we choose for our output).
//We must have a set of integers from  1 to N that we'll refer to as S.
//We must have 2 integers, A and B, that are elements of S. These are constrained by the rule that A<B . We implement this with nested loops.
//We must find find the bitwise AND for every possible A and B. We'll refer to this as R (result).
//We must print the maximum R < K  as our answer.
public class Solution {
	 public static int findMaximum(int n, int k){
	        int max = 0;
	        int a = n - 1; // we are constrained by a < b
	        while(a-- > 0) {
	            for(int b = a + 1; b <= n; b++){
	                int test = a & b;
	                if( 	test < k 
	                	&& 	test > max ){
	                    max = test;
	                }
	            }
	        }
	        return max;
	    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
           
            
              System.out.println(findMaximum(n,k));
        }
        in.close();
    }
}



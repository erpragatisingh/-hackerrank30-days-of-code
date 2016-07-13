package day.eight.review;

import java.util.Scanner;

//Task 
//Given a string, S , of length N that is indexed from 0 to N-1 , print its even-indexed
//and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
//
//Note: 0 is considered to be an even index.
//
//Input Format
//
//The first line contains an integer, T (the number of test cases). 
//Each line i of the T subsequent lines contain a String, S.

public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();
			
            // Print even chars
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            
            // Print odd chars
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
//input
//2
//Hacker
//Rank

//output
//Hce akr
//Rn ak
package day.seven;

import java.util.Scanner;

public class ArraysSolution {
	
//	Objective 
//	Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!
//
//	Task 
//	Given an array,A , of  N integers, print A's elements in reverse order as a single line of space-separated numbers.
//
//	Input Format
//
//	The first line contains an integer, N (the size of our array). 
//	The second line contains N space-separated integers describing array A's elements.
//
//	Constraints
// 
// 1 <=N <= 1000
//	1<= A <=1000 , where Ai is the ith integer in the array.
//	Output Format
//
//	Print the elements of array A in reverse order as a single line of space-separated numbers.
//	

	public static void print(String[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        in.close();
        print(arr);
    }

}

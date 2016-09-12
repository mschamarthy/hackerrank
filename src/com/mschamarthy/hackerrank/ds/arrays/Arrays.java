/**
 * File:	com.mschamarthy.hackerrank.ds.arrays.Arrays.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	September 11, 2016
 * 
 * Below is the solution for practice / challenge problems on Hacker Rank.
 * Question link:	https://www.hackerrank.com/challenges/arrays-ds
 * 
 * DISCLAIMER:
 * 		This code is published with no warranties or liabilities of any kind. Use the
 * code at your discretion. Its encouraged to code solutions to the problem without help.
 * Please do not copy this code to solve any of the coding challenges. Use this solution
 * just as a reference. The author is not responsible for any use of the below solution
 * or consequences arising out of such use. Author is not responsible for any Resemblance 
 * of the code/solution in any manner and it is purely coincidental.
 */
package com.mschamarthy.hackerrank.ds.arrays;

import java.util.*;
import java.lang.*;

public class Arrays {

	public Arrays() {
	}
	
	public class Solution{

		private int[] readArray(){
			int n, arr[];
			Scanner stdIn = new Scanner(System.in);
			n = stdIn.nextInt();
			arr = new int[n];
			for (int i = 0; i < n ; i++){
				arr[i] = stdIn.nextInt();
			}
			stdIn.close();
			return arr;
		}
		
		private void reversePrintArray(int[] arr){
			int n = arr.length;
			for(int i = n-1 ; i >= 0 ; i--){
				System.out.print(arr[i]);
				if(i == 0){
					continue;
				}
				System.out.print(" ");
			}
		}
		
		public void main(String args[]){
			int[] arr = readArray();
			reversePrintArray(arr);
		}
		
	}
	
	// Boilerplate code to run the solution from the Solution Class.
	public static void main(String args[]){
		Arrays arrays = new Arrays();
		Solution solution = arrays.new Solution();
		solution.main(args);
	}

}

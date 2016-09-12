/**
 * File:	com.mschamarthy.hackerrank.ds.arrays.Arrays2D.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	September 11, 2016
 * 
 * Below is the solution for practice / challenge problems on Hacker Rank.
 * Question link:	https://www.hackerrank.com/challenges/2d-array
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

public class Arrays2D {

	public Arrays2D() {
	}
	
	public class Solution{

		private int[][] read2DArray(int r, int c){
			int arr[][];
			Scanner stdIn = new Scanner(System.in);
			arr = new int[r][c];
			for (int i = 0; i < r ; i++){
				for (int j = 0; j < c ; j++){
					arr[i][j] = stdIn.nextInt();
				}
			}
			stdIn.close();
			return arr;
		}
		
		private int computeMaxHourGlassValue(int[][] arr, int[][] hourGlassPattern) {
			int max = Integer.MIN_VALUE;
			int r, c, hr, hc;
			r = arr.length;
			c = arr[0].length;
			hr = hourGlassPattern.length;
			hc = hourGlassPattern[0].length;
			
			int rOverLap = r - hr + 1;
			int cOverLap = c - hc + 1;
			
			// Next 2 loops with loop variables i, j are to iterate over all possible 
			// Hourglass overlaps
			for (int i = 0; i < rOverLap; i++) {
				for (int j = 0; j < cOverLap; j++) {
					int temp = 0;
					// Next 2 loops are used to calculate the hourglass value
					// and max of all the possible hourglass values.
					for (int l = 0; l < hr; l++) {
						for (int m = 0; m < hc; m++) {
							temp += hourGlassPattern[l][m] * arr[i + l][j + m];
						}
					}
					if (temp > max) {
						max = temp;
					}
				}
			}
			return max;
		}
		
		public void main(String args[]){
			int[][] arr = read2DArray(6, 6);
			int[][] hourGlassPattern = {{1, 1, 1},{0, 1, 0},{1, 1, 1}};
			int max = computeMaxHourGlassValue(arr, hourGlassPattern);
			System.out.println(max);
		}
		
	}
	
	// Boilerplate code to run the solution from the Solution Class.
	public static void main(String args[]){
		Arrays2D arrays = new Arrays2D();
		Solution solution = arrays.new Solution();
		solution.main(args);
	}

}

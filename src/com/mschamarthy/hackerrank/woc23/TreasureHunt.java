/**
 * File:	com.mschamarthy.hackerrank.woc23.TreasureHunt.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	September 14, 2016
 * 
 * Below is the solution for practice / challenge problems on Hacker Rank.
 * Question link:	https://www.hackerrank.com/contests/w23/challenges/treasure-hunting
 * 
 * DISCLAIMER:
 * 		This code is published with no warranties or liabilities of any kind. Use the
 * code at your discretion. Its encouraged to code solutions to the problem without help.
 * Please do not copy this code to solve any of the coding challenges. Use this solution
 * just as a reference. The author is not responsible for any use of the below solution
 * or consequences arising out of such use. Author is not responsible for any Resemblance 
 * of the code/solution in any manner and it is purely coincidental.
 */
package com.mschamarthy.hackerrank.woc23;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TreasureHunt {

	public TreasureHunt() {
		// TODO Auto-generated constructor stub
	}

	public class Solution {

		public BigDecimal getK(Long x, Long y, Long a, Long b) {
			BigDecimal k = new BigDecimal(x * a + y * b);
			k = k.divide(new BigDecimal(a * a + b * b), 12, RoundingMode.HALF_EVEN);
			System.out.println(k.toPlainString());
			return k;
		}

		public BigDecimal getN(Long x, Long y, Long a, Long b) {
			BigDecimal n = new BigDecimal(y * a - x * b);
			n = n.divide(new BigDecimal(a * a + b * b), 12, RoundingMode.HALF_EVEN);
			System.out.println(n.toPlainString());
			return n;
		}

		public Long[] readInputs() {
			Scanner stdIn = new Scanner(System.in);
			Long[] inputs = new Long[4];
			for (int i = 0; i < 4; i++) {
				inputs[i] = stdIn.nextLong();
			}
			stdIn.close();
			return inputs;
		}

		public void main(String args[]) {
			Long[] inputs = readInputs();
			getK(inputs[0], inputs[1], inputs[2], inputs[3]);
			getN(inputs[0], inputs[1], inputs[2], inputs[3]);
		}

	}

	// Boilerplate code to run the solution from the Solution Class.
	public static void main(String args[]) {
		TreasureHunt arrays = new TreasureHunt();
		Solution solution = arrays.new Solution();
		solution.main(args);
	}
}

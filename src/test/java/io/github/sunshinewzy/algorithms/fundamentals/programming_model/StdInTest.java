package io.github.sunshinewzy.algorithms.fundamentals.programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StdInTest {

	public static void main(String[] args) {
		double sum = 0;
		int cnt = 0;

		while (!StdIn.isEmpty()) {
			sum += StdIn.readDouble();
			cnt++;
		}

		StdOut.printf("Summary is %.5f\nCount is %d\n", sum, cnt);
	}
	
}

package io.github.sunshinewzy.algorithms.fundamentals.programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class BinarySearchTest {

	public static void main(String[] args) {
		int n = StdIn.readInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = StdIn.readInt();
		}
		
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			StdOut.println(BinarySearch.rank(a, key, 0, n - 1));
		}
	}

}
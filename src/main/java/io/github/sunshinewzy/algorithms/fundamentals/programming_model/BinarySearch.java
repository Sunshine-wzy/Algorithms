package io.github.sunshinewzy.algorithms.fundamentals.programming_model;

public class BinarySearch {
	
	public static int rank(int[] a, int key, int lo, int hi) {
		if (lo > hi) return -1;
		
		int mid = (hi + lo) / 2;
		if (a[mid] > key) return rank(a, key, lo, mid - 1);
		else if (a[mid] < key) return rank(a, key, mid + 1, hi);
		else return mid;
	}
	
}

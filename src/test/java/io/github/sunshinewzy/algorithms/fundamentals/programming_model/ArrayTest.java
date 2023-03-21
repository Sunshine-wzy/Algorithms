package io.github.sunshinewzy.algorithms.fundamentals.programming_model;

import edu.princeton.cs.algs4.StdOut;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {
	
	@Test
	public void array() {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[]{6, 7, 8, 9, 10};

		StdOut.println(Arrays.toString(a));
		StdOut.println(Arrays.toString(b));
	}
	
	@Test
	public void stringArray() {
		String[] a = {"a", "b", "c"};
		String[] b = new String[]{"d", "e", "f"};

		StdOut.println(Arrays.toString(a));
		string(b);
		string(new String[]{"g", "h", "i"});
	}
	
	private void string(String[] array) {
		StdOut.println(Arrays.toString(array));
	}
	
}

package io.github.sunshinewzy.algorithms.fundamentals.programming_model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {
	
	@Test
	public void array() {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[]{6, 7, 8, 9, 10};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	@Test
	public void stringArray() {
		String[] a = {"a", "b", "c"};
		String[] b = new String[]{"d", "e", "f"};

		System.out.println(Arrays.toString(a));
		string(b);
		string(new String[]{"g", "h", "i"});
	}
	
	private void string(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}

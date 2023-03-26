package io.github.sunshinewzy.algorithms.fundamentals.stacks_and_queues;

import java.util.Iterator;

/**
 * 定容栈
 */
public class FixedCapacityStack<T> implements Iterable<T> {
	
	private T[] items;
	private int size;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int capacity) {
		items = (T[]) new Object[capacity];
	}
	
	public void push(T item) {
		// 动态调整数组大小
		if (size == items.length)
			resize(items.length * 2);
		
		items[size] = item;
		size++;
	}
	
	public T pop() {
		if (size <= 0) return null;
		
		size--;
		T item = items[size];
		// 避免对象游离
		items[size] = null;
		
		// 动态调整数组大小
		if (size > 0 && size == items.length / 4)
			resize(items.length / 2);
		
		return item;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return items.length;
	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseArrayIterator();
	}

	@SuppressWarnings("unchecked")
	private void resize(int max) {
		T[] temp = (T[]) new Object[max];
		for (int i = 0; i < size; i++) {
			temp[i] = items[i];
		}
		items = temp;
	}
	
	
	private class ReverseArrayIterator implements Iterator<T> {
		private int i = size;
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public T next() {
			i--;
			return items[i];
		}

		@Override
		public void remove() {}
	}
	
}

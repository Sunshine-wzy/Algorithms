package io.github.sunshinewzy.algorithms.fundamentals.stacks_and_queues;

import java.util.Iterator;

public class LinkedListStack<T> implements Iterable<T> {
	
	private Node first;
	private int size;
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	
	// 向栈顶添加元素
	public void push(T item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		size++;
	}
	
	// 从栈顶删除元素
	public T pop() {
		T item = first.item;
		first = first.next;
		size--;
		return item;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	private class Node {
		T item;
		Node next;
	}
	
	private class LinkedListIterator implements Iterator<T> {
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {}
	}
	
}

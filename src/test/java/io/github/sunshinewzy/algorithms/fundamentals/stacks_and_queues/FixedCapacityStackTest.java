package io.github.sunshinewzy.algorithms.fundamentals.stacks_and_queues;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedCapacityStackTest {

	// Dijkstra 的双栈算术表达式求值算法
	// 测试样例:
	// ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
	public static void main(String[] args) {
		FixedCapacityStack<String> options = new FixedCapacityStack<String>(10);
		FixedCapacityStack<Double> values = new FixedCapacityStack<>(10);
		
		while (!StdIn.isEmpty()) {
			String str = StdIn.readString();
			switch (str) {
				case "+", "-", "*", "/", "sqrt" -> options.push(str);
				case "(", " " -> {}
				case ")" -> {
					String option = options.pop();
					double value = values.pop();
					
					switch (option) {
						case "+" -> value = values.pop() + value;
						case "-" -> value = values.pop() - value;
						case "*" -> value = values.pop() * value;
						case "/" -> value = values.pop() / value;
						case "sqrt" -> value = Math.sqrt(value);
					}
					
					values.push(value);
				}
				default -> values.push(Double.parseDouble(str));
			}
		}
		
		StdOut.println(values.pop());
	}
	
	@Test
	public void stack() {
		FixedCapacityStack<String> stack = new FixedCapacityStack<String>(10);
		
		stack.push("awa");
		stack.push("b");
		stack.push("c");
		
		assertEquals(3, stack.size());
		assertEquals(10, stack.capacity());
		
		stack.pop();
		assertEquals(2, stack.size());
		assertEquals(5, stack.capacity());
	}
	
	@Test
	public void forEach() {
		FixedCapacityStack<String> stack = new FixedCapacityStack<String>(10);

		stack.push("awa");
		stack.push("b");
		stack.push("c");

		for (String str : stack) {
			StdOut.println(str);
		}
	}
	
}
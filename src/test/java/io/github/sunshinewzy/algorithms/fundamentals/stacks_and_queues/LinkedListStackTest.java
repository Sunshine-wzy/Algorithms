package io.github.sunshinewzy.algorithms.fundamentals.stacks_and_queues;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 下压栈 (链表实现)
 */
class LinkedListStackTest {

	// Dijkstra 的双栈算术表达式求值算法
	// 测试样例:
	// ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
	public static void main(String[] args) {
		LinkedListStack<String> options = new LinkedListStack<>();
		LinkedListStack<Double> values = new LinkedListStack<>();

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

}
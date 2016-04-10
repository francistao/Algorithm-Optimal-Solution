package 设计一个有getMin功能的栈;

import java.util.Stack;

public class MyStack2 {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public MyStack2()
    {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

	public void push(int newNum) {
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if (newNum < this.getmin()) {
			this.stackMin.push(newNum);
		}
		else {
			int newMin = this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackData.push(newNum);
	}

	public int pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is Empty.");
		}
		int value = this.stackData.pop();
		if (value == this.getmin()) {
			this.stackMin.pop();
		}
		return value;
	}

	public int getmin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return this.stackMin.peek();
	}

}

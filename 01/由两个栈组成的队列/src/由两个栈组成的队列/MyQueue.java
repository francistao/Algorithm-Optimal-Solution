package 由两个栈组成的队列;

import java.util.Stack;

public class MyQueue {

//	private Stack<Integer> stackPush;
//	private Stack<Integer> stackPop;
//	
//	public MyQueue()
//	{
//		stackPush = new Stack<>();
//		stackPop = new Stack<>();
//	}
//	
//	/**
//	 * 入队操作
//	 */
//	public void add(int newNum)
//	{
//		stackPush.push(newNum);
//	}
//	
//	/**
//	 * 出队操作
//	 */
//	public int poll(){
//		if(stackPush.isEmpty())
//		{
//			throw new RuntimeException("Stack can not be null.");
//		}
//		else if(stackPop.empty())
//		{
//			while (!stackPush.empty()) {
//				stackPop.push(stackPush.pop());
//			}
//		}
//		return stackPop.pop();
//	}
//	
//	/**
//	 * 获得队顶元素
//	 */
//	public int peek()
//	{
//		return stackPop.peek();
//	}
//	
//	public static void main(String[] args) {
//		MyQueue queue = new MyQueue();
//		queue.add(1);
//		queue.add(2);
//		queue.add(4);
//		queue.add(7);
//		
//		int num = queue.poll();
//		int peek = queue.peek();
//		
//		System.out.println(num + " " + peek);
//	}
} 

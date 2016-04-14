package 设计一个有getMin功能的栈;

import java.util.Stack;

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
 * 要求：
 * 1.pop、push、getMin操作的时间复杂都是O(1)
 * 2.设计的栈类型可以使用现成的栈结构
 * 
 * @author dream
 *
 */
public class MyStack1 {

//	private Stack<Integer> stackData;
//	private Stack<Integer> stackMin;
//	
//	public MyStack1()
//	{
//		stackData = new Stack<Integer>();
//		stackMin = new Stack<Integer>();
//	}
//	
//	/**
//	 * 压入操作
//	 * @param newNum
//	 */
//	public void push(int newNum)
//	{
//		if(stackMin.isEmpty())
//		{
//			stackMin.push(newNum);
//		}
//		stackData.push(newNum);
//		if(newNum <= stackMin.peek())
//		{
//			stackMin.push(newNum);
//		}
//	}
//	
//	/**
//	 * 弹出操作
//	 * @return
//	 */
//	public int pop()
//	{
//		if(stackData == null)
//		{
//			throw new RuntimeException("Your Stack isEmpty");
//		}
//		int value = stackData.pop();
//		if(stackMin.peek() == value)
//		{
//			stackMin.pop();
//		}
//		return value;
//	}
//	
//	public int getMin()
//	{
//		if(stackMin.isEmpty())
//		{
//			throw new RuntimeException("Your stack is Empty.");
//		}
//		return stackMin.peek();
//	}
//	
//	public static void main(String[] args) {
//		MyStack1 stack1 = new MyStack1();
//		stack1.push(3);
//		stack1.push(2);
//		stack1.push(1);
//		int stack = stack1.pop();
//		int min = stack1.getMin();
//		
//		System.out.println(stack + "" + min + "");
//	}
	
}

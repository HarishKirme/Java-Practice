package listExamples;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackUse {
	
	
	private static void addValueInStack(int[] arr) {
		
		List<Integer> list = new LinkedList<>();
		
		Stack<Integer> stack = new Stack<>();
		
		Stack<Integer> stack2 = new Stack<>();
		
				
		for(int i : arr) {
			list.add(i);
			stack.add(i);
		}
		
		print(stack);
		System.out.println("Stack2");
		stack2.addAll(list);
		
		print(stack2);
		
		System.out.println("pop"+ stack.pop());
		
		print(stack);
		
		System.out.println("Peek" + stack.peek());
		
		print(stack);
	}
	
	public static void print(Collection<? extends Number> stack) {
		
		for(Number i : stack) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 22, 21, 90, 13 };
		
		addValueInStack(a);
		
}

	
	
}

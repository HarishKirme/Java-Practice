package listExamples;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueUse {

	private static void addValueInQueue(int[] a) {
	
		Queue<Integer> qu = new PriorityQueue<>();
		
		for(Integer i : a) {
			
			qu.add(i);
		}
		
		print(qu);
		
		
		//to add all the elements of a priority queue to another priority queue.
		
		Queue<Integer> qu2 = new PriorityQueue<>();

		qu2.addAll(qu);
		
		print(qu2);
		
		
		//insert a given element into a priority queue
		System.out.println("insert a given element into a priority queue");
		
		qu.offer(70);
		
		print(qu);
		
		// remove all the elements from a priority queue.
		System.out.println(" remove all the elements from a priority queue.");
		
		qu2.clear();
		
		//count the number of elements in a priority queue
		System.out.println("count the number of elements in a priority queue:::"+qu.size());
		
		
		//compare two priority queues.
		System.out.println("compare two priority queues.");
		
		boolean val = qu.equals(qu2);
		 System.out.println("valu:::" + val);
		 
		 //retrieve the first element of the priority queue. 
		System.out.println("retrieve the first element of the priority queue. ");
		
		int v = qu.peek();
		System.out.println("peek return head of queue:::"+ v);
		
		System.out.println("retrieve and remove the first element.");
		
		int vi = qu.poll();
		System.out.println("poll retrieve and remove the first element.:::"+ vi);
		
		
		System.out.println("priority queue to an array containing all of the elements of the queue.");
		
		Integer[] quToArr = new Integer[qu.size()];
		
		qu.toArray(quToArr);
		
		for(Integer i : quToArr) {
			System.out.println(i);
		}
		
		//Priority Queue elements to a string representation.
		
		System.out.println("qu.toString()"+qu.toString());
		
		// priorityQueue to maximum priorityqueue.
		
		System.out.println(" priorityQueue to maximum priorityqueue.");
		
		Queue<Integer> maxPriority = new PriorityQueue<>();
		
		
		
	}
	
	public static void print(Collection<? extends Number> qu) {
		
		for(Number i : qu) {
			
			System.out.println(i);
		}
		
	}
	
	
	
	
public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 22, 21, 900, 13 };
		
		addValueInQueue(a);
		
		
		
}	
}



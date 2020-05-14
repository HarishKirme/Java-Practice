package listExamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.List;

public class linkedList {

	private static void addValueInLinkedList(int[] arr) {
		
		List<Integer> l_List = new LinkedList<>();
		
		//convert array to list 
		
		for(int i : arr) {
			
			l_List.add(i);
		}
		
		print(l_List);
		
		// iterate through all elements in a linked list starting at the specified position
		
		Iterator itr = l_List.listIterator(1);
		
		while(itr.hasNext()) {
			
			itr.next();
		}
		
		
		//linked list in reverse order.
		
		for(int i=l_List.size()-1;i>=0;i--) {
			
			System.out.println("value at"+i+ "is :: "+ l_List.get(i));
		}
		
		// insert the specified element at the specified position in the linked list.eg:20 at 4
		
		l_List.add(4, 20);
		print(l_List);
		
		
		//insert elements into the linked list at the first and last position
		
		System.out.println("Inserted at 1st and last position");
		 l_List.add(0, 7);
		l_List.add(l_List.size(), 40);
		
		print(l_List);
		
	}
	
	
	public static void print(Collection<? extends Number> list) {
		
		for(Number i : list) {
			System.out.println(i);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 22, 21, 90, 13 };
		
		addValueInLinkedList(a);
		
}


}

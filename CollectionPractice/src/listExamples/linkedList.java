package listExamples;

import java.util.Collection;
import java.util.Collections;
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
		
		
		List<Integer> l_List2 = new LinkedList<>();
		System.out.println("Elements in 2nd List");
		l_List2.addAll(l_List);
		print(l_List2);
		
		
		
		//remove all the elements from a linked list

		l_List2.clear();
		
		//shuffle the elements in a linked list.
		System.out.println("Elements shuffled in List");
	
		//Collections.shuffle(l_List);
		print(l_List);
		
		// join two linked lists
		System.out.println("Add elements in Elements in List");

		l_List2.addAll(l_List);
		print(l_List2);

		
		// remove and return the first element of a linked list
		
		int value = l_List.remove(0);
		
		System.out.println("Value removed"+value);
		
		print(l_List);
		
		//retrieve but does not remove, the last element of a linked list.
		
		int lastElement = l_List.get(l_List.size()-1);
		
		System.out.println("last Element "+lastElement);

		//check if a particular element exists in a linked list.
		
		boolean b = l_List.contains(20);
		
		System.out.println("contains::"+b);

		//convert a linked list to array list.
		
		Integer[] cpyArr = new Integer[l_List.size()];
		
		cpyArr = l_List.toArray(cpyArr);
		
		
		
		//	test an linked list is empty or not.
		
		boolean val = l_List.isEmpty();
		System.out.println("l_List.isEmpty()"+val);
		
		//replace an element in a linked list
		l_List.set(4, 55);
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

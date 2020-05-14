package listExamples;

import java.util.Collection;
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

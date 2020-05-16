package listExamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUse {
	
	private static void addValueInTreeSet(int[] arr){
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for(int i : arr) {
			
			treeSet.add(i);
		}
		
		print(treeSet);
		
		
		// add all the elements of a specified tree set to another tree set.
		System.out.println(" add all the elements of a specified tree set to another tree set.");
		
		Set<Integer> hastSet = new HashSet<>(treeSet);
		
		print(hastSet);
		
		//create a reverse order view of the elements contained in a given tree set.
		
		System.out.println("create a reverse order view of the elements contained in a given tree set.");
	
		/*
		 * TreeSet<Integer> descendSet = new TreeSet<>();
		 * 
		 * descendSet =treeSet.descendingSet();
		 */
		
		
		TreeSet<Integer> descendSet = new TreeSet<>(new TreeComparator());
		
	
		descendSet.addAll(treeSet);
		
		print(descendSet);
		
		
		// get the first and last elements in a tree set.
		System.out.println(" get the first and last elements in a tree set.");
		
		System.out.println("First Element::"+treeSet.first());
		System.out.println("Last Element ::"+ treeSet.last());
	
		
		// get the number of elements in a tree set.
		
		treeSet.size();
		
		// search element in set.
		
		boolean eq=false;
		
		for(Integer i : treeSet) {
			
			 eq = i.equals(90);
			 			 
		}
		if(eq == true) {
			 System.out.println("applicable");
		 }
		 else {
			 System.out.println("not applicable");
		 }
		
		
		//compare two tree sets
		
		treeSet.equals(hastSet);
		
		//numbers less than 7 in a tree set
		
		System.out.println("numbers less than 7 in a tree set");
		
		System.out.println("headSet"+treeSet.headSet(7));
		
		//or
		
		for(Integer i : treeSet) {
			
			if(i < 7) {
				System.out.println(i);
			}
			
		}
		
		// less than or equal to the given element.
		
		System.out.println("less than or equal "+treeSet.floor(7));
		
		//element in a tree set which is strictly greater than or equal to the given element.
		
		System.out.println("element in a tree set which is strictly greater than or equal "+treeSet.higher(7));

		//retrieve and remove the first element of a tree set.
		System.out.println("retrieve and remove the first element of a tree set.");
		
		int val = treeSet.pollFirst();
		System.out.println("treeSet.pollFirst()" + val);
		print(treeSet);
		
		
		//remove a given element from a tree set
		System.out.println("remove a given element from a tree set");
		treeSet.remove(22);
		print(treeSet);
	}
	
	public static void print(Collection<? extends Number> list) {
		
		for(Number i : list) {
			System.out.println(i);
		}
		
	}	
	
	

	public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 22, 21, 90, 13 };
		
		addValueInTreeSet(a);
		
}
	
}

class TreeComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		   return o2.compareTo(o1);
	}
	
	
}




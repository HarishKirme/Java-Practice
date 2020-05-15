package listExamples;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUse {

	private static void addValueInSet(int[] a) {
		
		Set<Integer> hashSet= new HashSet<>();
		
		for(int i : a) {
			
			hashSet.add(i);
		}
		
		print(hashSet);
	
		
		// get the number of elements in a hash set.
		System.out.println("size:::"+hashSet.size());
		
		//test a hash set is empty or not
		System.out.println("isEmpty:::"+hashSet.isEmpty());
		
		//empty an hash set
		//hashSet.clear();
		
		
		//clone a hash set to another hash set.
		
		Set<Integer> hashSet2  = new HashSet<>();
		
		hashSet2.addAll(hashSet);
		
		// convert a hash set to an array.
		
		Integer[] IntArr = new Integer[hashSet.size()];
		
		hashSet.toArray(IntArr);
		
		System.out.println("print arr");
		
		for(Integer i : IntArr) {
			System.out.println(i);
		}
		
		//convert a hash set to a tree set.
		
		Set<Integer> conTreeSet = new TreeSet<>(hashSet);
		
		System.out.println("print TreeSet");
		
		print(conTreeSet);
		
		//convert a hash set to a List/ArrayList.
		
		System.out.println("print List");
		
		List<Integer> list = new ArrayList<>(conTreeSet);
		
		print(list);
		
		//compare two hash set.
		
		System.out.println("compare two hash set.");
		
		boolean eq = hashSet.equals(conTreeSet);
		
		System.out.println("isEqual::" + eq);
		
		// compare two sets and retain elements which are same on both sets
		System.out.println(" compare two sets and retain elements which are same on both sets");
		
		hashSet.add(45);
		
		hashSet.retainAll(conTreeSet);
		
		System.out.println("Element after retained::"+hashSet);
		
		//remove all of the elements from a hash set.
		System.out.println("hashSet.clear()");

		hashSet.clear();
		
		print(hashSet);
		System.out.println("hashSet.clear()"+ hashSet);

	}
	
	
	public static void print(Collection<? extends Number> set) {
		
		for(Number i: set) {
			System.out.println(i);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 22, 21, 90, 13 };
		
		addValueInSet(a);
		
}

	
	
}

package listExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListUse {
	
	public static void addValueInList(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		
		//add
		
		for(int i : arr) {
			
			list.add(i);
		}
		
		//print 
		System.out.println("Array added to List");
		print(list);
		
		//Insert at 1st position
		list.add(0,23);
		
		System.out.println("After adding element at first index to list");
		print(list);
		
		
		//retrive at 3 position
		
		Integer valueAtIndex = list.get(3);
		
		System.out.println("Value at positon 3 :"+valueAtIndex);

		//remove the third element from a array list
		
		int value = list.remove(3);
		System.out.println("Remove value at postion 3 and return value :"+value);
		
		
		//search an element in a array list, eg:90;
		
		int index = list.indexOf(90);
		System.out.println("Index of 90 : :"+index);
		
		//Sort list use Collections.sort
		
		Collections.sort(list);
		
		System.out.println("After sorting element Collections.sort(list) ");
		print(list);
		
		//Copy element to other List
		List<Integer> list2 = new ArrayList<>();
		
		System.out.println("List 2 is:");

		list2.addAll(list);
		print(list2);
		
		
		//Copy element to other List after specfic index shift other elemt to right
				
				System.out.println("Copy element to other List after specfic index shift other elemt to right:");

				list2.addAll(2,list);
				print(list2);
		
		//to shuffle elements in a array list
				
		Collections.shuffle(list);		
		System.out.println("After shuffling element Collections.shuffle(list)");

		
		//to reverse elements in a array list
		
				Collections.reverse(list);		
				System.out.println("After reversing element Collections.reverse(list)");
				print(list);
		//to reverse elements using logic
				
			int temp = 0;
			
			for(int i=0;i< list.size()/2;i++) {
				
				temp = list.get(i);
				
				list.set(i, list.get(list.size()-i-1));
				list.set(list.size()-i-1, temp);
				
			}
			System.out.println("After reversing element Collections.reverse(list)");

			print(list);
			

			//extract a portion of a array list 1,4
			
			List<Integer> subList = list.subList(0, 4);
			
			System.out.println("SubList");

			print(subList);
			
			
			//compare two array lists
			int l1size = list.size();
			int l2size = list2.size();
			
			System.out.println("l1size"+l1size);
			System.out.println("l1size"+l2size);
			
		/* if( l1size == l2size ) { */
				
				System.out.println("compare two array lists");
				
				for(int i=0;i<list.size();i++) {
					
					boolean l = list.get(i)==list2.get(i);
					System.out.println("Print boolean ::"+l);
				}
				
		/* } */
			
		
		//empty an array list.
		
				list2.clear();
				System.out.println("list2.clear()::"+list2);
		
		//array list is empty or not	
		
			boolean empty = list.isEmpty();
			System.out.println("list.isEmpty()::"+empty);
			
		
		//clone an array list to another array list.

				ArrayList<String> aS = new ArrayList<>();
			
			 aS.trimToSize();
			 
			 //replace the second element of a ArrayList with the specified element.
			 
			 list.set(2,1);
		
			
			 System.out.println("list.set(2,5)::"+list);
				
	}
	
	
	//compare two array lists
	
	
	public static void print(Collection<? extends Number> list) {
		
		for(Number i: list) {
			System.out.println("value"+i);
		}
	}
	

	public static void main(String[] args) {
		
			int[] a = { 3, 2, 4, 22, 21, 90, 13 };
			
			addValueInList(a);
			
	}
}


/* Note: 
 * 
 * 252

There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method.

List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}


 * 
 * */
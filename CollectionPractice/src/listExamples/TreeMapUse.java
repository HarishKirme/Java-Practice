package listExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapUse {


@SuppressWarnings("unchecked")
public static void addTwoDArrayInMap(int[][] twoDArray) {

	TreeMap<Integer,Integer> treeMap = new TreeMap<>();
	
	
	for(int[] i_map : twoDArray) {
		
		treeMap.put(i_map[0],i_map[1]);
	}
	
	print(treeMap);
	
	
	// copy a Tree Map content to another Tree Map.
	
	System.out.println(" copy a Tree Map content to another Tree Map.");
	
	Map<Integer,Integer> treeMap2 = new TreeMap<>();
	
	treeMap2.putAll(treeMap);
	
	print(treeMap);
	
	
	//search a key in a Tree Map.
	System.out.println("search a key in a Tree Map.::" + treeMap.containsKey(5));
	
	//search a key in a Tree Map.
	System.out.println("search a value in a Tree Map.::" + treeMap.containsValue(5));

	
	// get all keys from the given a Tree Map.

	Set setkey = treeMap.keySet();

	System.out.println("get all keys from the given a Tree Map.::"+setkey.toString());
	
	// delete all elements from a given Tree Map.
	treeMap2.clear();
	
	System.out.println(" delete all elements from a given Tree Map." + treeMap2.toString());
	
	//sort keys in Tree Map by using comparator.
	
	System.out.println("sort keys in Tree Map by using comparator.");
	
	Map<Integer,Integer> treeMap3 = new TreeMap<>(new MyComparator());

	treeMap3.putAll(treeMap);
	
	print(treeMap3);
	
	
	//Important sort keys in Tree Map by using comparator.
	
	System.out.println("Important sort keys in Tree Map by using comparator.");
	
	Set set = treeMap.entrySet();
	List<Map.Entry<Integer,Integer>> list  = new ArrayList<>(set);

	
	Comparator<Map.Entry<Integer, Integer>> compareByvalue = new Comparator<Map.Entry<Integer,Integer>>() {

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			
			Integer value1 = o1.getValue();
			Integer value2 = o2.getValue();
			
			return value2.compareTo(value1);
		}
	};
	
	
	Collections.sort(list,compareByvalue);
	
	HashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>(list.size());
	 
	for(Map.Entry<Integer, Integer> mapping : list) {
		
		linkedHashMap.put(mapping.getKey(),mapping.getValue());
	}
	
	print(linkedHashMap);
	
	linkedHashMap.clear();
	
	System.out.println("linkedHashMap"+linkedHashMap.toString());
	
	//get a key-value mapping associated with the greatest key and the least key in a map
	System.out.println("get a key-value mapping associated "
			+ "with the greatest key and the least"
			+ " key in a map:::First key::" + treeMap.firstKey()
			+"firstEntry::" + treeMap.firstEntry() 
			+"lastEntry::" + treeMap.lastEntry());
	
	
	// get a reverse order view of the keys contained in a given map.
	System.out.println(" get a reverse order view of the keys contained in a given map.");
	
	Comparator<Map.Entry<Integer, Integer>> compareByKey  = new Comparator<Map.Entry<Integer,Integer>>() {

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			Integer key1 = o1.getKey();
			Integer key2 = o2.getKey();
			
			return key2.compareTo(key1);
		}
	};
	
	
	Collections.sort(list,compareByKey);
	
	for(Map.Entry<Integer, Integer> entryInList : list) {
		
		linkedHashMap.put(entryInList.getKey(),entryInList.getValue() );
	}
	
	print(linkedHashMap);
	
	
	//a key-value mapping associated with the greatest key less than or equal to the given key.
	
	System.out.println("a key-value mapping associated with the greatest key less than or equal to the given key."+treeMap.floorEntry(5));
	
	//greatest key less than or equal to the given key.
	System.out.println("greatest key less than or equal to the given key."+treeMap.floorKey(5));
	
	//the portion of a map whose keys are strictly less than a given key. 
	System.out.println("the portion of a map whose keys are strictly less than a given key."+ treeMap.headMap(3).toString());
	
	//the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
	
	System.out.println("the portion of this map whose keys"
			+ " are less than (or equal to, if inclusive is true) a given key."+treeMap.headMap(3, true).toString());

	//NavigableSet view of the keys contained in a map.
	
	NavigableSet<Integer> nSet = treeMap.navigableKeySet();

	for(Integer i : nSet ) {
		
		System.out.println(i);
	}
	
	
	//remove and get a key-value mapping associated with the least key in a map
	System.out.println("remove and get a key-value mapping associated with the least key in a map"+ treeMap.pollFirstEntry());
	
	print(treeMap);
	
	//get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
	System.out.println("get the portion of a map whose keys range"
			+ " from a given key (inclusive), to another key (exclusive)."+ treeMap.subMap(2,true, 5,true).toString());
	
	
	//portion of a map whose keys are greater than or equal to a given key
	
	System.out.println("portion of a map whose keys are greater than or equal to a given key"+ treeMap.tailMap(3,true).toString());
	
	//portion of a map whose keys are greater than to a given key
	
	System.out.println("tion of a map whose keys are greater than to a given key"+ treeMap.tailMap(3));
}


public static void print(Map<?,?> treeMap) {
	
	for(Map.Entry<?, ?> mapping : treeMap.entrySet()) {
		
		System.out.println("Key :::"+mapping.getKey() + "Value" + mapping.getValue());
		
	}
	
}
	
	
	
public static void main(String[] args) {
		
		int[][] twoDArray= {
				{1,300},
				{3,100},
				{2,500},
				{4,200},
				{7,900},
				{5,800}		
		};
		
		
		for(int[]  i_Key_Value : twoDArray) {
			
			System.out.println("value"+ i_Key_Value[0]+":"+i_Key_Value[1]);
		}
		

		addTwoDArrayInMap(twoDArray);
		
		
		
		
	}

}



class MyComparator implements Comparator{

	/*
	 * @Override public int compare(Entry<Integer, Integer> o1, Entry<Integer,
	 * Integer> o2) {
	 * 
	 * Integer value1 = o1.getValue(); Integer value2 = o2.getValue();
	 * 
	 * 
	 * return value1.compareTo(value2); }
	 */



	
	  @Override public int compare(Object o1, Object o2) {
	  
	  return ((Integer) o2).compareTo((Integer) o1);
	  
	  }
	 
	
	
}


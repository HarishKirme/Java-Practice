package listExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapUse {


	private static void addTwoDArrayInMap(int[][] twoDArray) {
		
		Map<Integer,Integer> hashMap = new HashMap<>();
		
		for(int[] mapping : twoDArray) {
			
			hashMap.put(mapping[0],mapping[1]);
		}
		
		print(hashMap);
		
		
		// count the number of key-value (size) mappings in a map
		System.out.println("count the number of key-value (size) mappings in a map::"+ hashMap.size());
		
		//copy all of the mappings from the specified map to another map.
		System.out.println("copy all of the mappings from the specified map to another map.");
		
		Map<Integer,Integer> hashMap2 = new HashMap<>();
		
		hashMap2.putAll(hashMap);
		
		print(hashMap2);
		
		//remove all of the mappings from a map.
		
		hashMap2.clear();
		
		System.out.println("hashMap2.clear()" + hashMap2.toString());
		
		//check whether a map contains key-value mappings (empty) or not.
		
		System.out.println("check whether a map contains key-value mappings (empty) or not."+ hashMap2.isEmpty());
		
		// test if a map contains a mapping for the specified key
		
		System.out.println(" test if a map contains a mapping for the specified key."+ hashMap.containsKey(3));
		
		// test if a map contains a mapping for the specified key
		
		System.out.println(" test if a map contains a mapping for the specified value."+ hashMap.containsValue(900));
				
		//create a set view of the mappings contained in a map
		System.out.println("create a set view of the mappings contained in a map");
		
		Set set = hashMap.entrySet();
		
		System.out.println("Set view--> Set set = hashMap.entrySet()" + set.toString());
		
		int val = hashMap.get(1);
		System.out.println("value mapping of key::"+ val);
		
		Set setViewKey = hashMap.keySet();
		System.out.println("key set::"+ setViewKey.toString());
		
		//get a collection view of the values contained in this map
		
	System.out.println("get all values::"+hashMap.values());
		
	}
	
	
	public static void print(Map<?,?> map) {
		
		for(Map.Entry<?, ?> entry : map.entrySet()) {
			
			System.out.println("Key::"+entry.getKey()+"--Value::"+entry.getValue());
			
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

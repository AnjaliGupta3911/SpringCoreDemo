package com.springcoredemo.springDemo;

import java.util.*;

public class practice {
	
	static void dotask() {
		
		//creating input array, individual elements of which are map objects
		ArrayList<HashMap<String,String>> inputArray = new ArrayList<HashMap<String,String>>();
		
		//inserting elements into the input array
		inputArray.add(new HashMap<String,String>() {{ put("raj","jaipur");}} );
		inputArray.add(new HashMap<String,String>() {{ put("raj","udaipur");}} );
		inputArray.add(new HashMap<String,String>() {{ put("punjab", "amritsar");}} );
		inputArray.add(new HashMap<String,String>() {{ put("punjab","ludhiana");}} );
		inputArray.add(new HashMap<String,String>() {{ put("raj","kota");}} );
		inputArray.add(new HashMap<String,String>() {{ put("raj","jaipur");}} );
		inputArray.add(new HashMap<String,String>() {{ put("up","lucknow");}} );
		inputArray.add(new HashMap<String,String>() {{ put("up","kanpur");}} );
		
		//result is a map with keys as string and values as set of strings
		HashMap<String,LinkedHashSet<String>> result = new HashMap<String,LinkedHashSet<String>>();
		
		//iterating through the input array
		for(int i=0;i<inputArray.size();i++)
		{
			HashMap<String,String> singleMapObj = inputArray.get(i);
			String key = (String) singleMapObj.keySet().toArray()[0];
			String value = singleMapObj.get(key);
			
			if(result.containsKey(key))
			{
				LinkedHashSet<String> set = result.get(key);
				set.add(value);
				result.put(key, set);
			}
			else {
				result.put(key, new LinkedHashSet<String>() {{ add(value); }} );
			}
		}
		
		for(Map.Entry<String, LinkedHashSet<String>> entry: result.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
				
	}

}

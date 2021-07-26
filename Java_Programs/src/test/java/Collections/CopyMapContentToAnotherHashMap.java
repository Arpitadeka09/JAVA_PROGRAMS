package Collections;

import java.util.HashMap;

public class CopyMapContentToAnotherHashMap {
	 
	    public static void main(String a[]){
	        HashMap<String, String> hr = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hr.put("first", "Arpita");
	        hr.put("second", "pratika");
	        hr.put("third","neha");
	        System.out.println(hr);
	        HashMap<String, String> subMap = new HashMap<String, String>();
	        subMap.put("s1", "Bina");
	        subMap.put("s2", "anuja");
	        hr.putAll(subMap);
	        System.out.println(hr);
	    }
	}



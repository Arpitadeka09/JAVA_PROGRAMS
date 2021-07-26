package Collections;

import java.util.TreeMap;

public class CopyMapcontenttoanotherTreeMap {
	 public static void main(String a[]){
	        TreeMap<String, String> hm = new TreeMap<String, String>();
	        //add key-value pair to TreeMap
	        hm.put("first", "Arpita");
	        hm.put("second", "Bina");
	        hm.put("third","pankaj");
	        System.out.println(hm);
	        TreeMap<String, String> subMap = new TreeMap<String, String>();
	        subMap.put("s1", "kimon");
	        subMap.put("s2", "Geet");
	        hm.putAll(subMap);
	        System.out.println(hm);
	    }
	}



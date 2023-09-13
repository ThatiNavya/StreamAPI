package com.collectors;

import java.util.HashMap;

public class FindDuplicates {

	public static void main(String[] args) {
         
		String str = "ILoveJavaa";
		char[] ch =str.toCharArray();
		HashMap<Character,Integer> mapobj = new HashMap<Character,Integer>();
        mapobj.entrySet().stream().filter(map->map.getValue()==1).forEach(System.out::println);
        
	
	
	
	}

}

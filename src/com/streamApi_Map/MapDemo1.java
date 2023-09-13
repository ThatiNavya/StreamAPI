package com.streamApi_Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
       public static void main(String[] args) {
    	    //From list of names,filter them using some character and then print the length of the names.
   	   List<String> names = Arrays.asList("Ashok","Anil","Raju","Rani","Jhon","Akash","Charles");
   	   names.stream().filter(name->name.startsWith("A")).map(name->name.length()).forEach(System.out::println);
	}
}

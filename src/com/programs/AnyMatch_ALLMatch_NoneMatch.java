package com.programs;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch_ALLMatch_NoneMatch {

	public static void main(String[] args) {
		 List<String> l = new ArrayList<String>();
         l.add("we");
         l.add("are");
         l.add("going");
         l.add("to");
         l.add("conduct");
         l.add("workshop");
         l.add("on stream api");
       boolean flag=l.stream().anyMatch(x->x.startsWith("w"));
       System.out.println("anyMatch:"+flag);

       boolean flag1=l.stream().allMatch(x->x.startsWith("w"));
       System.out.println("allMatch:"+flag1);

       boolean f1ag2=l.stream().noneMatch(x->x.startsWith("w"));
       System.out.println("noneMatch:"+f1ag2);
  }

	}



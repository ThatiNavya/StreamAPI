package com.streamApi;

import java.util.stream.Stream;

public class FilterDemo_User {

	public static void main(String[] args) {
		User u1 = new User("Navya",23);
		User u2 = new User("Srilatha",28);
		User u3 = new User("Nanditha",29);
		User u4 = new User("Jyothsna",21);
		User u5 = new User("Karthika",6);
		User u6 = new User("Anusha",26);
		Stream<User> users = Stream.of(u1,u2,u3,u4,u5,u6);
		//wanted people >18 age and name start with "N"
		/*
		 * Stream<User> filteredUsers = users.filter(i-> i.age>=18 &&
		 * i.name.startsWith("N")); filteredUsers.forEach(System.out::println);
		 */
		users.filter(i->i.age>=18).filter(i->i.name.startsWith("N")).forEach(System.out::println);
		
		
	}

}

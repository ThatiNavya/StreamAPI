package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_ForEachDemo_Product {

	public static void main(String[] args) {
		List<Product> filteredProducts= getProducts().stream()
				                                    .filter((product->product.getPrice()>65000f))
				                                    .collect(Collectors.toList());
		filteredProducts.forEach(System.out::println);
	}
	private static List<Product> getProducts(){
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1,"HP Laptop",65500f));
		productList.add(new Product(2,"Dell Laptop",62000f));
		productList.add(new Product(3,"Lenovo Laptop",70000f));
		productList.add(new Product(4,"Sony Laptop",48000f));
		productList.add(new Product(5,"Apple Laptop",97000f));
		return productList;
		
	}

}

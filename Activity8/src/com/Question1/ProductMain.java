package com.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {   
		Product1 p1=new Product1(1,"AirJordan",12000);//adding product details
		Product1 p2=new Product1(2,"Nike",7000);
		Product1 p3=new Product1(3,"Puma",4000);
		Product1 p4=new Product1(4,"Bata",8000);
		ArrayList<Product1> pl=new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		Collections.sort(pl,new ProductPriceComparator());
		System.out.println("Sorting based on price of product"); //sorting product by price
		for(Product1 p:pl)
		{
			System.out.println(p.price+" "+p.Pname);
		}
		System.out.println("-------------------------");
		System.out.println("Sorting based on name of product");  //sorting product by name
		Collections.sort(pl, new ProductNameComparator());
		for(Product1 p:pl)
		{
			System.out.println(p.Pname);
		}

	}

}
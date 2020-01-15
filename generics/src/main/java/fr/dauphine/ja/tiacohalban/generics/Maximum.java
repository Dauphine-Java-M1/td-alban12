package fr.dauphine.ja.tiacohalban.generics;

import java.util.ArrayList;
import java.util.List;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println(myMax(42, 1664)); // 1664 
		  System.out.println(myMax(2014,86, 13)); // 2014 
		  List<? extends Number> la = new ArrayList<Integer>();
		  
		//  System.out.println(myMax());
		 
	}

	public static <E extends Comparable<E>> E myMax(E b,E...a) { 
		E max=b; 
		for (E x:a)
		{ 
			if ((max.compareTo(x))<0) max=x;
		} 
		return max;
	  }
}

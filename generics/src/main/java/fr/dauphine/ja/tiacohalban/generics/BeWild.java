package fr.dauphine.ja.tiacohalban.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeWild {

	
	private static void print(List<? extends Object> list) { 
		for(Object o:list)
		System.out.println(o); 
		}
	
	public static <E extends CharSequence> void compare(List<E> l)
	{
		for(E a:l)
		{
			System.out.println(a.length());
		}
	}
	

	public static <E extends CharSequence> List listLength(List<E> list)
	{
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i = 0; i<list.size();i++){
			CharSequence seq=list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static  List listLength2(List<? extends CharSequence> list)
	{
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i = 0; i<list.size();i++){
			CharSequence seq=list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static List<? extends CharSequence> fusion(List<? extends CharSequence> l1,List<? extends CharSequence> l2)
	{
		//TODO
		
		return l1;
		
	}
	
	public static List swap(List list,int i1,int i2)
	{
		//TODO
		return list;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list=Arrays.asList("foo", "toto"); 
		 print(list);
		 List l=Arrays.asList("colonel", "reyel"); 
		 System.out.println(listLength(l));
	}
}
package fr.dauphine.ja.tiacohalban.iterables;

import java.util.AbstractList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;

public class Panel extends AbstractList<Integer> implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args)
	{
		Iterator<Integer> it=panel1(1,5);
		List<Integer> l = panel(3,6);
		for(;it.hasNext();)
			System.out.println(it.next());
		System.out.println("--------------");
		for (int i:l)
		{
			System.out.println(i);
		}
		System.out.println("--------------");
		System.out.println(l.get(1));
		
	}
	
	public static List<Integer> panel(int a,int b)
	{
	List<Integer>  it = range(a,b);
		return it;
	}
	
	public static Iterator<Integer> panel1(int a,int b)
	{
		Iterator<Integer>  it = range(a,b).iterator();          
		return it;
	}
	
	public static Iterator<Integer> panel2(int a,int b)
	{
		Iterator<Integer>  it = new Panel().iterator();
		return it;
	}
	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * @param begin inclusive
	 * @param end exclusive
	 * @return list of integers from begin to end
	 */
	public static List<Integer> range(final int begin, final int end) {
	    return new AbstractList<Integer>() {
	            @Override
	            public Integer get(int index) {
	                return begin + index;
	            }

	            @Override
	            public int size() {
	                return end+1 - begin;
	            }
	        };
	}
	
	
}
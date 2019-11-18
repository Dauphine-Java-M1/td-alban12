package fr.dauphine.ja.tiacohalban.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Panel implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args)
	{
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
	}
	
	public static Iterator<Integer> panel1(int a,int b)
	{
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=a;i<=b;i++) li.add(i);
		return li.iterator();
	}
}
package fr.dauphine.ja.tiacohalban.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mult {
	
	/*
	 * private static ArrayList<Integer> mult(int x,List<Integer> l) {
	 * ArrayList<Integer> l2 = new ArrayList<Integer>(); for (Integer i:l) {
	 * l2.add(i*x); } return l2; }
	 */
	
	private static List<Integer> mult(final int x,final List<Integer> l) 
	{
		return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return l.get(index)*x;
            }

            @Override
            public int size() {
                return l.size();
            }
        };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(2,3,5);
		List<Integer> l2 = mult(3,l1);
		for (int i:l2)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		   for (int i = 0; i < 1000000; i++) {
		al.add(i); }
		long t0 = System.nanoTime(); List<Integer> ret = Mult.mult(2, al); long sum=0;
		for(int val : ret) {
		     sum+=val/2;
		   }
		System.out.println((System.nanoTime() - t0));
		   LinkedList<Integer> ll = new LinkedList<Integer>();
		   for (int i = 0; i < 1000000; i++) {
		ll.add(i); }
		t0 = System.nanoTime(); sum=0;
		ret = Mult.mult(2, ll); for(int val : ret) {
		     sum+=val/2;
		   }
		System.out.println((System.nanoTime() - t0));

	}
	
}

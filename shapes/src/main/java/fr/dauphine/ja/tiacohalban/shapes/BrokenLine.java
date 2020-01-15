package fr.dauphine.ja.tiacohalban.shapes;

import java.util.LinkedList;

public class BrokenLine {
	//private int n;
	//private Point tabpoint[];
	private LinkedList<Point> tabpoint;
	public BrokenLine()
	{
	//	tabpoint = new LinkedList<>();
	}
	/*public BrokenLine(int n)
	{
		this.n=n;
		tabpoint=new Point[n];
	}*/
	public void add(Point p1)
	{
		/*int i=0;
		for (Point p: this.tabpoint)
		{	
			if (p == null) 
				{
					this.tabpoint[i]=p1;
					break;
				}
			i++;
		}*/
		tabpoint.add(p1);
	}
	/*public int pointCapacity()
	{
		return this.n+1;
	}*/
	public int nbPoints()
	{
		int k=0;
		for (Point p:this.tabpoint)
		{
			if (p!=null) k++;
		}
		return k;
	}
	public boolean contains(Point p)
	{
		boolean in=false;
		for (Point p1:this.tabpoint)
		{
			if (p1.equals(p)) in=true;
		}
		return in;
	}
	public LinkedList<Point> getPoints()
	{
		return this.tabpoint;
	}
}

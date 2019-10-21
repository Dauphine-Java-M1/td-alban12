package fr.dauphine.ja.tiacohalban.shapes;

import java.util.List;

public class Circle {
	protected Point centre;
	protected double rayon;
	public Circle()
	{
		this.centre=new Point();
		rayon=0;
	}
	public Circle(Point p, double rayon)
	{
		this.centre= new Point(p.getX(),p.getY());
		this.rayon=rayon;
	}
	public void translate(double dx,double dy)
	{
		this.centre.translate(dx, dy);
	}
	
	@Override
	public String toString()
	{
		return "centre :"+this.centre.toString()+" de rayon "+this.rayon;
	}
	
	public Point getCenter()
	{
		return this.centre;
	}
	public double surface()
	{
		return 3.1415*this.rayon*this.rayon;
	}
	public boolean contains(Point p)
	{
		if (Math.sqrt(Math.pow((p.getX()-this.centre.getX()),2)+Math.pow((p.getY()-this.centre.getY()),2))<=this.rayon)
			return true;
		return false;
	}
	public static boolean contains(Point p, Circle...circles)
	{
		for (Circle c:circles)
		{
			if (c.contains(p)) return true;
		}
		return false;
	}
}

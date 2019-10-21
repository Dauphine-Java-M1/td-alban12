package fr.dauphine.ja.tiacohalban.shapes;

import java.util.List;

public class Ring extends Circle {
	private double rayoninterne;
	public Ring(Point p,double rayon,double rayoninterne)
		throws RayonException
		{
			if (rayoninterne>rayon) throw new RayonException();
				this.centre=p;
				this.rayon=rayon;
				this.rayoninterne=rayoninterne;
		
		}
	public Ring() {
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object r)
	{
		if (!(r instanceof Ring)) return false;
		Ring c = (Ring)r;
		return this.rayon==c.rayon && this.rayoninterne==c.rayoninterne && this.centre.equals(c.centre);
	}
	public boolean contains(Point p)
	{
		if (super.contains(p) && !(Math.sqrt(Math.pow((p.getX()-this.centre.getX()),2)+Math.pow((p.getY()-this.centre.getY()),2))<=this.rayoninterne))
			return true;
		else 
		return false;
	}
	public static boolean contains(Point p,Ring...rings)
	{
		for (Ring r:rings)
		{
			if (r.contains(p))
				return true;
		}
		return false;
		
	}
	public String toString()
	{
		return super.toString()+" et de rayon interne "+this.rayoninterne ;
	}
}

